
// Program: Odd and Even Arrays
// Description: Stores odd and even numbers up to N into separate arrays

import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number N: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.err.println("Error: Not a natural number.");
            System.exit(0);
        }

        int size = number / 2 + 1;
        int[] evens = new int[size];
        int[] odds = new int[size];
        int evenIndex = 0, oddIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evens[evenIndex++] = i;
            } else {
                odds[oddIndex++] = i;
            }
        }

        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odds[i] + (i < oddIndex - 1 ? ", " : "\n"));
        }

        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evens[i] + (i < evenIndex - 1 ? ", " : "\n"));
        }
        input.close();
    }
}
