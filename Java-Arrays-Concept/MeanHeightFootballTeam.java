
// Program: Mean Height of Football Team
// Description: Reads 11 player heights and computes mean

import java.util.Scanner;

public class MeanHeightFootballTeam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;

        System.out.println("Enter heights of 11 players:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
            sum += heights[i];
        }

        double mean = sum / heights.length;
        System.out.printf("Mean Height: %.2f\n", mean);
        input.close();
    }
}
