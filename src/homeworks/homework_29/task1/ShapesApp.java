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
            double area = shapes[i].calculateArea();
            double perimeter = shapes[i].calculatePerimeter();
            System.out.printf("%s\n%s: площадь: %.2f; периметр: %.2f\n",
                    shapes[i].getClass(), shapes[i].getClass().getSimpleName(), area, perimeter);
            allPerimeter += shapes[i].calculatePerimeter();
            allArea += shapes[i].calculateArea();
            System.out.println("======================");
        }

        System.out.printf("Периметр фигур: %.2f. Площадь фигур: %.2f\n", allPerimeter, allArea);


        // Невозможно создать приватный конструктор

        // не будет создан объект = вернутся null
        CircleSingleTone single = CircleSingleTone.getCircle(-5);
        System.out.println(single);

        CircleSingleTone circleSingle = CircleSingleTone.getCircle(5);
        System.out.println(circleSingle);
    }
}
