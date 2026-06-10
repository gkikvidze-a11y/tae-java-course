package homework7;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Shape s1 = new Rectangle(4, 5);
        System.out.println(s1.area()); // 20.0

        Shape s2 = new Circle(3);
        System.out.printf("%.2f\n", s2.area());
    }
}