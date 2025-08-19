// Program: SumOfNNaturalNumbers_ForAndFormula
// Purpose: Compare sum via for loop vs formula n*(n+1)/2.
import java.util.Scanner;

class SumOfNNaturalNumbers_ForAndFormula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        if (n >= 1) {
            long formulaSum = n * (n + 1) / 2;
            long forSum = 0;
            for (long i = 1; i <= n; i++) forSum += i;
            System.out.println("Formula Sum = " + formulaSum);
            System.out.println("For Sum     = " + forSum);
            System.out.println("Matches? " + (formulaSum == forSum));
        } else System.out.println("Not a natural number.");
        input.close();
    }
}
