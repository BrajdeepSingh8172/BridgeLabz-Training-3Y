package fittrack;

abstract class Workout {
    protected String type;
    protected int duration; // minutes
    public Workout(String type, int duration) { this.type=type; this.duration=duration; }
    public abstract int calculateCalories();
}

class CardioWorkout extends Workout {
    public CardioWorkout(int duration) { super("Cardio", duration); }
    @Override public int calculateCalories() { return duration * 8; }
}

class StrengthWorkout extends Workout {
    public StrengthWorkout(int duration) { super("Strength", duration); }
    @Override public int calculateCalories() { return duration * 6; }
}

class UserProfile {
    private String name;
    private int age;
    private double weight;
    private int dailyTarget;

    public UserProfile(String name, int age, double weight, int dailyTarget) {
        this.name=name; this.age=age; this.weight=weight; this.dailyTarget=dailyTarget;
    }

    public void printProgress(Workout w) {
        int burned = w.calculateCalories();
        System.out.println(name + " burned " + burned + " calories. Remaining: " + (dailyTarget - burned));
    }
}

public class FitTrackDemo {
    public static void main(String[] args) {
        UserProfile up = new UserProfile("Sam",30,70,500);
        Workout w = new CardioWorkout(60);
        up.printProgress(w);
    }
}
