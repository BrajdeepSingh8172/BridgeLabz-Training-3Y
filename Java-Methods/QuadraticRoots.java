import java.util.*;
public class QuadraticRoots {
    public double[] roots(double a,double b,double c){
        double d=b*b-4*a*c;
        if(d>0){ double s=Math.sqrt(d); return new double[]{(-b+s)/(2*a),(-b-s)/(2*a)}; }
        if(Math.abs(d)<1e-12){ return new double[]{-b/(2*a)}; }
        return new double[]{};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble(), b=sc.nextDouble(), c=sc.nextDouble();
        double[] r=new QuadraticRoots().roots(a,b,c);
        if(r.length==0) System.out.println("No Real Roots");
        else if(r.length==1) System.out.printf("One root: %.6f%n", r[0]);
        else System.out.printf("Roots: %.6f and %.6f%n", r[0], r[1]);
    }
}
