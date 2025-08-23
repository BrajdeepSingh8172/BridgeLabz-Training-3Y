import java.util.*;
public class NumberChecker5 {
    public int sumProperDivisors(int n){
        if(n==1) return 0;
        int s=1;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                s+=i;
                if(i!=n/i) s+=n/i;
            }
        }
        return s;
    }
    public boolean isPerfect(int n){ return n>1 && sumProperDivisors(n)==n; }
    public boolean isAbundant(int n){ return sumProperDivisors(n)>n; }
    public boolean isDeficient(int n){ return sumProperDivisors(n)<n; }
    public int fact(int n){ int f=1; for(int i=2;i<=n;i++) f*=i; return f; }
    public boolean isStrong(int n){ int t=Math.abs(n); int s=0; if(t==0) return false; while(t>0){ s+=fact(t%10); t/=10; } return s==Math.abs(n); }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        NumberChecker5 nc=new NumberChecker5();
        System.out.println("Perfect: "+nc.isPerfect(n));
        System.out.println("Abundant: "+nc.isAbundant(n));
        System.out.println("Deficient: "+nc.isDeficient(n));
        System.out.println("Strong: "+nc.isStrong(n));
    }
}
