
// Program: Factors of a Number
// Description: Finds and stores factors in a dynamically grown array

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.err.println("Invalid input.");
            System.exit(0);
        }

        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == factors.length) {
                    int[] temp = new int[factors.length * 2];
                    for (int k = 0; k < factors.length; k++) {
                        temp[k] = factors[k];
                    }
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        System.out.print("Factors: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + (i < index - 1 ? ", " : "\n"));
        }
        input.close();
    }
}
