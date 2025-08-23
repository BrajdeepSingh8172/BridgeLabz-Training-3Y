import java.util.*;
public class RecursiveSum {
    public long sumRecursive(long n){ if(n<=0) return 0; return n+sumRecursive(n-1); }
    public long sumFormula(long n){ return n*(n+1)/2; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        RecursiveSum rs=new RecursiveSum();
        long a=rs.sumRecursive(n), b=rs.sumFormula(n);
        System.out.println("Recursive: "+a);
        System.out.println("Formula  : "+b);
        System.out.println("Match    : "+(a==b));
    }
}
