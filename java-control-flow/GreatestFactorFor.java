// Program: GreatestFactorFor
// Purpose: Print the greatest proper factor using for loop (descending search).
import java.util.Scanner;

class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number <= 1) { System.out.println("Greatest proper factor = 1"); input.close(); return; }
        int greatestFactor = 1;
        for (int i = number - 1; i >= 1; i--) if (number % i == 0) { greatestFactor = i; break; }
        System.out.println("Greatest proper factor = " + greatestFactor);
        input.close();
    }
}
