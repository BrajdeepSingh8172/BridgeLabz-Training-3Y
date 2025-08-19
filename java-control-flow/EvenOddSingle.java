// Program: EvenOddSingle
// Purpose: Check whether an integer is even or odd.
import java.util.Scanner;

class EvenOddSingle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(n % 2 == 0 ? "even" : "odd");
        input.close();
    }
}
