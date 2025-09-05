/**
 * Program 3: Person - copy constructor example.
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this(other.name, other.age);
    }

    public void display() {
        System.out.println("Person[name=" + name + ", age=" + age + "]");
    }

    public static void main(String[] args) {
        Person p1 = new Person("Aarav", 22);
        Person p2 = new Person(p1);
        p1.display();
        p2.display();
    }
}