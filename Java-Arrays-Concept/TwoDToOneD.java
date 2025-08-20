
// Program: Copy 2D Array to 1D Array
// Description: Reads a matrix and flattens to 1D

import java.util.Scanner;

public class TwoDToOneD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = input.nextInt();
        System.out.print("Enter columns: ");
        int cols = input.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.err.println("Invalid size.");
            System.exit(0);
        }

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        int[] array = new int[rows * cols];
        int idx = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[idx++] = matrix[i][j];
            }
        }

        System.out.println("Flattened 1D array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? " " : "\n"));
        }
        input.close();
    }
}
