// Program: OddEvenUpToN
// Purpose: Print odd/even for numbers from 1 to N (N must be a natural number).
import java.util.Scanner;

class OddEvenUpToN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n < 1) { System.out.println("Not a natural number."); input.close(); return; }
        for (int i = 1; i <= n; i++) System.out.println(i + (i % 2 == 0 ? " is even" : " is odd"));
        input.close();
    }
}
