// Program: VotingEligibility
// Purpose: Check whether a person can vote (age >= 18).
import java.util.Scanner;

class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
        input.close();
    }
}
