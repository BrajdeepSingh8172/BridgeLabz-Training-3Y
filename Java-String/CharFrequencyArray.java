import java.util.*;
public class CharFrequencyArray {
    static String[][] freq(String s){
        int[] f=new int[256];
        for(int i=0;i<s.length();i++) f[s.charAt(i)]++;
        int count=0;
        for(int i=0;i<256;i++) if(f[i]>0) count++;
        String[][] t=new String[count][2];
        int k=0;
        for(int i=0;i<s.length();i++){
            int c=s.charAt(i);
            if(f[c]>0){
                t[k][0]=String.valueOf((char)c);
                t[k][1]=String.valueOf(f[c]);
                f[c]=0;
                k++;
            }
        }
        return t;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[][] t=freq(s);
        for(String[] r:t) System.out.println(r[0]+" "+r[1]);
    }
}
