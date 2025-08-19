// Program: GCD
// Purpose: Compute GCD of two positive integers using Euclid's algorithm.
import java.util.Scanner;

class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt();
        a = Math.abs(a); b = Math.abs(b);
        while (b != 0) { int t = a % b; a = b; b = t; }
        System.out.println("GCD = " + a);
        input.close();
    }
}
