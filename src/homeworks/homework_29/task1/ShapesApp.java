package homeworks.homework_29.task1;

public class ShapesApp {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        System.out.println(circle.calculatePerimeter());
        System.out.println(circle.calculateArea());

        Rectangle rectangle = new Rectangle(5, 4);
        System.out.println(rectangle.calculatePerimeter());
        System.out.println(rectangle.calculateArea());

        Triangle triangle = new Triangle(4, 5, 7);
        System.out.println(triangle.calculatePerimeter());
        System.out.println(triangle.calculateArea());


        Shape[] shapes = new Shape[3];
        shapes[0] = circle;
        shapes[1] = rectangle;
        shapes[2] = triangle;

        double allArea = 0;
        double allPerimeter = 0;

        for (int i = 0; i < shapes.length; i++) {
            allPerimeter += shapes[i].calculatePerimeter();
            allArea += shapes[i].calculateArea();
        }

        System.out.printf("Периметр фигур: %.2f. Площадь фигур: %.2f\n", allPerimeter, allArea);

    }
}
