
import java.util.ArrayList;
import java.util.List;

public class Online_quiz {

    // Method to calculate score of a user
    public static int calculateScore(String[] correctAnswers, String[] userAnswers) {
        int score = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (userAnswers[i].equalsIgnoreCase(correctAnswers[i])) {
                score++;
            }
        }
        return score;
    }

    // Method to assign grade based on score
    public static String getGrade(int score, int totalQuestions) {
        double percentage = (score * 100.0) / totalQuestions;

        if (percentage >= 90) return "A";
        else if (percentage >= 75) return "B";
        else if (percentage >= 50) return "C";
        else if (percentage >= 35) return "D";
        else return "F";
    }

    public static void main(String[] args) {
        // Correct Answers
        String[] correctAnswers = {"A", "B", "C", "D", "A"};



        // Multiple users' answers
        String[] user1Answers = {"A", "B", "C", "D", "A"}; // all correct
        String[] user2Answers = {"A", "C", "C", "D", "B"}; // example answers for user2
        String[] user3Answers = {"B", "B", "A", "D", "A"}; // example answers for user3
        // Store user scores
        List<Integer> scores = new ArrayList<>();
        int score1 = calculateScore(correctAnswers, user1Answers);
        scores.add(score1);
        System.out.println("User1 Score: " + score1 + "/" + correctAnswers.length +
                " Grade: " + getGrade(score1, correctAnswers.length));
        System.out.println("User1 Score: " + score1 + "/" + correctAnswers.length +
                " Grade: " + getGrade(score1, correctAnswers.length));

        // Process user2
        int score2 = calculateScore(correctAnswers, user2Answers);
        scores.add(score2);
        System.out.println("User2 Score: " + score2 + "/" + correctAnswers.length +
                " Grade: " + getGrade(score2, correctAnswers.length));

        // Process user3
        int score3 = calculateScore(correctAnswers, user3Answers);
        scores.add(score3);
        System.out.println("User3 Score: " + score3 + "/" + correctAnswers.length +
                " Grade: " + getGrade(score3, correctAnswers.length));

        // Print all scores
        System.out.println("\nAll Users' Scores: " + scores);
    }
}