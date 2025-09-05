/**
 * Access Modifiers - Problem 3: Bank Account Management
 */
class BankAccount {
    public String accountNumber;     // public
    protected String accountHolder;  // protected
    private double balance;          // private

    public BankAccount(String accountNumber, String accountHolder, double openingBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        deposit(openingBalance);
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Amount must be non-negative.");
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Amount must be non-negative.");
        if (amount > balance) throw new IllegalArgumentException("Insufficient funds.");
        balance -= amount;
    }
}

public class SavingsAccount extends BankAccount {
    private double interestRate; // annual in %

    public SavingsAccount(String accountNumber, String accountHolder, double openingBalance, double interestRate) {
        super(accountNumber, accountHolder, openingBalance);
        this.interestRate = interestRate;
    }

    public void applyAnnualInterest() {
        double interest = getBalance() * (interestRate / 100.0);
        deposit(interest);
    }

    public void display() {
        System.out.println("SavingsAccount[accNo=" + accountNumber + ", holder=" + accountHolder +
                ", balance=" + getBalance() + "]");
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SB-001", "Rahul", 5000.0, 6.0);
        sa.applyAnnualInterest();
        sa.display();
    }
}