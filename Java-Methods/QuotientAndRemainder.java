import java.util.*;
public class QuotientAndRemainder {
    public static int[] findRemainderAndQuotient(int number,int divisor){
        return new int[]{number%divisor, number/divisor};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt(), divisor=sc.nextInt();
        int[] rq=findRemainderAndQuotient(number,divisor);
        System.out.println("Quotient = "+rq[1]+", Remainder = "+rq[0]);
    }
}
