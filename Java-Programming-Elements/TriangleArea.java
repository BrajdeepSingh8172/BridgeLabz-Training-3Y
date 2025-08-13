
// Program to calculate area of a triangle in sq inches and sq centimeters
import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        // Constants
        double cmPerInch = 2.54;

        // Area in square centimeters
        double areaSqCm = 0.5 * base * height;
        // Convert to square inches
        double areaSqIn = areaSqCm / (cmPerInch * cmPerInch);

        // Display results
        System.out.println("The Area of the triangle in sq in is " + areaSqIn + " and sq cm is " + areaSqCm);
    }
}
