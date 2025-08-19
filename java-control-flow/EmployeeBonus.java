// Program: EmployeeBonus
// Purpose: Calculate 5% bonus if years of service > 5.
import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        int yearsOfService = input.nextInt();
        double bonus = (yearsOfService > 5) ? 0.05 * salary : 0.0;
        System.out.println("Bonus = " + bonus);
        input.close();
    }
}
