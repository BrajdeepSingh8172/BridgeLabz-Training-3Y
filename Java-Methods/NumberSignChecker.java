import java.util.*;
public class NumberSignChecker {
    public int checkSign(int n){ if(n<0) return -1; if(n>0) return 1; return 0; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=new NumberSignChecker().checkSign(n);
        if(s<0) System.out.println("Negative");
        else if(s>0) System.out.println("Positive");
        else System.out.println("Zero");
    }
}
