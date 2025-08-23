import java.util.*;
public class IllegalArgumentDemo {
    static void generate(String s,int a,int b){
        System.out.println(s.substring(a,b));
    }
    static void handle(String s,int a,int b){
        try{
            System.out.println(s.substring(a,b));
        }catch(IllegalArgumentException e){
            System.out.println("handled-illegal");
        }catch(RuntimeException e){
            System.out.println("handled-runtime");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int a=sc.nextInt();
        int b=sc.nextInt();
        try{ generate(s,a,b); }catch(Exception e){ System.out.println("generated"); }
        handle(s,a,b);
    }
}
