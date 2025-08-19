// Program: TriangleChecker
// Purpose: Check if three angles form a triangle (sum == 180).
import java.util.Scanner;

class TriangleChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt(), y = input.nextInt(), z = input.nextInt();
        int sumOfAngles = x + y + z;
        System.out.println("The given angles " + x + ", " + y + ", " + z + " add to " + sumOfAngles);
        if (sumOfAngles == 180) System.out.println("The given angles are internal angles of a Triangle");
        else System.out.println("The given angles are not internal angles of a Triangle");
        input.close();
    }
}
