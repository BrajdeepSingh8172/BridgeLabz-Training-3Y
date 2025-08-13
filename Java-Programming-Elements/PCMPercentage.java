
// Program: Calculate average percent marks in PCM
// Author: Your Name
// Date: 2025-08-13

class PCMPercentage {
    public static void main(String[] args) {
        String name = "Sam";
        int mathsMarks = 94;
        int physicsMarks = 95;
        int chemistryMarks = 96;
        int totalSubjects = 3;
        double totalMarks = mathsMarks + physicsMarks + chemistryMarks;
        double averageMarks = totalMarks / totalSubjects;
        System.out.println(name + "'s average mark in PCM is " + averageMarks);
    }
}
