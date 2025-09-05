/**
 * Program 1: Book - default and parameterized constructors.
 * Demonstrates basic constructor overloading.
 */
public class Book {
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this("Untitled", "Unknown", 0.0);
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Book[title=" + title + ", author=" + author + ", price=" + price + "]");
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Clean Code", "Robert C. Martin", 499.0);
        b1.display();
        b2.display();
    }
}