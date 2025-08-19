// Program: DivisibleByFive
// Purpose: Check if a number is divisible by 5 and print the required format.
import java.util.Scanner;

class DivisibleByFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean isDivisible = (number % 5 == 0);
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
        input.close();
    }
}
