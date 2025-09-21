package swiftcart;

import java.util.*;

interface ICheckout {
    double generateBill();
    double applyDiscount(double coupon);
}

class Product {
    protected String name;
    protected double price;
    protected String category;
    public Product(String name, double price, String category) { this.name=name; this.price=price; this.category=category; }
}

class PerishableProduct extends Product {
    public PerishableProduct(String name, double price) { super(name, price, "Perishable"); }
}

class NonPerishableProduct extends Product {
    public NonPerishableProduct(String name, double price) { super(name, price, "NonPerishable"); }
}

class Cart implements ICheckout {
    private List<Product> items = new ArrayList<>();
    private double totalPrice = 0.0;

    public Cart() {}
    public Cart(List<Product> items) { this.items.addAll(items); recalc(); }

    public void add(Product p) { items.add(p); recalc(); }
    private void recalc() { totalPrice = 0; for (Product p: items) totalPrice += p.price; }

    public double generateBill() { return totalPrice; }
    public double applyDiscount(double coupon) {
        double after = totalPrice - coupon;
        if (after < 0) after = 0;
        return after;
    }
}

public class SwiftCartDemo {
    public static void main(String[] args) {
        Product p1 = new PerishableProduct("Milk", 40);
        Product p2 = new NonPerishableProduct("Soap", 30);
        Cart cart = new Cart();
        cart.add(p1); cart.add(p2);
        System.out.println("Bill: " + cart.generateBill());
        System.out.println("After coupon: " + cart.applyDiscount(20));
    }
}
