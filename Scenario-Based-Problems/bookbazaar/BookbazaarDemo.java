package bookbazaar;

import java.util.*;

interface IDiscountable {
    double applyDiscount(double price);
}

abstract class Book {
    protected String title;
    protected String author;
    protected double price;
    protected int stock;

    public Book(String title, String author, double price, int stock) {
        this.title=title; this.author=author; this.price=price; this.stock=stock;
    }

    public boolean updateStock(int qty) { if (qty<0 && -qty>stock) return false; stock += qty; return true; }
    public abstract double applyDiscount(double price);
}

class EBook extends Book {
    public EBook(String t,String a,double p,int s){ super(t,a,p,s); }
    @Override public double applyDiscount(double price){ return price * 0.9; } // 10% off
}

class PrintedBook extends Book {
    public PrintedBook(String t,String a,double p,int s){ super(t,a,p,s); }
    @Override public double applyDiscount(double price){ return price - 50; } // flat 50 off
}

class Order {
    private String orderId;
    private Map<Book,Integer> items = new HashMap<>();
    public Order(String orderId){ this.orderId=orderId; }

    public void add(Book b, int qty) { items.put(b, qty); }

    public double total() {
        double tot=0;
        for (Map.Entry<Book,Integer> e: items.entrySet()) {
            Book b = e.getKey(); int q = e.getValue();
            tot += b.applyDiscount(b.price) * q;
        }
        return tot;
    }
}

public class BookBazaarDemo {
    public static void main(String[] args) {
        EBook eb = new EBook("Java 101","Author A",300,100);
        PrintedBook pb = new PrintedBook("Algorithms","Author B",800,10);
        Order o = new Order("O1"); o.add(eb,1); o.add(pb,2);
        System.out.println("Order total: " + o.total());
    }
}
