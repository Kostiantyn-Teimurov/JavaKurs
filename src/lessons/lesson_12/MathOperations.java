package lessons.lesson_12;

public class MathOperations {
    public static void main(String[] args) {
        int var1 = 20;
        int var2 = 7;
        int result;

        result = 15 + 6;
        System.out.println(result);

        result = var1 + var2;
        System.out.println(result);

        // Целочисленное деление: 20 / 7 = 2 целые и 6 в остатке (2.85)
        result = var1 / var2;
        System.out.println("20 / 7: " + result);

        result = var1 % var2;
        System.out.println(result);

        System.out.println("5 / 10 " + 5 / 10);
        System.out.println("5 % 10: " + 5 % 10);

        // Все числа, записанные в коде с точкой = число в формате double.
        double doubleVar = 20.0;
        double doubleVar2 = 7.0d; // Явно указан, что число записано в формате double

        double doubleRes = doubleVar / doubleVar2;
        System.out.println("doubleRes = " + doubleRes);


    }
}
