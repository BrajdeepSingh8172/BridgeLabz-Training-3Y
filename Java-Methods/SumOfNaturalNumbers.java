import java.util.*;
public class SumOfNaturalNumbers {
    public long sumN(long n){ long s=0; for(long i=1;i<=n;i++) s+=i; return s; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.println("Sum of first "+n+" natural numbers = "+new SumOfNaturalNumbers().sumN(n));
    }
}
