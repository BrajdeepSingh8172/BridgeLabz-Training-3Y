/**
 * Program 4: HotelBooking - default, parameterized, and copy constructors.
 */
public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;
    private double totalCost;

    // Default constructor
    public HotelBooking() {
        this("Guest", "Standard", 1);
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
        this.totalCost = calculateCost(roomType, nights);
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this(other.guestName, other.roomType, other.nights);
    }

    private double calculateCost(String roomType, int nights) {
        double base = switch (roomType.toLowerCase()) {
            case "deluxe" -> 3000.0;
            case "suite" -> 5000.0;
            default -> 2000.0; // standard
        };
        return base * Math.max(1, nights);
    }

    public void display() {
        System.out.println("HotelBooking[guest=" + guestName + ", roomType=" + roomType +
                ", nights=" + nights + ", totalCost=" + totalCost + "]");
    }

    public static void main(String[] args) {
        HotelBooking h1 = new HotelBooking();
        HotelBooking h2 = new HotelBooking("Nitin", "Suite", 3);
        HotelBooking h3 = new HotelBooking(h2);
        h1.display();
        h2.display();
        h3.display();
    }
}