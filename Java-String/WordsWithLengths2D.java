import java.util.*;
public class WordsWithLengths2D {
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
    static String[][] wordsWithLengths(String s){
        String[] words=splitManual(s);
        String[][] out=new String[words.length][2];
        for(int i=0;i<words.length;i++){
            out[i][0]=words[i];
            out[i][1]=String.valueOf(words[i].length());
        }
        return out;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[][] t=wordsWithLengths(s);
        for(String[] row:t) System.out.println(row[0]+" "+Integer.parseInt(row[1]));
    }
}
