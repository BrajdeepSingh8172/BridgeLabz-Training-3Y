// Program: MultiplesBelow100_While
// Purpose: Print all multiples of a given number (<= 100) using while loop.
import java.util.Scanner;

class MultiplesBelow100_While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number <= 0 || number >= 100) { System.out.println("Enter a positive integer less than 100."); input.close(); return; }
        int multiple = number;
        while (multiple <= 100) { System.out.println(multiple); multiple += number; }
        input.close();
    }
}
