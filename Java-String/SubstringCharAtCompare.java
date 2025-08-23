import java.util.*;
public class SubstringCharAtCompare {
    static String subByCharAt(String s,int start,int end){
        if(start<0||end>=(s==null?0:s.length())||start>end) throw new StringIndexOutOfBoundsException();
        StringBuilder sb=new StringBuilder();
        for(int i=start;i<=end;i++) sb.append(s.charAt(i));
        return sb.toString();
    }
    static boolean equalByCharAt(String a,String b){
        if(a==null||b==null) return a==b;
        if(a.length()!=b.length()) return false;
        for(int i=0;i<a.length();i++) if(a.charAt(i)!=b.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int start=sc.nextInt();
        int end=sc.nextInt();
        String r1=subByCharAt(s,start,end);
        String r2=s.substring(start,end+1);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(equalByCharAt(r1,r2));
    }
}
