package homeworks.homework_25;

public class Calculator {

    public static final double PI = Math.PI;

    public static double sum(double x, double y) {
        return x + y;
    }

    public static double difference(double x, double y) {
        return x - y;
    }

    public static double product(double x, double y) {
        return x * y;
    }

    public static double quotient(double x, double y) {
        if (y != 0) {
            return x / y;
        }
        System.out.print("Деление на ноль! ");
        return Integer.MAX_VALUE;
        // Todo что возвратить, если не нужно возвращать?
    }

    public static double circleLength(double r) {
        if (r < 0) {
            System.out.println("Error");
            return Integer.MIN_VALUE;
        }
        return 2 * PI * r;
    }

    public static double circleArea(double r) {
        if (r < 0) {
            System.out.println("Error");
            return Integer.MIN_VALUE;
        }
        return PI * (r * r);
    }

}
