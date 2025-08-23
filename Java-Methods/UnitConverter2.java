public class UnitConverter2 {
    public static double convertYardsToFeet(double yards){ return yards*3.0; }
    public static double convertFeetToYards(double feet){ return feet*0.333333; }
    public static double convertMetersToInches(double meters){ return meters*39.3701; }
    public static double convertInchesToMeters(double inches){ return inches*0.0254; }
    public static double convertInchesToCentimeters(double inches){ return inches*2.54; }
    public static void main(String[] args){
        System.out.printf("1 yd = %.6f ft%n", convertYardsToFeet(1));
        System.out.printf("3 ft = %.6f yd%n", convertFeetToYards(3));
        System.out.printf("1 m = %.6f in%n", convertMetersToInches(1));
        System.out.printf("1 in = %.6f m%n", convertInchesToMeters(1));
        System.out.printf("1 in = %.6f cm%n", convertInchesToCentimeters(1));
    }
}
