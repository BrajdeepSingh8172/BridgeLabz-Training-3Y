import java.util.Scanner;
public class LargestThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.print("Enter third number: ");
        double c = sc.nextDouble();
        double largest = (a > b && a > c) ? a : (b > c ? b : c);
        System.out.println("Largest: " + largest);
    }
}