class BankAccount {
    // Fields private banayi (data hide kiya)
    private String accountNumber;
    private double balance;

    // Constructor (jab account banega to values set hongi)
    public BankAccount(String accNumber, double initialBalance) {
        accountNumber = accNumber;
        balance = initialBalance;
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited.");
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    // Withdraw Method (with overdraft prevention)
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("₹" + amount + " withdrawn.");
            } else {
                System.out.println("Insufficient balance!");
            }
        } else {
            System.out.println("Withdrawal amount must be positive!");
        }
    }

    // Check Balance
    public void checkBalance() {
        System.out.println("Account " + accountNumber + " Balance: ₹" + balance);
    }

    // Getter for Account Number (no setter, kyunki account no change nahi hota)
    public String getAccountNumber() {
        return accountNumber;
    }
}

// Main class to test BankAccount
public class Bank_acc {
    public static void main(String[] args) {
        // Naya account banaya
        BankAccount acc1 = new BankAccount("ACC123", 5000);

        // Operations
        acc1.checkBalance();    // 5000 show karega
        acc1.deposit(2000);     // +2000
        acc1.withdraw(1000);    // -1000
        acc1.withdraw(7000);    // overdraft prevent
        acc1.checkBalance();    // final balance show
    }
}

    

