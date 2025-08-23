import java.util.*;
public class NumberChecker1 {
    public int countDigits(int n){ if(n==0) return 1; int c=0; int t=Math.abs(n); while(t>0){c++; t/=10;} return c; }
    public int[] digits(int n){ int t=Math.abs(n); int c=countDigits(t); int[] d=new int[c]; for(int i=c-1;i>=0;i--){ d[i]=t%10; t/=10;} return d; }
    public boolean isDuck(int n){ int t=Math.abs(n); while(t>0){ if(t%10==0) return true; t/=10;} return false; }
    public boolean isArmstrong(int n){ int t=Math.abs(n); int[] d=digits(t); int p=d.length; int s=0; for(int x:d) s+= (int)Math.pow(x,p); return s==t; }
    public int[] largestTwo(int[] a){ int l1=Integer.MIN_VALUE,l2=Integer.MIN_VALUE; for(int v:a){ if(v>l1){ l2=l1; l1=v;} else if(v>l2){ l2=v; } } return new int[]{l1,l2}; }
    public int[] smallestTwo(int[] a){ int s1=Integer.MAX_VALUE,s2=Integer.MAX_VALUE; for(int v:a){ if(v<s1){ s2=s1; s1=v;} else if(v<s2){ s2=v; } } return new int[]{s1,s2}; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        NumberChecker1 nc=new NumberChecker1();
        int[] d=nc.digits(n);
        System.out.println("Duck: "+nc.isDuck(n));
        System.out.println("Armstrong: "+nc.isArmstrong(n));
        System.out.println("Largest, Second Largest: "+Arrays.toString(nc.largestTwo(d)));
        System.out.println("Smallest, Second Smallest: "+Arrays.toString(nc.smallestTwo(d)));
    }
}
