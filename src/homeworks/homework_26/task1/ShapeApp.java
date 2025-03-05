package homeworks.homework_26.task1;

public class ShapeApp {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle("Rect1", 4.0, 3.0);
        rectangle.setDimensions(5.0, 6.0);
        rectangle.setColor("Red"); // унаследованный от Shape метод
        rectangle.displayInfo(); // тоже унаследован
        rectangle.calculateArea(); // это метод класса Rectangle

        System.out.println("\n================");

        Circle circle = new Circle("Circle1", "yellow", 5.0);
        circle.displayInfo(); // Унаследован
        circle.setRadius(10); // свои методы
        circle.calculateArea(); // методы класса Circle
    }
}
