// Program: PowerOfNumber_While
// Purpose: Compute number^power using while loop.
import java.util.Scanner;

class PowerOfNumber_While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number = input.nextLong();
        long power = input.nextLong();
        if (power < 0) { System.out.println("Power must be non-negative."); input.close(); return; }
        long result = 1, counter = 0;
        while (counter < power) { result *= number; counter++; }
        System.out.println(number + "^" + power + " = " + result);
        input.close();
    }
}
