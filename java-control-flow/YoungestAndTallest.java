// Program: YoungestAndTallest
// Purpose: Among Amar, Akbar, Anthony - find youngest (min age) and tallest (max height).
import java.util.Scanner;

class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ageAmar = input.nextInt(); int heightAmar = input.nextInt();
        int ageAkbar = input.nextInt(); int heightAkbar = input.nextInt();
        int ageAnthony = input.nextInt(); int heightAnthony = input.nextInt();

        int minAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        int maxHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));

        String youngest = (minAge == ageAmar ? "Amar " : "") +
                          (minAge == ageAkbar ? "Akbar " : "") +
                          (minAge == ageAnthony ? "Anthony " : "");
        String tallest = (maxHeight == heightAmar ? "Amar " : "") +
                         (maxHeight == heightAkbar ? "Akbar " : "") +
                         (maxHeight == heightAnthony ? "Anthony " : "");

        System.out.println("Youngest: " + youngest.trim());
        System.out.println("Tallest : " + tallest.trim());
        input.close();
    }
}
