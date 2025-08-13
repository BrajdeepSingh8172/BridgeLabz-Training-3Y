import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter Rate (%): ");
        double r = sc.nextDouble();
        System.out.print("Enter Time (years): ");
        double t = sc.nextDouble();
        System.out.print("Enter number of times interest applied per year: ");
        int n = sc.nextInt();
        double amount = p * Math.pow(1 + (r / (100 * n)), n * t);
        double ci = amount - p;
        System.out.println("Compound Interest: " + ci);
    }
}