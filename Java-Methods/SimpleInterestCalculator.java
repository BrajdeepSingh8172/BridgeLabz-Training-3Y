import java.util.*;
public class SimpleInterestCalculator {
    public double calculateSimpleInterest(double principal,double rate,double time){ return (principal*rate*time)/100.0; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double p=sc.nextDouble(), r=sc.nextDouble(), t=sc.nextDouble();
        double si=new SimpleInterestCalculator().calculateSimpleInterest(p,r,t);
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f%n", si,p,r,t);
    }
}
