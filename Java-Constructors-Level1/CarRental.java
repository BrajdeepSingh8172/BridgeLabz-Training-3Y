/**
 * Program 6: CarRental - constructors and total cost calculation.
 */
public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double totalCost;

    public CarRental() {
        this("Customer", "Hatchback", 1);
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.totalCost = computeCost(carModel, rentalDays);
    }

    private double computeCost(String model, int days) {
        double perDay = switch (model.toLowerCase()) {
            case "suv" -> 2500.0;
            case "sedan" -> 1800.0;
            default -> 1200.0; // hatchback etc.
        };
        return perDay * Math.max(1, days);
    }

    public void display() {
        System.out.println("CarRental[customer=" + customerName + ", model=" + carModel +
                ", days=" + rentalDays + ", totalCost=" + totalCost + "]");
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental();
        CarRental r2 = new CarRental("Isha", "SUV", 5);
        r1.display();
        r2.display();
    }
}