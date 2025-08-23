import java.util.*;
public class MonthlyCalendar {
    static String monthName(int m){
        String[] names={"January","February","March","April","May","June","July","August","September","October","November","December"};
        return names[m-1];
    }
    static boolean leap(int y){
        return (y%4==0&&y%100!=0)||y%400==0;
    }
    static int daysInMonth(int m,int y){
        int[] d={31,28,31,30,31,30,31,31,30,31,30,31};
        if(m==2&&leap(y)) return 29;
        return d[m-1];
    }
    static int firstDay(int d,int m,int y){
        int y0=y-(14-m)/12;
        int x=y0+y0/4-y0/100+y0/400;
        int m0=m+12*((14-m)/12)-2;
        return (d+x+(31*m0)/12)%7;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int y=sc.nextInt();
        int fd=firstDay(1,m,y);
        int days=daysInMonth(m,y);
        System.out.println(monthName(m)+" "+y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for(int i=0;i<fd;i++) System.out.print("    ");
        int w=fd;
        for(int day=1;day<=days;day++){
            System.out.printf("%3d ",day);
            w++;
            if(w==7){ System.out.println(); w=0; }
        }
        if(w!=0) System.out.println();
    }
}
