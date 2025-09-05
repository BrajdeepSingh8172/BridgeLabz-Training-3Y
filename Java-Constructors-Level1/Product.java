/**
 * Instance vs Class - Problem 1: Product Inventory
 */
public class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0; // class variable

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product[name=" + productName + ", price=" + price + "]");
    }

    public static void displayTotalProducts() {
        System.out.println("Total products created: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Keyboard", 799.0);
        Product p2 = new Product("Mouse", 399.0);
        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();
    }
}