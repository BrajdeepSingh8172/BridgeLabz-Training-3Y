import java.util.*;
public class ArrayIndexOutOfBoundsDemo {
    static void generate(String[] a,int idx){
        System.out.println(a[idx]);
    }
    static void handle(String[] a,int idx){
        try{
            System.out.println(a[idx]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("handled");
        }catch(RuntimeException e){
            System.out.println("handled-runtime");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++) arr[i]=sc.next();
        int idx=sc.nextInt();
        try{ generate(arr,idx); }catch(Exception e){ System.out.println("generated"); }
        handle(arr,idx);
    }
}
