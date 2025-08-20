
// Program: Multiplication Table (Only 6 to 9)
// Description: Validates input between 6 and 9 and prints table

import java.util.Scanner;

public class MultiplicationTable6to9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (6-9): ");
        int number = input.nextInt();

        if (number < 6 || number > 9) {
            System.err.println("Invalid input. Please enter a number between 6 and 9.");
            System.exit(0);
        }

        int[] table = new int[10];
        for (int i = 1; i <= table.length; i++) {
            table[i - 1] = number * i;
        }

        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }
        input.close();
    }
}
