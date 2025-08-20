
// Program: Voting Eligibility for 10 students
// Description: Reads age of 10 students and prints if each can vote

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ages = new int[10];

        System.out.println("Enter age of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            ages[i] = input.nextInt();
        }

        for (int age : ages) {
            if (age < 0) {
                System.out.println("Invalid age entered.");
            } else if (age >= 18) {
                System.out.println("Student with age " + age + " can vote.");
            } else {
                System.out.println("Student with age " + age + " cannot vote.");
            }
        }
        input.close();
    }
}
