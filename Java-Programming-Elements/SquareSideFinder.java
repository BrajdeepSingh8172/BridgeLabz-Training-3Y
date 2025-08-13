
// Program to find the side of the square given the perimeter
import java.util.Scanner;

class SquareSideFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Calculate side
        double side = perimeter / 4;

        // Display results
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
