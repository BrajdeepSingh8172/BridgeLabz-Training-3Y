package ewallet;

import java.util.*;

interface Transferrable {
    boolean transferTo(User receiver, double amount);
}

class Transaction {
    private String fromId;
    private String toId;
    private double amount;
    private Date time;

    public Transaction(String from, String to, double amount) {
        this.fromId = from; this.toId = to; this.amount = amount; this.time = new Date();
    }

    @Override
    public String toString() {
        return "Tx[from="+fromId+", to="+toId+", amt="+amount+", time="+time+"]";
    }
}

class Wallet implements Transferrable {
    private double balance;
    private List<Transaction> history = new ArrayList<>();
    private String ownerId;

    public Wallet(String ownerId) {
        this(ownerId, 0.0, 0.0);
    }

    public Wallet(String ownerId, double opening, double referralBonus) {
        this.ownerId = ownerId;
        this.balance = opening + referralBonus;
    }

    public double getBalance() { return balance; }

    public void loadMoney(double amt) { balance += amt; history.add(new Transaction("external", ownerId, amt)); }

    @Override
    public boolean transferTo(User receiver, double amount) {
        if (amount <= 0 || amount > balance) return false;
        balance -= amount;
        receiver.getWallet().balance += amount;
        Transaction t = new Transaction(ownerId, receiver.getId(), amount);
        history.add(t); receiver.getWallet().history.add(t);
        return true;
    }

    public List<Transaction> getHistory() { return Collections.unmodifiableList(history); }
}

class User {
    private String id;
    private String name;
    private Wallet wallet;

    public User(String id, String name, double opening, double referral) {
        this.id = id; this.name = name; this.wallet = new Wallet(id, opening, referral);
    }

    public String getId() { return id; }
    public Wallet getWallet() { return wallet; }
}

public class EWalletDemo {
    public static void main(String[] args) {
        User u1 = new User("U1", "Amit", 1000, 50);
        User u2 = new User("U2", "Sonia", 0, 0);
        System.out.println("Balance U1: " + u1.getWallet().getBalance());
        u1.getWallet().transferTo(u2, 200);
        System.out.println("After transfer U1: " + u1.getWallet().getBalance());
        System.out.println("U2 balance: " + u2.getWallet().getBalance());
        System.out.println("U1 history: " + u1.getWallet().getHistory());
    }
}
