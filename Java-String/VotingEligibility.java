import java.util.*;
public class VotingEligibility {
    static int[] randomAges(int n,int min,int max){
        Random r=new Random();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=min+r.nextInt(max-min+1);
        return a;
    }
    static String[][] canVote(int[] ages){
        String[][] out=new String[ages.length][2];
        for(int i=0;i<ages.length;i++){
            int age=ages[i];
            boolean ok=age>=0 && age>=18;
            out[i][0]=String.valueOf(age);
            out[i][1]=String.valueOf(ok);
        }
        return out;
    }
    static void display(String[][] t){
        System.out.println("Age CanVote");
        for(String[] r:t) System.out.println(r[0]+" "+r[1]);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ages=randomAges(n,10,99);
        display(canVote(ages));
    }
}
