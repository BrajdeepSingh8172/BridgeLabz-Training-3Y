// Program: PerfectNumber
// Purpose: Check whether a number is perfect (sum of proper divisors equals number).
import java.util.Scanner;

class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n <= 1) { System.out.println(false); input.close(); return; }
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) sum += n / i;
            }
        }
        System.out.println(sum == n);
        input.close();
    }
}
