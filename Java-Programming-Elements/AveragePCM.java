import java.util.Scanner;
public class AveragePCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Physics marks: ");
        double physics = sc.nextDouble();
        System.out.print("Enter Chemistry marks: ");
        double chemistry = sc.nextDouble();
        System.out.print("Enter Math marks: ");
        double math = sc.nextDouble();
        double average = (physics + chemistry + math) / 3;
        System.out.println("Average marks: " + average);
    }
}