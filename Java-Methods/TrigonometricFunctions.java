import java.util.*;
public class TrigonometricFunctions {
    public double[] calculateTrigonometricFunctions(double angleDegrees){
        double rad=Math.toRadians(angleDegrees);
        return new double[]{Math.sin(rad),Math.cos(rad),Math.tan(rad)};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double angle=sc.nextDouble();
        double[] r=new TrigonometricFunctions().calculateTrigonometricFunctions(angle);
        System.out.printf("sin=%.6f cos=%.6f tan=%.6f%n", r[0],r[1],r[2]);
    }
}
