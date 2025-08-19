// Program: CountdownWhile
// Purpose: Count down from a given number to 1 using a while loop.
import java.util.Scanner;

class CountdownWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = input.nextInt();
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Liftoff!");
        input.close();
    }
}
