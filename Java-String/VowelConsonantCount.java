import java.util.*;
public class VowelConsonantCount {
    static boolean isLetter(char c){
        return (c>='a'&&c<='z')||(c>='A'&&c<='Z');
    }
    static boolean isVowel(char c){
        if(c>='A'&&c<='Z') c=(char)(c+32);
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    static int[] countVC(String s){
        int v=0,c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isLetter(ch)){
                if(isVowel(ch)) v++; else c++;
            }
        }
        return new int[]{v,c};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] r=countVC(s);
        System.out.println(r[0]+" "+r[1]);
    }
}
