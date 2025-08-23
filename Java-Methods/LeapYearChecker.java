import java.util.*;
public class LeapYearChecker {
    public boolean isLeap(int year){
        if(year<1582) return false;
        return (year%4==0 && year%100!=0) || (year%400==0);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        System.out.println(new LeapYearChecker().isLeap(y) ? "Leap Year" : "Not a Leap Year");
    }
}
