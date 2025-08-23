import java.util.*;
public class LowercaseManualCompare {
    static String toLowerManual(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='A'&&c<='Z') c=(char)(c+32);
            sb.append(c);
        }
        return sb.toString();
    }
    static boolean equalByCharAt(String a,String b){
        if(a.length()!=b.length()) return false;
        for(int i=0;i<a.length();i++) if(a.charAt(i)!=b.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String m=toLowerManual(s);
        String b=s.toLowerCase();
        System.out.println(m);
        System.out.println(b);
        System.out.println(equalByCharAt(m,b));
    }
}
