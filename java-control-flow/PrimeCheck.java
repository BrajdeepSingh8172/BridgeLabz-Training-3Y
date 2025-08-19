// Program: PrimeCheck
// Purpose: Check whether a number is prime (n >= 2).
import java.util.Scanner;

class PrimeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n < 2) { System.out.println("not prime"); input.close(); return; }
        boolean prime = true;
        for (int i = 2; i * i <= n; i++) if (n % i == 0) { prime = false; break; }
        System.out.println(prime ? "prime" : "not prime");
        input.close();
    }
}
