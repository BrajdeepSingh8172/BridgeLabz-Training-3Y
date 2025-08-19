// Program: GreatestFactorWhile
// Purpose: Print the greatest proper factor using while loop.
import java.util.Scanner;

class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number <= 1) { System.out.println("Greatest proper factor = 1"); input.close(); return; }
        int counter = number - 1; int greatestFactor = 1;
        while (counter >= 1) {
            if (number % counter == 0) { greatestFactor = counter; break; }
            counter--;
        }
        System.out.println("Greatest proper factor = " + greatestFactor);
        input.close();
    }
}
