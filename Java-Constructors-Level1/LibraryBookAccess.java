/**
 * Access Modifiers - Problem 2: Book Library System
 */
class BookAccess {
    public String ISBN;        // public
    protected String title;    // protected
    private String author;     // private

    public BookAccess(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        setAuthor(author);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("Author cannot be empty.");
        }
        this.author = author;
    }
}

public class EBook extends BookAccess {
    private double fileSizeMB;

    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    public void display() {
        // Access to ISBN (public) and title (protected)
        System.out.println("EBook[ISBN=" + ISBN + ", title=" + title +
                ", author=" + getAuthor() + ", fileSizeMB=" + fileSizeMB + "]");
    }

    public static void main(String[] args) {
        EBook eb = new EBook("978-3-16-148410-0", "Effective Java", "Joshua Bloch", 5.2);
        eb.display();
    }
}