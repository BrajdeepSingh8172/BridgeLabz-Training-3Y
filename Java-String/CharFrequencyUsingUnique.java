import java.util.*;
public class CharFrequencyUsingUnique {
    static char[] uniqueChars(String s){
        char[] temp=new char[s.length()];
        int k=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            boolean exists=false;
            for(int j=0;j<i;j++) if(s.charAt(j)==c){ exists=true; break; }
            if(!exists) temp[k++]=c;
        }
        char[] res=new char[k];
        for(int i=0;i<k;i++) res[i]=temp[i];
        return res;
    }
    static int countChar(String s,char ch){
        int c=0; for(int i=0;i<s.length();i++) if(s.charAt(i)==ch) c++; return c;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] u=uniqueChars(s);
        String[][] t=new String[u.length][2];
        for(int i=0;i<u.length;i++){ t[i][0]=String.valueOf(u[i]); t[i][1]=String.valueOf(countChar(s,u[i])); }
        for(String[] r:t) System.out.println(r[0]+" "+r[1]);
    }
}
