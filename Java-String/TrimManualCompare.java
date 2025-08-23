import java.util.*;
public class TrimManualCompare {
    static int[] trimBounds(String s){
        int start=0,end=s.length()-1;
        while(start<=end && s.charAt(start)==' ') start++;
        while(end>=start && s.charAt(end)==' ') end--;
        return new int[]{start,end};
    }
    static String subByCharAt(String s,int start,int end){
        if(start> end) return "";
        StringBuilder sb=new StringBuilder();
        for(int i=start;i<=end;i++) sb.append(s.charAt(i));
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
        int[] b=trimBounds(s);
        String manual=subByCharAt(s,b[0],b[1]);
        String builtin=s.trim();
        System.out.println(manual);
        System.out.println(builtin);
        System.out.println(equalByCharAt(manual,builtin));
    }
}
