import java.util.*;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId; this.driverName = driverName; this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    public void getVehicleDetails() {
        System.out.println(vehicleId + " - " + driverName + " @ Rs." + ratePerKm + "/km");
    }

    public abstract double calculateFare(double distance);
}

class Car extends Vehicle implements GPS {
    private String location = "Unknown";
    public Car(String id, String driver, double rate) { super(id, driver, rate); }
    @Override
    public double calculateFare(double distance) { return getRatePerKm() * distance; }
    @Override
    public String getCurrentLocation() { return location; }
    @Override
    public void updateLocation(String newLocation) { this.location = newLocation; }
}

class Bike extends Vehicle implements GPS {
    private String location = "Unknown";
    public Bike(String id, String driver, double rate) { super(id, driver, rate); }
    @Override
    public double calculateFare(double distance) { return getRatePerKm() * distance * 0.6; }
    @Override
    public String getCurrentLocation() { return location; }
    @Override
    public void updateLocation(String newLocation) { this.location = newLocation; }
}

class Auto extends Vehicle implements GPS {
    private String location = "Unknown";
    public Auto(String id, String driver, double rate) { super(id, driver, rate); }
    @Override
    public double calculateFare(double distance) { return getRatePerKm() * distance * 0.8; }
    @Override
    public String getCurrentLocation() { return location; }
    @Override
    public void updateLocation(String newLocation) { this.location = newLocation; }
}

public class RideHailingApp {
    public static void main(String[] args) {
        List<Vehicle> fleet = Arrays.asList(
            new Car("V1","Rahul",20),
            new Bike("V2","Asha",10),
            new Auto("V3","Ramesh",15)
        );

        for (Vehicle v : fleet) {
            v.getVehicleDetails();
            System.out.println("Fare for 12.5 km: Rs." + v.calculateFare(12.5));
            if (v instanceof GPS) {
                ((GPS)v).updateLocation("Downtown");
                System.out.println("Location: " + ((GPS)v).getCurrentLocation());
            }
            System.out.println();
        }
    }
}