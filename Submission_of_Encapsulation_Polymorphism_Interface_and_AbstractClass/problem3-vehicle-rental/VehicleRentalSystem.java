import java.util.*;

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    public abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    public Car(String num, double rate) { super(num, "Car", rate); }

    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days; }

    @Override
    public double calculateInsurance() { return 1000; }

    @Override
    public String getInsuranceDetails() { return "Car insurance flat Rs.1000"; }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String num, double rate) { super(num, "Bike", rate); }

    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days * 0.6; }

    @Override
    public double calculateInsurance() { return 300; }

    @Override
    public String getInsuranceDetails() { return "Bike insurance flat Rs.300"; }
}

class Truck extends Vehicle {
    public Truck(String num, double rate) { super(num, "Truck", rate); }

    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days * 1.5; }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = Arrays.asList(
            new Car("MH12AB1234", 2000),
            new Bike("MH12XY4321", 500),
            new Truck("TRK1001", 5000)
        );

        for (Vehicle v : vehicles) {
            System.out.println(v.getType() + " " + v.getVehicleNumber() + 
                " - Rental for 3 days: Rs." + v.calculateRentalCost(3));
            if (v instanceof Insurable) {
                System.out.println(((Insurable)v).getInsuranceDetails() + " -> Rs." + ((Insurable)v).calculateInsurance());
            }
        }
    }
}