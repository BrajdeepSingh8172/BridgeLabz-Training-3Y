public class UnitConverter3 {
    public static double convertFarhenheitToCelsius(double f){ return (f-32)*5.0/9.0; }
    public static double convertCelsiusToFarhenheit(double c){ return (c*9.0/5.0)+32; }
    public static double convertPoundsToKilograms(double p){ return p*0.453592; }
    public static double convertKilogramsToPounds(double k){ return k*2.20462; }
    public static double convertGallonsToLiters(double g){ return g*3.78541; }
    public static double convertLitersToGallons(double l){ return l*0.264172; }
    public static void main(String[] args){
        System.out.printf("212 F = %.2f C%n", convertFarhenheitToCelsius(212));
        System.out.printf("100 C = %.2f F%n", convertCelsiusToFarhenheit(100));
        System.out.printf("1 lb = %.6f kg%n", convertPoundsToKilograms(1));
        System.out.printf("1 kg = %.6f lb%n", convertKilogramsToPounds(1));
        System.out.printf("1 gal = %.6f L%n", convertGallonsToLiters(1));
        System.out.printf("1 L = %.6f gal%n", convertLitersToGallons(1));
    }
}
