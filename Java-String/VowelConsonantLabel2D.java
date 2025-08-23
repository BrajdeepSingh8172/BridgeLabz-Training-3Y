import java.util.*;
public class VowelConsonantLabel2D {
    static boolean isLetter(char c){
        return (c>='a'&&c<='z')||(c>='A'&&c<='Z');
    }
    static boolean isVowel(char c){
        if(c>='A'&&c<='Z') c=(char)(c+32);
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    static String[][] label(String s){
        String[][] out=new String[s.length()][2];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            out[i][0]=String.valueOf(ch);
            if(!isLetter(ch)) out[i][1]="Not a Letter";
            else out[i][1]=isVowel(ch)?"Vowel":"Consonant";
        }
        return out;
    }
    static void display(String[][] t){
        for(String[] r:t) System.out.println(r[0]+" "+r[1]);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        display(label(s));
    }
}
