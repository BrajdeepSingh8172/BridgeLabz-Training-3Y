
// Program: Sum of Digits using Array
// Description: Computes sum of digits of a user entered number using an array

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number < 0) {
            System.err.println("Invalid Number.");
            System.exit(0);
        }

        int count = 0, temp = number;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }

        System.out.println("Sum of Digits: " + sum);
        input.close();
    }
}
