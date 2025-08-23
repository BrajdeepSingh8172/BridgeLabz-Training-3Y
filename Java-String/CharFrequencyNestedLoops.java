import java.util.*;
public class CharFrequencyNestedLoops {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        int[] f=new int[ch.length];
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='0') continue;
            f[i]=1;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){ f[i]++; ch[j]='0'; }
            }
        }
        List<String> out=new ArrayList<>();
        for(int i=0;i<ch.length;i++){
            if(ch[i]!='0'){ out.add(ch[i]+" "+f[i]); }
        }
        for(String r:out) System.out.println(r);
    }
}
