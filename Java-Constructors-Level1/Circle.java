/**
 * Program 2: Circle - demonstrates constructor chaining using this().
 */
public class Circle {
    private double radius;

    // Default constructor
    public Circle() {
        this(1.0); // default radius
    }

    // Parameterized constructor
    public Circle(double radius) {
        if (radius <= 0) {
            // keep constructor logic minimal; validate only
            throw new IllegalArgumentException("Radius must be positive.");
        }
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public void display() {
        System.out.println("Circle[radius=" + radius + ", area=" + area() + "]");
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(3.5);
        c1.display();
        c2.display();
    }
}