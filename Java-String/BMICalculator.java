import java.util.*;
public class BMICalculator {
    static String[] bmiRow(double kg,double cm){
        double m=cm/100.0;
        double bmi=kg/(m*m);
        String status=bmi<18.5?"Underweight":bmi<25?"Normal":bmi<30?"Overweight":"Obese";
        return new String[]{String.valueOf(kg),String.valueOf(cm),String.format("%.2f",bmi),status};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=10;
        double[][] hw=new double[n][2];
        for(int i=0;i<n;i++){
            double w=sc.nextDouble();
            double h=sc.nextDouble();
            hw[i][0]=w; hw[i][1]=h;
        }
        String[][] t=new String[n][4];
        for(int i=0;i<n;i++) t[i]=bmiRow(hw[i][0],hw[i][1]);
        System.out.println("Weight Height BMI Status");
        for(String[] r:t) System.out.println(String.join(" ",r));
    }
}
