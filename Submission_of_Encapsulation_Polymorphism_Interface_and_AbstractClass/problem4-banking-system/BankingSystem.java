import java.util.*;

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility(double amount);
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) { if (amount>0) balance += amount; }
    public boolean withdraw(double amount) { if (amount>0 && amount<=balance) { balance -= amount; return true; } return false; }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate = 0.04;

    public SavingsAccount(String acc, String name, double bal) { super(acc,name,bal); }

    @Override
    public double calculateInterest() { return getBalance() * interestRate; }

    @Override
    public void applyForLoan(double amount) {
        System.out.println(getHolderName() + " applied for loan Rs." + amount);
    }

    @Override
    public boolean calculateLoanEligibility(double amount) {
        return getBalance() > amount * 0.2;
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String acc, String name, double bal) { super(acc,name,bal); }

    @Override
    public double calculateInterest() { return 0; } // usually no interest
}

public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        SavingsAccount s = new SavingsAccount("SB1001","Neha",20000);
        CurrentAccount c = new CurrentAccount("CA2001","Kabir",5000);

        accounts.add(s); accounts.add(c);

        for (BankAccount a : accounts) {
            System.out.println(a.getHolderName() + " - Balance: " + a.getBalance() + " - Interest: " + a.calculateInterest());
            if (a instanceof Loanable) {
                System.out.println("Eligible for loan 50000? " + ((Loanable)a).calculateLoanEligibility(50000));
            }
        }

        s.applyForLoan(50000);
    }
}