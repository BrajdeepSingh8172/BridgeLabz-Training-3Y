package petpal;

abstract class Pet {
    protected String name;
    protected String type;
    protected int age;
    private int hunger = 50; // 0-100
    private int mood = 50;

    public Pet(String name, String type, int age) { this.name=name; this.type=type; this.age=age; }

    protected void changeHunger(int delta) { hunger = Math.max(0, Math.min(100, hunger + delta)); }
    protected void changeMood(int delta) { mood = Math.max(0, Math.min(100, mood + delta)); }

    public abstract void feed();
    public abstract void play();
    public abstract void makeSound();
}

class Dog extends Pet {
    public Dog(String name, int age) { super(name, "Dog", age); }
    public void feed() { changeHunger(-20); System.out.println(name + " wags tail and eats"); }
    public void play() { changeMood(20); System.out.println(name + " plays fetch"); }
    public void makeSound() { System.out.println("Woof!"); }
}

class Cat extends Pet {
    public Cat(String name, int age) { super(name, "Cat", age); }
    public void feed() { changeHunger(-15); System.out.println(name + " purrs and eats"); }
    public void play() { changeMood(15); System.out.println(name + " chases a toy"); }
    public void makeSound() { System.out.println("Meow!"); }
}

public class PetPalDemo {
    public static void main(String[] args) {
        Dog d = new Dog("Buddy",3);
        Cat c = new Cat("Mimi",2);
        d.feed(); d.play(); d.makeSound();
        c.feed(); c.play(); c.makeSound();
    }
}
