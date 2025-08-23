import java.util.*;
public class UniqueCharacters {
    static int manualLength(String s){
        int i=0; try{ while(true){ s.charAt(i); i++; } }catch(RuntimeException e){} return i;
    }
    static char[] uniqueChars(String s){
        int n=manualLength(s);
        char[] temp=new char[n];
        int k=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            boolean exists=false;
            for(int j=0;j<i;j++) if(s.charAt(j)==c){ exists=true; break; }
            if(!exists) temp[k++]=c;
        }
        char[] res=new char[k];
        for(int i=0;i<k;i++) res[i]=temp[i];
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] u=uniqueChars(s);
        for(char c:u) System.out.print(c);
        System.out.println();
    }
}
