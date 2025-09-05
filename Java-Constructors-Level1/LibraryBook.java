/**
 * Program 5: LibraryBook - availability with borrow method.
 */
public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public LibraryBook() {
        this("Untitled", "Unknown", 0.0, true);
    }

    public LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public boolean borrow() {
        if (available) {
            available = false;
            return true;
        }
        return false;
    }

    public void display() {
        System.out.println("LibraryBook[title=" + title + ", author=" + author +
                ", price=" + price + ", available=" + available + "]");
    }

    public static void main(String[] args) {
        LibraryBook b = new LibraryBook("Java: A Beginner's Guide", "Schildt", 650.0, true);
        b.display();
        System.out.println("Borrowed? " + b.borrow());
        System.out.println("Borrowed again? " + b.borrow());
        b.display();
    }
}