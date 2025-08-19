// Program: SumOfNNaturalNumbers_WhileAndFormula
// Purpose: Compare sum via while loop vs formula n*(n+1)/2.
import java.util.Scanner;

class SumOfNNaturalNumbers_WhileAndFormula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        if (n >= 1) {
            long formulaSum = n * (n + 1) / 2;
            long i = 1, whileSum = 0;
            while (i <= n) { whileSum += i; i++; }
            System.out.println("Formula Sum = " + formulaSum);
            System.out.println("While Sum   = " + whileSum);
            System.out.println("Matches? " + (formulaSum == whileSum));
        } else System.out.println("Not a natural number.");
        input.close();
    }
}
