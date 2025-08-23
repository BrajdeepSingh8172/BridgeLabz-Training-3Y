import java.util.*;
public class RandomArrayStats {
    public int[] generate4DigitRandomArray(int size){ int[] a=new int[size]; for(int i=0;i<size;i++) a[i]=(int)(Math.random()*9000)+1000; return a; }
    public double[] findAverageMinMax(int[] a){
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE; long sum=0;
        for(int v:a){ if(v<min) min=v; if(v>max) max=v; sum+=v; }
        return new double[]{sum*1.0/a.length, min, max};
    }
    public static void main(String[] args){
        RandomArrayStats r=new RandomArrayStats();
        int[] a=r.generate4DigitRandomArray(5);
        double[] s=r.findAverageMinMax(a);
        System.out.println("Numbers: "+Arrays.toString(a));
        System.out.printf("Average: %.2f, Min: %d, Max: %d%n", s[0], (int)s[1], (int)s[2]);
    }
}
