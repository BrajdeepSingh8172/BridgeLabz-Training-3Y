// Program: FizzBuzzWhile
// Purpose: FizzBuzz using while loop up to N (N must be positive).
import java.util.Scanner;

class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n <= 0) { System.out.println("Enter a positive integer."); input.close(); return; }
        int i = 1;
        while (i <= n) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
            i++;
        }
        input.close();
    }
}
