// Program: FactorsFor
// Purpose: Print all factors of a positive integer using for loop.
import java.util.Scanner;

class FactorsFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number <= 0) { System.out.println("Enter a positive integer."); input.close(); return; }
        for (int i = 1; i <= number; i++) if (number % i == 0) System.out.println(i);
        input.close();
    }
}
