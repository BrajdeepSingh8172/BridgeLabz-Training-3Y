// Program: CountDigits
// Purpose: Count number of digits of an integer.
import java.util.Scanner;

class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Math.abs(input.nextInt());
        if (n == 0) { System.out.println(1); input.close(); return; }
        int count = 0;
        while (n != 0) { count++; n /= 10; }
        System.out.println(count);
        input.close();
    }
}
