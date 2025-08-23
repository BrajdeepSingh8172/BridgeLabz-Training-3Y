import java.util.*;
public class StringIndexOutOfBoundsDemo {
    static void generate(String s){
        System.out.println(s.charAt(s.length()));
    }
    static void handle(String s){
        try{
            System.out.println(s.charAt(s.length()));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("handled");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        try{ generate(s); }catch(Exception e){ System.out.println("generated"); }
        handle(s);
    }
}
