import java.util.*;
public class NumberChecker4 {
    public boolean isPrime(int n){ if(n<=1) return false; if(n%2==0) return n==2; for(int i=3;i*i<=n;i+=2) if(n%i==0) return false; return true; }
    public boolean isNeon(int n){ long sq=1L*n*n; int s=0; while(sq>0){ s+=sq%10; sq/=10; } return s==n; }
    public boolean isSpy(int n){ int t=Math.abs(n); int sum=0, prod=1; if(t==0) return false; while(t>0){ int d=t%10; sum+=d; prod*=d; t/=10; } return sum==prod; }
    public boolean isAutomorphic(int n){ long sq=1L*n*n; String a=String.valueOf(n), b=String.valueOf(sq); return b.endsWith(a); }
    public boolean isBuzz(int n){ return n%7==0 || Math.abs(n)%10==7; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        NumberChecker4 nc=new NumberChecker4();
        System.out.println("Prime: "+nc.isPrime(n));
        System.out.println("Neon: "+nc.isNeon(n));
        System.out.println("Spy: "+nc.isSpy(n));
        System.out.println("Automorphic: "+nc.isAutomorphic(n));
        System.out.println("Buzz: "+nc.isBuzz(n));
    }
}
