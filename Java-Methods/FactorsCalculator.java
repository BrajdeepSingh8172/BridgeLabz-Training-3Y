import java.util.*;
public class FactorsCalculator {
    public int[] factors(int n){
        int c=0; for(int i=1;i<=n;i++) if(n%i==0) c++;
        int[] f=new int[c]; int k=0; for(int i=1;i<=n;i++) if(n%i==0) f[k++]=i;
        return f;
    }
    public long sum(int[] a){ long s=0; for(int v:a) s+=v; return s; }
    public long product(int[] a){ long p=1; for(int v:a) p*=v; return p; }
    public long sumSquares(int[] a){ long s=0; for(int v:a) s+= 1L*v*v; return s; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        FactorsCalculator fc=new FactorsCalculator();
        int[] f=fc.factors(n);
        System.out.println("Factors: "+Arrays.toString(f));
        System.out.println("Sum: "+fc.sum(f));
        System.out.println("Sum of Squares: "+fc.sumSquares(f));
        System.out.println("Product: "+fc.product(f));
    }
}
