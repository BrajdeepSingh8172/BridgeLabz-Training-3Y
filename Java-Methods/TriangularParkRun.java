import java.util.*;
public class TriangularParkRun {
    public double roundsForDistance(double sideA,double sideB,double sideC,double distanceMeters){
        double perimeter=sideA+sideB+sideC;
        if(perimeter<=0) return 0.0;
        return distanceMeters/perimeter;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble(), b=sc.nextDouble(), c=sc.nextDouble();
        double rounds=new TriangularParkRun().roundsForDistance(a,b,c,5000.0);
        System.out.printf("Per round distance: %.2f m | Rounds for 5km: %.2f%n", (a+b+c), rounds);
    }
}
