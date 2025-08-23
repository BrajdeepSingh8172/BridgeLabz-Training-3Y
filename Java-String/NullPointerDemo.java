import java.util.*;
public class NullPointerDemo {
    static void generate(){
        String t=null;
        System.out.println(t.length());
    }
    static void handle(){
        try{
            String t=null;
            System.out.println(t.length());
        }catch(NullPointerException e){
            System.out.println("handled");
        }
    }
    public static void main(String[] args){
        try{ generate(); }catch(Exception e){ System.out.println("generated"); }
        handle();
    }
}
