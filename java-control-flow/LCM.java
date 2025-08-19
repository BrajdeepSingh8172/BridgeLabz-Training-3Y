// Program: LCM
// Purpose: Compute LCM of two positive integers using GCD.
import java.util.Scanner;

class LCM {
    static int gcd(int a, int b) { while (b != 0) { int t = a % b; a = b; b = t; } return a; }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt();
        a = Math.abs(a); b = Math.abs(b);
        if (a == 0 || b == 0) { System.out.println("LCM = 0"); input.close(); return; }
        long lcm = (long)a / gcd(a, b) * (long)b;
        System.out.println("LCM = " + lcm);
        input.close();
    }
}
