// Program: NaturalNumberAndSum
// Purpose: Check natural number and print sum of n natural numbers using n*(n+1)/2.
import java.util.Scanner;

class NaturalNumberAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        if (n >= 1) {
            long sum = n * (n + 1) / 2;
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
        input.close();
    }
}
