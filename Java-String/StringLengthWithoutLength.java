import java.util.*;
public class StringLengthWithoutLength {
    static int manualLength(String s){
        int i=0;
        try{
            while(true){ s.charAt(i); i++; }
        }catch(RuntimeException e){}
        return i;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(manualLength(s));
        System.out.println(s.length());
    }
}
