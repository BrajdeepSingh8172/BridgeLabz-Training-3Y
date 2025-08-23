import java.util.*;
public class ChocolateDistributor {
    public static int[] findRemainderAndQuotient(int chocolates,int children){
        return new int[]{chocolates%children, chocolates/children};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int chocolates=sc.nextInt(), children=sc.nextInt();
        int[] rq=findRemainderAndQuotient(chocolates,children);
        System.out.println("Each child gets "+rq[1]+", Remaining = "+rq[0]);
    }
}
