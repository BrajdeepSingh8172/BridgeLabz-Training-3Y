import java.util.*;
public class BMICalculator {
    public double bmi(double kg,double cm){ double m=cm/100.0; return kg/(m*m); }
    public String status(double bmi){
        if(bmi<18.5) return "Underweight";
        if(bmi<25) return "Normal";
        if(bmi<30) return "Overweight";
        return "Obese";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[][] data=new double[10][3];
        BMICalculator b=new BMICalculator();
        for(int i=0;i<10;i++){
            double w=sc.nextDouble(); double h=sc.nextDouble();
            double bm=b.bmi(w,h);
            data[i][0]=w; data[i][1]=h; data[i][2]=bm;
        }
        System.out.println("Idx  Weight(kg) Height(cm) BMI     Status");
        for(int i=0;i<10;i++){
            System.out.printf("%3d  %9.2f  %10.2f  %6.2f  %s%n", i, data[i][0], data[i][1], data[i][2], b.status(data[i][2]));
        }
    }
}
