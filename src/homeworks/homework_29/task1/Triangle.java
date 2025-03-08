package homeworks.homework_29.task1;

public class Triangle extends Shape {
    private double b;
    private double c;
    private double perimeter;

    public Triangle(double a, double b, double c) {
        super(a);
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double p = perimeter / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double calculatePerimeter() {
        perimeter = a + b + c;
        return perimeter;
    }
}
