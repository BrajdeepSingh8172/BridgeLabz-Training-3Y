// Program: LeapYear
// Purpose: Check whether a year is leap year.
import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        boolean leap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        System.out.println(leap ? "leap year" : "not a leap year");
        input.close();
    }
}
