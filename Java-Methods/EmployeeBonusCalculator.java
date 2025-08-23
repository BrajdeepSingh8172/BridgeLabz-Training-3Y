import java.util.*;
public class EmployeeBonusCalculator {
    public int[][] generateSalaryAndYears(int n){
        int[][] a=new int[n][2];
        for(int i=0;i<n;i++){ a[i][0]= (int)(Math.random()*90000)+10000; a[i][1]= (int)(Math.random()*11); }
        return a;
    }
    public double[][] computeNewSalaryAndBonus(int[][] data){
        double[][] r=new double[data.length][2];
        for(int i=0;i<data.length;i++){
            double rate = data[i][1]>5 ? 0.05 : 0.02;
            double bonus = data[i][0]*rate;
            r[i][0]=data[i][0]+bonus;
            r[i][1]=bonus;
        }
        return r;
    }
    public static void main(String[] args){
        EmployeeBonusCalculator e=new EmployeeBonusCalculator();
        int[][] base=e.generateSalaryAndYears(10);
        double[][] res=e.computeNewSalaryAndBonus(base);
        long sumOld=0; double sumNew=0, sumBonus=0;
        System.out.println("Idx  OldSalary  Years  NewSalary   Bonus");
        for(int i=0;i<10;i++){
            System.out.printf("%3d  %9d  %5d  %9.2f  %8.2f%n", i, base[i][0], base[i][1], res[i][0], res[i][1]);
            sumOld+=base[i][0]; sumNew+=res[i][0]; sumBonus+=res[i][1];
        }
        System.out.printf("Totals -> Old: %d  New: %.2f  Bonus: %.2f%n", sumOld, sumNew, sumBonus);
    }
}
