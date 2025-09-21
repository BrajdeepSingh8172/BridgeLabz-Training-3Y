package cabbygo;

abstract class Vehicle {
    private String vehicleNumber;
    private int capacity;
    private String type;

    public Vehicle(String vehicleNumber, int capacity, String type) {
        this.vehicleNumber = vehicleNumber; this.capacity = capacity; this.type = type;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public int getCapacity() { return capacity; }
    public String getType() { return type; }

    public double baseFare() {
        switch(type) {
            case "Mini": return 50;
            case "Sedan": return 80;
            case "SUV": return 120;
            default: return 60;
        }
    }

    public abstract double calcFare(double distance);
}

class Mini extends Vehicle {
    public Mini(String num) { super(num, 4, "Mini"); }
    public double calcFare(double distance) { return baseFare() + distance * 10; }
}

class Sedan extends Vehicle {
    public Sedan(String num) { super(num, 4, "Sedan"); }
    public double calcFare(double distance) { return baseFare() + distance * 15; }
}

class Driver {
    private String name;
    private String licenseNumber;
    private double rating;

    public Driver(String name, String licenseNumber, double rating) {
        this.name = name; this.licenseNumber = licenseNumber; this.rating = rating;
    }
}

interface IRideService {
    String bookRide(Driver driver, Vehicle vehicle, double distance);
    double endRide(String rideId);
}

class RideService implements IRideService {
    public String bookRide(Driver driver, Vehicle vehicle, double distance) {
        double fare = vehicle.calcFare(distance);
        return "RIDE-" + Math.abs((driver.hashCode()+vehicle.getVehicleNumber().hashCode())) + ":fare=" + fare;
    }
    public double endRide(String rideId) {
        // parse fare from id for this demo
        if (rideId.contains("fare=")) {
            String[] parts = rideId.split("fare="); return Double.parseDouble(parts[1]);
        }
        return 0;
    }
}

public class CabbyGoDemo {
    public static void main(String[] args) {
        Driver d = new Driver("Kumar", "DL1234", 4.7);
        Vehicle v = new Sedan("MH12AB1234");
        RideService rs = new RideService();
        String rideId = rs.bookRide(d, v, 12.5);
        System.out.println("Booked: " + rideId);
        System.out.println("Fare on end: " + rs.endRide(rideId));
    }
}
