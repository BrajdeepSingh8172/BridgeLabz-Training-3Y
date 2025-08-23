import java.util.*;
public class PalindromeAllMethods {
    static boolean isPal1(String s){
        int i=0,j=s.length()-1;
        while(i<j){ if(s.charAt(i)!=s.charAt(j)) return false; i++; j--; }
        return true;
    }
    static boolean isPal2(String s,int i,int j){
        if(i>=j) return true;
        if(s.charAt(i)!=s.charAt(j)) return false;
        return isPal2(s,i+1,j-1);
    }
    static boolean isPal3(String s){
        char[] a=s.toCharArray();
        char[] r=new char[a.length];
        for(int i=0;i<a.length;i++) r[i]=s.charAt(a.length-1-i);
        for(int i=0;i<a.length;i++) if(a[i]!=r[i]) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(isPal1(s));
        System.out.println(isPal2(s,0,s.length()-1));
        System.out.println(isPal3(s));
    }
}
