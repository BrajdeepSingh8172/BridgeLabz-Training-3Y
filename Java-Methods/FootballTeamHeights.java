import java.util.*;
public class FootballTeamHeights {
    public int sum(int[] a){ int s=0; for(int v:a) s+=v; return s; }
    public double mean(int[] a){ return sum(a)*1.0/a.length; }
    public int min(int[] a){ int m=a[0]; for(int v:a) if(v<m) m=v; return m; }
    public int max(int[] a){ int m=a[0]; for(int v:a) if(v>m) m=v; return m; }
    public static void main(String[] args){
        int[] h=new int[11]; for(int i=0;i<11;i++) h[i]=150+(int)(Math.random()*101);
        FootballTeamHeights f=new FootballTeamHeights();
        System.out.println("Heights: "+Arrays.toString(h));
        System.out.printf("Mean: %.2f%n", f.mean(h));
        System.out.println("Shortest: "+f.min(h));
        System.out.println("Tallest : "+f.max(h));
    }
}
