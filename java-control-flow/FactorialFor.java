// Program: FactorialFor
// Purpose: Find factorial using for loop.
import java.util.Scanner;
import java.math.BigInteger;

class FactorialFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n < 0) { System.out.println("Enter a non-negative integer."); input.close(); return; }
        java.math.BigInteger fact = java.math.BigInteger.ONE;
        for (int i = 1; i <= n; i++) fact = fact.multiply(java.math.BigInteger.valueOf(i));
        System.out.println("Factorial(" + n + ") = " + fact);
        input.close();
    }
}
