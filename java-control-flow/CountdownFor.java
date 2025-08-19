// Program: CountdownFor
// Purpose: Count down from a given number to 1 using a for loop.
import java.util.Scanner;

class CountdownFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = n; i >= 1; i--) System.out.println(i);
        System.out.println("Liftoff!");
        input.close();
    }
}
