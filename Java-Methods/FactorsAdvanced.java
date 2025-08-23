import java.util.*;
public class FactorsAdvanced {
    public int[] factors(int n){ int c=0; for(int i=1;i<=n;i++) if(n%i==0) c++; int[] f=new int[c]; int k=0; for(int i=1;i<=n;i++) if(n%i==0) f[k++]=i; return f; }
    public int greatestFactor(int[] f){ return f[f.length-2]; }
    public long sum(int[] a){ long s=0; for(int v:a) s+=v; return s; }
    public long product(int[] a){ long p=1; for(int v:a) p*=v; return p; }
    public long productCube(int[] a){ long p=1; for(int v:a) p*= (long)v*v*v; return p; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        FactorsAdvanced fa=new FactorsAdvanced();
        int[] f=fa.factors(n);
        System.out.println("Greatest proper factor: "+fa.greatestFactor(f));
        System.out.println("Sum of factors: "+fa.sum(f));
        System.out.println("Product of factors: "+fa.product(f));
        System.out.println("Product of cubes of factors: "+fa.productCube(f));
    }
}
