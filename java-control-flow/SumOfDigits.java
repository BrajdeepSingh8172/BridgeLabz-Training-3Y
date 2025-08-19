// Program: SumOfDigits
// Purpose: Sum all digits of a given integer.
import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int origNumber = input.nextInt();
        int number = Math.abs(origNumber);
        int sum = 0;
        while (number != 0) { sum += number % 10; number /= 10; }
        System.out.println("The sum of digit of number: " + origNumber + " = " + sum);
        input.close();
    }
}
