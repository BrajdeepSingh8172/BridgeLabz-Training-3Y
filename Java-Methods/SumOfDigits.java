import java.util.*;
public class SumOfDigits {
    public int get4DigitRandomNumber() { return (int)(Math.random()*9000)+1000; }
    public int countDigits(int number) { int c=0; int t=Math.abs(number); if(t==0) return 1; while(t>0){c++; t/=10;} return c; }
    public int[] getDigits(int number, int count) { int[] d=new int[count]; int t=Math.abs(number); for(int i=count-1;i>=0;i--){ d[i]=t%10; t/=10;} return d; }
    public int sumArray(int[] a){ int s=0; for(int v:a) s+=v; return s; }
    public static void main(String[] args){
        SumOfDigits obj=new SumOfDigits();
        int number=obj.get4DigitRandomNumber();
        int count=obj.countDigits(number);
        int[] digits=obj.getDigits(number,count);
        int sum=obj.sumArray(digits);
        System.out.println("Random 4-digit: "+number);
        System.out.println("Digits Count : "+count);
        System.out.println("Digits       : "+Arrays.toString(digits));
        System.out.println("Sum of Digits: "+sum);
    }
}
