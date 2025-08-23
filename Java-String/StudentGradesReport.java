import java.util.*;
public class StudentGradesReport {
    static int[][] randomPCM(int n){
        Random r=new Random();
        int[][] a=new int[n][3];
        for(int i=0;i<n;i++) for(int j=0;j<3;j++) a[i][j]=50+r.nextInt(51);
        return a;
    }
    static double round2(double v){
        return Math.round(v*100.0)/100.0;
    }
    static String grade(double p){
        if(p>=90) return "A+";
        if(p>=80) return "A";
        if(p>=70) return "B";
        if(p>=60) return "C";
        if(p>=50) return "D";
        return "F";
    }
    static String[][] scorecard(int[][] pcm){
        int n=pcm.length;
        String[][] out=new String[n][7];
        for(int i=0;i<n;i++){
            int total=pcm[i][0]+pcm[i][1]+pcm[i][2];
            double avg=round2(total/3.0);
            double perc=round2(total/3.0);
            out[i][0]=String.valueOf(pcm[i][0]);
            out[i][1]=String.valueOf(pcm[i][1]);
            out[i][2]=String.valueOf(pcm[i][2]);
            out[i][3]=String.valueOf(total);
            out[i][4]=String.valueOf(avg);
            out[i][5]=String.valueOf(perc);
            out[i][6]=grade(perc);
        }
        return out;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] pcm=randomPCM(n);
        String[][] t=scorecard(pcm);
        System.out.println("Phy Chem Math Total Avg % Grade");
        for(String[] r:t) System.out.println(String.join(" ",r));
    }
}
