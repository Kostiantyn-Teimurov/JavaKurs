package homeworks.homework_28.task3;

public class Square extends Figure {

    private double l;

    public Square(double l) {
        this.l = l;
    }

    @Override
    public double calculateArea() {
        return l * l;
    }
}
