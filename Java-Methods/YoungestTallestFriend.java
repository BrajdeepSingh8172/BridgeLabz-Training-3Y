import java.util.*;
public class YoungestTallestFriend {
    public int indexOfYoungest(int[] ages){ int m=ages[0], idx=0; for(int i=1;i<ages.length;i++) if(ages[i]<m){m=ages[i]; idx=i;} return idx; }
    public int indexOfTallest(int[] heights){ int m=heights[0], idx=0; for(int i=1;i<heights.length;i++) if(heights[i]>m){m=heights[i]; idx=i;} return idx; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] ages=new int[3]; int[] h=new int[3];
        for(int i=0;i<3;i++) ages[i]=sc.nextInt();
        for(int i=0;i<3;i++) h[i]=sc.nextInt();
        String[] names={"Amar","Akbar","Anthony"};
        YoungestTallestFriend y=new YoungestTallestFriend();
        System.out.println("Youngest: "+names[y.indexOfYoungest(ages)]);
        System.out.println("Tallest : "+names[y.indexOfTallest(h)]);
    }
}
