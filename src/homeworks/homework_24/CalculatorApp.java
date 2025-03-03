package homeworks.homework_24;

public class CalculatorApp {
    public static void main(String[] args) {

        System.out.println(Calculator.sum(1.3, 2));
        System.out.println(Calculator.difference(3, 20));
        System.out.println(Calculator.product(345.324, 235));
        System.out.println(Calculator.quotient(345.324, 235));
        System.out.println(Calculator.quotient(345.324, 0));
        System.out.printf("%.3f", Calculator.circleLength(-5));
        System.out.println();
        System.out.printf("%.3f", Calculator.circleArea(5));


        System.out.println();
        System.out.println("=====================");
        double d1 = 10.0;
        double result = d1 / 0;

        System.out.println("10.0 // 00: " + result);

        // Infinity - бесконечность
        // Nan - значение не определено (не является числом)

        double inf1 = 1.0 / 0;
        double inf2 = 1000.0 / 0;

        System.out.println(inf1 == inf2);
        System.out.println(inf1 > inf2);

        double res2 = inf1 / inf2;
        System.out.println("inf1 / inf2: " + res2);

        System.out.println("inf1 + 10: " + inf1 + 10);

        System.out.println("inf * (-1): " + (inf1 * -1));

        System.out.println(inf1 == Double.POSITIVE_INFINITY);

    }
}
