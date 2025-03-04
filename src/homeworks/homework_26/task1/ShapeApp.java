package homeworks.homework_26.task1;

public class ShapeApp {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();

        rectangle.setDimensions(5, 4);
        circle.setRadius(7);

        rectangle.name = "Rectangle1";
        circle.name = "Circle1";

        rectangle.displayInfo();
        circle.displayInfo();

        rectangle.calculateArea();
        circle.calculateArea();

        rectangle.setColor("red");
        circle.setColor("black");

        rectangle.displayInfo();
        circle.displayInfo();

    }
}
