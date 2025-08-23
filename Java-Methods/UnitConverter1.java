public class UnitConverter1 {
    public static double convertKmToMiles(double km){ return km*0.621371; }
    public static double convertMilesToKm(double miles){ return miles*1.60934; }
    public static double convertMetersToFeet(double meters){ return meters*3.28084; }
    public static double convertFeetToMeters(double feet){ return feet*0.3048; }
    public static void main(String[] args){
        System.out.printf("1 km = %.6f miles%n", convertKmToMiles(1));
        System.out.printf("1 mile = %.6f km%n", convertMilesToKm(1));
        System.out.printf("1 m = %.6f ft%n", convertMetersToFeet(1));
        System.out.printf("1 ft = %.6f m%n", convertFeetToMeters(1));
    }
}
