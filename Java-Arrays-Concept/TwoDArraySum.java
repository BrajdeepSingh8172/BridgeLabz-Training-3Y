
// Program: 2D Array Sum
// Description: Creates a 2D array, displays elements, and computes sum

import java.util.Scanner;

public class TwoDArraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.err.println("Invalid Matrix Size.");
            System.exit(0);
        }

        int[][] arr = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        int sum = 0;
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
            System.out.println();
        }

        System.out.println("Sum of elements: " + sum);
        input.close();
    }
}
