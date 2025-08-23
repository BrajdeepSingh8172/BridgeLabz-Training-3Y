import java.util.*;
public class RockPaperScissorsStats {
    static String comp(){
        int x=(int)(Math.random()*3);
        return x==0?"rock":x==1?"paper":"scissors";
    }
    static int result(String u,String c){
        if(u.equals(c)) return 0;
        if(u.equals("rock")&&c.equals("scissors")) return 1;
        if(u.equals("paper")&&c.equals("rock")) return 1;
        if(u.equals("scissors")&&c.equals("paper")) return 1;
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int games=sc.nextInt();
        int uw=0,cw=0,draw=0;
        for(int i=0;i<games;i++){
            String u=sc.next();
            String c=comp();
            int r=result(u,c);
            if(r>0) uw++; else if(r<0) cw++; else draw++;
            System.out.println((i+1)+" "+u+" "+c+" "+(r>0?"User":r<0?"Computer":"Draw"));
        }
        double up=(games==0?0:uw*100.0/games);
        double cp=(games==0?0:cw*100.0/games);
        System.out.println("UserWins "+uw);
        System.out.println("ComputerWins "+cw);
        System.out.println("Draws "+draw);
        System.out.println("UserWin% "+String.format("%.2f",up));
        System.out.println("ComputerWin% "+String.format("%.2f",cp));
    }
}
