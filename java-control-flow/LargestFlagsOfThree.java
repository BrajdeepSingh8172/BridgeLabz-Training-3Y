// Program: LargestFlagsOfThree
// Purpose: Indicate whether first, second, or third is the largest among three numbers (ties allowed).
import java.util.Scanner;

class LargestFlagsOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int max = Math.max(number1, Math.max(number2, number3));
        System.out.println("Is the first number the largest? " + (number1 == max));
        System.out.println("Is the second number the largest? " + (number2 == max));
        System.out.println("Is the third number the largest? " + (number3 == max));
        input.close();
    }
}
