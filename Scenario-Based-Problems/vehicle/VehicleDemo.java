package vehicle;

interface Rentable {
    double calculateRent(int days);
}

abstract class Vehicle {
    protected String vehicleNumber;
    protected int capacity;
    protected double baseRate;

    public Vehicle(String vehicleNumber, int capacity, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.baseRate = baseRate;
    }

    public abstract double calculateRent(int days);

    public void display() {
        System.out.println("Vehicle[" + vehicleNumber + ", cap=" + capacity + ", rate=" + baseRate + "]");
    }
}

class Bike extends Vehicle implements Rentable {
    public Bike(String vehicleNumber, double baseRate) {
        super(vehicleNumber, 2, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        return baseRate * days; // simple
    }
}

class Car extends Vehicle implements Rentable {
    public Car(String vehicleNumber, int capacity, double baseRate) {
        super(vehicleNumber, capacity, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        double surcharge = (capacity > 4) ? 50 : 0;
        return baseRate * days + surcharge * days;
    }
}

class Truck extends Vehicle implements Rentable {
    public Truck(String vehicleNumber, int capacity, double baseRate) {
        super(vehicleNumber, capacity, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        return baseRate * days + 200 * days; // loading charges
    }
}

class Customer {
    private String name;
    private String id;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void rent(Vehicle v, int days) {
        System.out.println(name + " renting " + v.vehicleNumber + " for " + days + " days. Rent=" + v.calculateRent(days));
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Bike b = new Bike("B001", 300);
        Car c = new Car("C001", 5, 1500);
        Truck t = new Truck("T001", 2, 5000);
        Customer cust = new Customer("CU01", "Rahul");
        cust.rent(b, 3);
        cust.rent(c, 2);
        cust.rent(t, 1);
    }
}
