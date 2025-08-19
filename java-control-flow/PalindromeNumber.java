// Program: PalindromeNumber
// Purpose: Check whether an integer is a palindrome.
import java.util.Scanner;

class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int temp = Math.abs(n), rev = 0;
        while (temp != 0) { rev = rev * 10 + (temp % 10); temp /= 10; }
        System.out.println(Math.abs(n) == rev);
        input.close();
    }
}
