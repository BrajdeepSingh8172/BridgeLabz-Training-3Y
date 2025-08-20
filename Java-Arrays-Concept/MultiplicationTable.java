
// Program: Multiplication Table (1 to 10)
// Description: Prints multiplication table of a given number

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

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
