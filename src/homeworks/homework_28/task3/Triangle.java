package homeworks.homework_28.task3;

public class Triangle extends Figure {

    private double a;
    private double b;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return (a * b) / 2;
    }
}
