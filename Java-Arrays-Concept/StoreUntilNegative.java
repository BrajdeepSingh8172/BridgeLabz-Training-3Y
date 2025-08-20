
// Program: Store Until Negative or 10 numbers
// Description: Stores up to 10 positive numbers and prints them with sum

import java.util.Scanner;

public class StoreUntilNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] values = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter a number (<=0 to stop): ");
            double val = input.nextDouble();

            if (val <= 0) break;
            if (index == values.length) break;

            values[index] = val;
            index++;
        }

        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(values[i] + (i < index - 1 ? ", " : "\n"));
            total += values[i];
        }

        System.out.println("Sum of numbers: " + total);
        input.close();
    }
}
