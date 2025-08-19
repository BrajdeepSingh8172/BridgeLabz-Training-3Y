// Program: Table1to10
// Purpose: Print multiplication table (1..10) for given number.
import java.util.Scanner;

class Table1to10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= 10; i++) System.out.println(n + " * " + i + " = " + (n * i));
        input.close();
    }
}
