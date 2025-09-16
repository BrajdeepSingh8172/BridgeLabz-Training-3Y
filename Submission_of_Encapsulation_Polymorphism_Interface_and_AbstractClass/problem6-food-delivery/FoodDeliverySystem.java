import java.util.*;

interface Discountable {
    double applyDiscount(double amount);
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName; this.price = price; this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public String getItemDetails() {
        return itemName + " x" + quantity + " @ Rs." + price;
    }

    public abstract double calculateTotalPrice();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) { super(name,price,qty); }

    @Override
    public double calculateTotalPrice() { return getPrice() * getQuantity(); }

    @Override
    public double applyDiscount(double amount) { return amount * 0.05; }

    @Override
    public String getDiscountDetails() { return "5% veg discount"; }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int qty) { super(name,price,qty); }

    @Override
    public double calculateTotalPrice() { return getPrice() * getQuantity() + 50; } // extra charge
    @Override
    public double applyDiscount(double amount) { return amount * 0.02; }
    @Override
    public String getDiscountDetails() { return "2% non-veg discount"; }
}

public class FoodDeliverySystem {
    public static double calculateOrderTotal(List<FoodItem> items) {
        double total = 0;
        for (FoodItem f : items) {
            double amt = f.calculateTotalPrice();
            if (f instanceof Discountable) {
                amt -= ((Discountable)f).applyDiscount(amt);
            }
            total += amt;
        }
        return total;
    }

    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer Butter Masala", 220, 1));
        order.add(new NonVegItem("Chicken Biryani", 250, 1));

        for (FoodItem f : order) System.out.println(f.getItemDetails());

        System.out.println("Total Payable: Rs." + calculateOrderTotal(order));
    }
}