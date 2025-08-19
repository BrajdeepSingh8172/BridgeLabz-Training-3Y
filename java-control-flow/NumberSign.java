// Program: NumberSign
// Purpose: Check whether a number is positive, negative, or zero.
import java.util.Scanner;

class NumberSign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number > 0) System.out.println("positive");
        else if (number < 0) System.out.println("negative");
        else System.out.println("zero");
        input.close();
    }
}
