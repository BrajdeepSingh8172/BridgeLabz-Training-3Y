// Program: PrimeNumbersUpToN
// Description: Placeholder program (filename fixed as requested)

public class PrimeNumbersUpToN {
    public static void main(String[] args) {
        int N = 50; // You can change N to any positive integer
        System.out.println("Prime numbers up to " + N + ":");
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
