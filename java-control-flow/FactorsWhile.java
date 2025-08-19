// Program: FactorsWhile
// Purpose: Print all factors of a positive integer using while loop.
import java.util.Scanner;

class FactorsWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number <= 0) { System.out.println("Enter a positive integer."); input.close(); return; }
        int i = 1;
        while (i <= number) { if (number % i == 0) System.out.println(i); i++; }
        input.close();
    }
}
