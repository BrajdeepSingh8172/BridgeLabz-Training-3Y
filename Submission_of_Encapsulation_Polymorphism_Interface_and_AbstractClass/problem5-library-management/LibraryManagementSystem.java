import java.util.*;

interface Reservable {
    boolean reserveItem(String userId);
    boolean checkAvailability();
}

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId; this.title = title; this.author = author;
    }

    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public void getItemDetails() {
        System.out.println(itemId + ": " + title + " by " + author);
    }

    public abstract int getLoanDuration();
}

class Book extends LibraryItem implements Reservable {
    private boolean reserved = false;

    public Book(String id, String title, String author) { super(id,title,author); }

    @Override
    public int getLoanDuration() { return 14; }

    @Override
    public boolean reserveItem(String userId) {
        if (!reserved) { reserved = true; System.out.println("Book reserved for " + userId); return true; }
        return false;
    }

    @Override
    public boolean checkAvailability() { return !reserved; }
}

class Magazine extends LibraryItem {
    public Magazine(String id, String title, String author) { super(id,title,author); }
    @Override
    public int getLoanDuration() { return 7; }
}

class DVD extends LibraryItem {
    public DVD(String id, String title, String author) { super(id,title,author); }
    @Override
    public int getLoanDuration() { return 3; }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        Book b = new Book("B001","Clean Code","Robert C. Martin");
        Magazine m = new Magazine("M001","Time","Editorial");
        DVD d = new DVD("D001","Inception","Nolan");

        items.add(b); items.add(m); items.add(d);

        for (LibraryItem li : items) {
            li.getItemDetails();
            System.out.println("Loan days: " + li.getLoanDuration());
        }

        b.reserveItem("User123");
        System.out.println("Available? " + b.checkAvailability());
    }
}