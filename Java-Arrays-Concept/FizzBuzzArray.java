
// Program: FizzBuzz into Array
// Description: Saves fizz/buzz values in String array and prints positions

import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer N: ");
        int n = input.nextInt();

        if (n < 0) {
            System.err.println("Invalid input.");
            System.exit(0);
        }

        String[] results = new String[n + 1];

        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                results[i] = "0";
            } else if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        for (int i = 1; i < results.length; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
        input.close();
    }
}
