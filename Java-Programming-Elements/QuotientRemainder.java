
// Program to find quotient and remainder of two numbers
import java.util.Scanner;

class QuotientRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        // Calculate
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Display
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + number1 + " and " + number2);
    }
}
