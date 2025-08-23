import java.util.*;
public class NumberFormatDemo {
    static void generate(String t){
        System.out.println(Integer.parseInt(t));
    }
    static void handle(String t){
        try{
            System.out.println(Integer.parseInt(t));
        }catch(NumberFormatException e){
            System.out.println("handled");
        }catch(RuntimeException e){
            System.out.println("handled-runtime");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String t=sc.next();
        try{ generate(t); }catch(Exception e){ System.out.println("generated"); }
        handle(t);
    }
}
