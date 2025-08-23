import java.util.*;
public class SplitWordsManualCompare {
    static int manualLength(String s){
        int i=0; try{ while(true){ s.charAt(i); i++; } }catch(RuntimeException e){} return i;
    }
    static String[] splitManual(String s){
        int n=manualLength(s);
        int count=0;
        for(int i=0;i<n;i++) if(s.charAt(i)==' ') count++;
        String[] res=new String[count+1];
        int idx=0,start=0;
        for(int i=0;i<=n;i++){
            if(i==n||s.charAt(i)==' '){
                StringBuilder w=new StringBuilder();
                for(int j=start;j<i;j++) w.append(s.charAt(j));
                res[idx++]=w.toString();
                start=i+1;
            }
        }
        return res;
    }
    static boolean equalArr(String[] a,String[] b){
        if(a.length!=b.length) return false;
        for(int i=0;i<a.length;i++) if(!a[i].equals(b[i])) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] a=splitManual(s);
        String[] b=s.split(" ");
        System.out.println(equalArr(a,b));
        for(String w:a) System.out.println(w);
    }
}
