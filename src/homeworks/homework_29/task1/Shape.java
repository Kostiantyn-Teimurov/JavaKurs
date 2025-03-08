package homeworks.homework_29.task1;

public abstract class Shape {
    protected double a;

    public Shape(double a) {
        this.a = a;
    }

    public Shape() {
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}
