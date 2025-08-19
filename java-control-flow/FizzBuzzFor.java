// Program: FizzBuzzFor
// Purpose: FizzBuzz using for loop up to N (N must be positive).
import java.util.Scanner;

class FizzBuzzFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n <= 0) { System.out.println("Enter a positive integer."); input.close(); return; }
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
        input.close();
    }
}
