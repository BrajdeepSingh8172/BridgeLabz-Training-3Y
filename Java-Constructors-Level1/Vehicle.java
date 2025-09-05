/**
 * Instance vs Class - Problem 3: Vehicle Registration
 */
public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 1500.0; // shared

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Vehicle[owner=" + ownerName + ", type=" + vehicleType +
                ", registrationFee=" + registrationFee + "]");
    }

    public static void updateRegistrationFee(double newFee) {
        if (newFee <= 0) throw new IllegalArgumentException("Fee must be positive.");
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Riya", "Two-Wheeler");
        Vehicle v2 = new Vehicle("Kabir", "Four-Wheeler");
        v1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(2000.0);
        v2.displayVehicleDetails();
        v1.displayVehicleDetails();
    }
}