import java.util.*;
public class EuclideanDistanceLineEquation {
    public double distance(double x1,double y1,double x2,double y2){ return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)); }
    public String lineEquation(double x1,double y1,double x2,double y2){
        if(Math.abs(x2-x1)<1e-12) return "x = "+x1;
        double m=(y2-y1)/(x2-x1); double b=y1-m*x1;
        return String.format("y = %.6f*x + %.6f", m,b);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double x1=sc.nextDouble(), y1=sc.nextDouble(), x2=sc.nextDouble(), y2=sc.nextDouble();
        EuclideanDistanceLineEquation e=new EuclideanDistanceLineEquation();
        System.out.printf("Distance = %.6f%n", e.distance(x1,y1,x2,y2));
        System.out.println("Line     = "+e.lineEquation(x1,y1,x2,y2));
    }
}
