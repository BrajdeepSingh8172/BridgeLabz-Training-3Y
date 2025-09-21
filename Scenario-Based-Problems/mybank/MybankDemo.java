package mybank;

interface ITransaction {
    void deposit(double amt);
    boolean withdraw(double amt);
    double checkBalance();
}

abstract class Account implements ITransaction {
    protected String accountNumber;
    private double balance;

    public Account(String accountNumber) { this(accountNumber, 0.0); }
    public Account(String accountNumber, double opening) { this.accountNumber = accountNumber; this.balance = opening; }

    public double checkBalance() { return balance; }
    public void deposit(double amt) { if (amt>0) balance += amt; }
    public boolean withdraw(double amt) { if (amt>0 && amt<=balance) { balance -= amt; return true; } return false; }

    protected void addInterest(double ratePercent) {
        balance += balance * ratePercent / 100.0;
    }
    public abstract void calculateInterest();
}

class SavingsAccount extends Account {
    private double interestRate;
    public SavingsAccount(String accNo, double opening, double rate) { super(accNo, opening); this.interestRate = rate; }
    public void calculateInterest() { addInterest(interestRate); }
}

class CurrentAccount extends Account {
    public CurrentAccount(String accNo, double opening) { super(accNo, opening); }
    public void calculateInterest() { /* usually none or minimal */ }
}

public class MyBankDemo {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("S001", 10000, 4.0);
        s.calculateInterest();
        System.out.println("Savings balance after interest: " + s.checkBalance());
        s.deposit(500); s.withdraw(200);
        System.out.println("Final: " + s.checkBalance());
    }
}
