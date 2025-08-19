// Program: PowerOfNumber_For
// Purpose: Compute number^power using for loop.
import java.util.Scanner;

class PowerOfNumber_For {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number = input.nextLong();
        long power = input.nextLong();
        if (power < 0) { System.out.println("Power must be non-negative."); input.close(); return; }
        long result = 1;
        for (long i = 1; i <= power; i++) result *= number;
        System.out.println(number + "^" + power + " = " + result);
        input.close();
    }
}
