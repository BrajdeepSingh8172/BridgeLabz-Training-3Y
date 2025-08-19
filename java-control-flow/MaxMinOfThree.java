// Program: MaxMinOfThree
// Purpose: Print the maximum and minimum among three numbers.
import java.util.Scanner;

class MaxMinOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        System.out.println("max=" + max + ", min=" + min);
        input.close();
    }
}
