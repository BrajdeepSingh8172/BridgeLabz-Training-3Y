// Program: FibonacciSeries
// Purpose: Print first N Fibonacci numbers.
import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n <= 0) { input.close(); return; }
        long a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            long c = a + b; a = b; b = c;
        }
        input.close();
    }
}
