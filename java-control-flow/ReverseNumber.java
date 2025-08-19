// Program: ReverseNumber
// Purpose: Reverse digits of an integer.
import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int temp = Math.abs(n), rev = 0;
        while (temp != 0) { rev = rev * 10 + (temp % 10); temp /= 10; }
        if (n < 0) rev = -rev;
        System.out.println(rev);
        input.close();
    }
}
