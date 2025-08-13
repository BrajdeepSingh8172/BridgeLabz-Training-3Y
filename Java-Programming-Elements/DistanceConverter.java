
// Program to convert distance in feet to yards and miles
import java.util.Scanner;

class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Constants
        double feetPerYard = 3.0;
        double yardsPerMile = 1760.0;

        // Conversions
        double distanceInYards = distanceInFeet / feetPerYard;
        double distanceInMiles = distanceInYards / yardsPerMile;

        // Display results
        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);
    }
}
