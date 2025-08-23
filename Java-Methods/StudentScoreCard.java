import java.util.*;
public class StudentScoreCard {
    public int[][] generatePCM(int n){ int[][] a=new int[n][3]; for(int i=0;i<n;i++){ for(int j=0;j<3;j++) a[i][j]= (int)(Math.random()*90)+10; } return a; }
    public double[][] totals(int[][] pcm){
        double[][] r=new double[pcm.length][3];
        for(int i=0;i<pcm.length;i++){
            int total=pcm[i][0]+pcm[i][1]+pcm[i][2];
            double avg=total/3.0;
            double pct=Math.round((total/300.0)*10000.0)/100.0;
            r[i][0]=total; r[i][1]=avg; r[i][2]=pct;
        }
        return r;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        StudentScoreCard s=new StudentScoreCard();
        int[][] pcm=s.generatePCM(n);
        double[][] r=s.totals(pcm);
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPct");
        for(int i=0;i<n;i++){
            System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%.2f%n", pcm[i][0], pcm[i][1], pcm[i][2], (int)r[i][0], r[i][1], r[i][2]);
        }
    }
}
