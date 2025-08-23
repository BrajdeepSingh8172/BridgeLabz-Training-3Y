import java.util.*;
public class NumberCheckArray {
    public boolean isPositive(int n){ return n>=0; }
    public boolean isEven(int n){ return n%2==0; }
    public int compare(int a,int b){ if(a>b) return 1; if(a==b) return 0; return -1; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5]; for(int i=0;i<5;i++) a[i]=sc.nextInt();
        NumberCheckArray n=new NumberCheckArray();
        for(int v:a){
            if(n.isPositive(v)){ System.out.println(v+" is positive"); System.out.println(n.isEven(v)?"even":"odd"); }
            else System.out.println(v+" is negative");
        }
        int cmp=n.compare(a[0],a[4]);
        if(cmp==0) System.out.println("First and Last are equal");
        else if(cmp>0) System.out.println("First > Last");
        else System.out.println("First < Last");
    }
}
