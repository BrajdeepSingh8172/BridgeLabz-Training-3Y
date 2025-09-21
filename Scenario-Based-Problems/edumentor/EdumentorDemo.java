package edumentor;

import java.util.*;

abstract class User {
    protected String name;
    protected String email;
    protected String userId;
    public User(String id, String name, String email) { this.userId=id; this.name=name; this.email=email; }
}

class Learner extends User {
    public Learner(String id, String name, String email) { super(id,name,email); }
}

class Instructor extends User {
    public Instructor(String id, String name, String email) { super(id,name,email); }
}

interface ICertifiable {
    String generateCertificate(String courseName);
}

class Quiz {
    private List<String> questions;
    private Map<Integer,String> answers = new HashMap<>();
    private int score = 0;

    public Quiz(List<String> questions) { this.questions = new ArrayList<>(questions); }

    public void answer(int qIndex, String ans) { answers.put(qIndex, ans); }
    public void setScore(int score) { this.score = score; }
    public double percentage(int maxScore) { return (100.0 * score) / maxScore; }
}

class ShortCourse implements ICertifiable {
    public String generateCertificate(String courseName) { return "Certificate(for short course): " + courseName; }
}
class FullTimeCourse implements ICertifiable {
    public String generateCertificate(String courseName) { return "Diploma: " + courseName; }
}

public class EduMentorDemo {
    public static void main(String[] args) {
        Learner l = new Learner("L1","Riya","riya@mail.com");
        ICertifiable cert = new FullTimeCourse();
        System.out.println(cert.generateCertificate("Java Mastery"));
        Quiz q = new Quiz(Arrays.asList("Q1","Q2"));
        q.setScore(18);
        System.out.println("Percent: " + q.percentage(20));
    }
}
