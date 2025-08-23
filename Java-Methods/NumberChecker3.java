import java.util.*;
public class NumberChecker3 {
    public int countDigits(int n){ if(n==0) return 1; int c=0; int t=Math.abs(n); while(t>0){c++; t/=10;} return c; }
    public int[] digits(int n){ int t=Math.abs(n); int c=countDigits(t); int[] d=new int[c]; for(int i=c-1;i>=0;i--){ d[i]=t%10; t/=10;} return d; }
    public int[] reverse(int[] a){ int[] b=new int[a.length]; for(int i=0;i<a.length;i++) b[i]=a[a.length-1-i]; return b; }
    public boolean arraysEqual(int[] a,int[] b){ if(a.length!=b.length) return false; for(int i=0;i<a.length;i++) if(a[i]!=b[i]) return false; return true; }
    public boolean isPalindrome(int n){ int[] d=digits(n); int[] r=reverse(d); return arraysEqual(d,r); }
    public boolean isDuck(int n){ int t=Math.abs(n); while(t>0){ if(t%10==0) return true; t/=10;} return false; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        NumberChecker3 nc=new NumberChecker3();
        System.out.println("Palindrome: "+nc.isPalindrome(n));
        System.out.println("Duck: "+nc.isDuck(n));
    }
}
