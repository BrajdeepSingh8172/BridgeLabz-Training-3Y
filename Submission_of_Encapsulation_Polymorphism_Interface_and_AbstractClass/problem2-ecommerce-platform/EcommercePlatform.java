import java.util.*;

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        setPrice(price);
    }

    public String getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public void setPrice(double price) { if (price >= 0) this.price = price; }

    public abstract double calculateDiscount();

    public double finalPrice() {
        double discount = calculateDiscount();
        double taxed = (this instanceof Taxable) ? ((Taxable)this).calculateTax() : 0;
        return price + taxed - discount;
    }
}

class Electronics extends Product implements Taxable {
    public Electronics(String id, String name, double price) { super(id, name, price); }

    @Override
    public double calculateDiscount() { return getPrice() * 0.10; }

    @Override
    public double calculateTax() { return getPrice() * 0.18; }

    @Override
    public String getTaxDetails() { return "GST 18% on Electronics"; }
}

class Clothing extends Product implements Taxable {
    public Clothing(String id, String name, double price) { super(id, name, price); }

    @Override
    public double calculateDiscount() { return getPrice() * 0.20; }

    @Override
    public double calculateTax() { return getPrice() * 0.05; }

    @Override
    public String getTaxDetails() { return "GST 5% on Clothing"; }
}

class Groceries extends Product {
    public Groceries(String id, String name, double price) { super(id, name, price); }

    @Override
    public double calculateDiscount() { return 0; }
}

public class EcommercePlatform {
    public static void printFinalPrices(List<Product> products) {
        for (Product p : products) {
            System.out.println(p.getName() + " -> Final Price: Rs." + p.finalPrice());
            if (p instanceof Taxable) System.out.println(((Taxable)p).getTaxDetails());
        }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics("P100","Laptop",60000));
        products.add(new Clothing("P200","T-Shirt",799));
        products.add(new Groceries("P300","Rice",1200));

        printFinalPrices(products);
    }
}