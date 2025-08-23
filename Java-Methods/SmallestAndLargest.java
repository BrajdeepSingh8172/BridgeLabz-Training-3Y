import java.util.*;
public class SmallestAndLargest {
    public static int[] findSmallestAndLargest(int a,int b,int c){
        int min=Math.min(a,Math.min(b,c));
        int max=Math.max(a,Math.max(b,c));
        return new int[]{min,max};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
        int[] r=findSmallestAndLargest(a,b,c);
        System.out.println("Smallest = "+r[0]+", Largest = "+r[1]);
    }
}
