package homeworks.homework_28.task3;

public class Circle extends Figure {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * r * r;
    }
}
