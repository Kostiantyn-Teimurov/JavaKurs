package homeworks.homework_24;

public class Calculator {

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
        return 0;
        // Todo что возвратить, если не нужно возвращать?
    }

}
