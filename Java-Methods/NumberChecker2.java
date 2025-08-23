import java.util.*;
public class NumberChecker2 {
    public int countDigits(int n){ if(n==0) return 1; int c=0; int t=Math.abs(n); while(t>0){c++; t/=10;} return c; }
    public int[] digits(int n){ int t=Math.abs(n); int c=countDigits(t); int[] d=new int[c]; for(int i=c-1;i>=0;i--){ d[i]=t%10; t/=10;} return d; }
    public int sumDigits(int[] d){ int s=0; for(int x:d) s+=x; return s; }
    public int sumSquares(int[] d){ int s=0; for(int x:d) s+=x*x; return s; }
    public boolean isHarshad(int n){ int[] d=digits(n); int s=sumDigits(d); return s!=0 && n%s==0; }
    public int[][] frequency(int n){ int[] d=digits(n); int[][] f=new int[10][2]; for(int i=0;i<10;i++){ f[i][0]=i; f[i][1]=0; } for(int x:d) f[x][1]++; return f; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        NumberChecker2 nc=new NumberChecker2();
        int[] d=nc.digits(n);
        System.out.println("Sum of digits: "+nc.sumDigits(d));
        System.out.println("Sum of squares: "+nc.sumSquares(d));
        System.out.println("Harshad: "+nc.isHarshad(n));
        int[][] f=nc.frequency(n);
        for(int i=0;i<10;i++) System.out.println("Digit "+f[i][0]+": "+f[i][1]);
    }
}
