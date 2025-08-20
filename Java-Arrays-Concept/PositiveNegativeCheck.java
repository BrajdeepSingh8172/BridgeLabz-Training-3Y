
// Program: Positive/Negative/Zero & Even/Odd
// Description: For 5 numbers, classify and compare first/last

import java.util.Scanner;

public class PositiveNegativeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even");
                } else {
                    System.out.println(num + " is Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }

        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("First and Last numbers are Equal");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First number is Greater than Last number");
        } else {
            System.out.println("First number is Less than Last number");
        }
        input.close();
    }
}
