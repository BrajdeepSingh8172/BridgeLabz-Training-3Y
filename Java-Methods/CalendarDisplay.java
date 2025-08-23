import java.util.*;
public class CalendarDisplay {
    int[] mdays={0,31,28,31,30,31,30,31,31,30,31,30,31};
    public boolean isLeap(int y){ return (y%4==0 && y%100!=0) || (y%400==0); }
    public int firstDayOfMonth(int y,int m){
        int q=1; int Y=y; int M=m;
        if(M<3){ M+=12; Y--; }
        int K=Y%100, J=Y/100;
        int h=(q + (13*(M+1))/5 + K + K/4 + J/4 + 5*J)%7;
        int d=((h+6)%7);
        return d;
    }
    public void printCalendar(int m,int y){
        int days=mdays[m]; if(m==2 && isLeap(y)) days=29;
        int fd=firstDayOfMonth(y,m);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for(int i=0;i<fd;i++) System.out.print("    ");
        for(int day=1; day<=days; day++){
            System.out.printf("%3d ", day);
            if((fd+day)%7==0) System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(), y=sc.nextInt();
        new CalendarDisplay().printCalendar(m,y);
    }
}
