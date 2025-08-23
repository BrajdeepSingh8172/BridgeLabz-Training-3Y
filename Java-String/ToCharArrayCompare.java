import java.util.*;
public class ToCharArrayCompare {
    static char[] manualToChars(String s){
        char[] out=new char[s.length()];
        for(int i=0;i<s.length();i++) out[i]=s.charAt(i);
        return out;
    }
    static boolean equalCharArrays(char[] a,char[] b){
        if(a.length!=b.length) return false;
        for(int i=0;i<a.length;i++) if(a[i]!=b[i]) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] c1=manualToChars(s);
        char[] c2=s.toCharArray();
        System.out.println(equalCharArrays(c1,c2));
        for(char c:c1) System.out.print(c);
        System.out.println();
    }
}
