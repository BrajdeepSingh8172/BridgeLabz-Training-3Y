import java.util.*;

class Product {
    private String name;
    private double price;
    public Product(String name, double price) {
        this.name = name; this.price = price;
    }
    public String getName() { return name; }
    public double getPrice() { return price; }
}

class Order {
    private List<Product> products = new ArrayList<>();
    public void addProduct(Product p) { products.add(p); }
    public void showOrder() {
        System.out.println("Order contains:");
        for (Product p : products) {
            System.out.println(p.getName() + " - Rs." + p.getPrice());
        }
    }
}

class Customer {
    private String name;
    public Customer(String name) { this.name = name; }
    public void placeOrder(Order o) {
        System.out.println("Customer " + name + " placed an order.");
        o.showOrder();
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {
        Customer c = new Customer("Rohan");
        Order o = new Order();
        o.addProduct(new Product("Laptop", 60000));
        o.addProduct(new Product("Phone", 20000));
        c.placeOrder(o);
    }
}