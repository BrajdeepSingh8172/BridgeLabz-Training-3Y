// Program: MultiplesBelow100_For
// Purpose: Print all multiples of a given number (<= 100) using for loop.
import java.util.Scanner;

class MultiplesBelow100_For {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number <= 0 || number >= 100) { System.out.println("Enter a positive integer less than 100."); input.close(); return; }
        for (int i = number; i <= 100; i += number) System.out.println(i);
        input.close();
    }
}
