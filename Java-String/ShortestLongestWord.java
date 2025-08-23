import java.util.*;
public class ShortestLongestWord {
    static String[] splitManual(String s){
        int n=s.length();
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
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] words=splitManual(s);
        String shortest=words[0],longest=words[0];
        for(String w:words){
            if(w.length()<shortest.length()) shortest=w;
            if(w.length()>longest.length()) longest=w;
        }
        System.out.println(shortest);
        System.out.println(longest);
    }
}
