import java.util.*;
public class CollinearPoints {
    public boolean collinearSlope(int x1,int y1,int x2,int y2,int x3,int y3){
        long abY=y2-y1, abX=x2-x1, bcY=y3-y2, bcX=x3-x2, acY=y3-y1, acX=x3-x1;
        return abY*bcX==bcY*abX && abY*acX==acY*abX;
    }
    public boolean collinearArea(int x1,int y1,int x2,int y2,int x3,int y3){
        long area = (long)x1*(y2-y3) + (long)x2*(y3-y1) + (long)x3*(y1-y2);
        return area==0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt(), y1=sc.nextInt(), x2=sc.nextInt(), y2=sc.nextInt(), x3=sc.nextInt(), y3=sc.nextInt();
        CollinearPoints c=new CollinearPoints();
        System.out.println("By slope: "+c.collinearSlope(x1,y1,x2,y2,x3,y3));
        System.out.println("By area : "+c.collinearArea(x1,y1,x2,y2,x3,y3));
    }
}
