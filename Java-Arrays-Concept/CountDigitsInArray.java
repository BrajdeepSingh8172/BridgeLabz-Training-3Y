// Program: CountDigitsInArray
// Description: Placeholder program (filename fixed as requested)

public class CountDigitsInArray {
    public static void main(String[] args) {
        int[] arr = {123, 45, 6, 7890};
        int totalDigits = 0;
        for (int num : arr) {
            totalDigits += String.valueOf(Math.abs(num)).length();
        }
        System.out.println("Total number of digits in array: " + totalDigits);
    }
}
