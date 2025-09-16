import java.util.*;

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }
}

class Customer {
    private String name;
    private List<Account> accounts = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addAccount(Account acc) {
        accounts.add(acc);
    }

    public void viewBalance() {
        System.out.println("Customer: " + name);
        for (Account acc : accounts) {
            System.out.println("Account " + acc.getAccountNumber() + ": " + acc.getBalance());
        }
    }
}

class Bank {
    private String name;
    private List<Customer> customers = new ArrayList<>();

    public Bank(String name) { this.name = name; }

    public void openAccount(Customer customer, Account account) {
        customer.addAccount(account);
        if (!customers.contains(customer)) customers.add(customer);
    }

    public void showCustomers() {
        System.out.println("Bank: " + name);
        for (Customer c : customers) {
            c.viewBalance();
        }
    }
}

public class BankCustomers {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI");
        Customer cust1 = new Customer("Ravi");
        Account acc1 = new Account("1001", 5000);
        bank.openAccount(cust1, acc1);
        bank.showCustomers();
    }
}