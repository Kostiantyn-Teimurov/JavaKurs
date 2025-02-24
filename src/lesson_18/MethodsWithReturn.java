package lesson_18;

public class MethodsWithReturn {
    public static void main(String[] args) {


        // Возвращаемое значение - это результат, который метод отправляет обратно вызывающему его (метод) коду после завершения.
        // Это способ передать результат вычислений метода в другие части программы.

        // int sum = 10 + 5;
        calculateSum(10, 5);

        int sum = calculateSum(10, 5);
        sum = calculateSum(10, 5) + calculateSum(20, 30);


        // Написать метод, возвращающий 2 в степени X. X метод получает в качестве параметра

        double pow = powTwo(3);
        System.out.println("powTwo(3): " + pow);
        System.out.println("powTwo(0): " + powTwo(0));
        System.out.println("powTwo(-3): " + powTwo(-3));

        test(5);
        test(-10);
        test(3);

    } // Method area


    public static void test(int x) {
        // Не печатать числа, если х = 3;
        if (x == 3) {
            // Как-то прервать работу метода!
            return; // Прервать работу метода.
        }
        // Печатает числа от 0 до х
        for (int i = 0; i < x; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }


    public static double powTwo(int x) {
        // 2 ^ x
        // 2 ^ 3 = 2 * 2 * 2 = 8
        boolean isPositive = x >= 0;

        // если х отрицательный - то отбросить знак числа
        if (x < 0) x *= -1;

        int result = 1;
        for (int i = 1; i <= x; i++) {
            result = result * 2;
        }
        if (isPositive) {
            return result;
        } else {
            return (double) 1 / result;
        }
    }


    /*
    public static int test(int x) {
        return -1;
    }

    public static double test(double x) {
        return -10.0;
    }

     */

    /*  Это не перегрузка метода. double не меняет сути
        Сигнатура метода - имя и тип параметра.
        Это определяет уникальность метода.

    public static double test(int x) {
        return -10.0;
    }

     */


    public static int calculateSum(int a, int b) {
        int result = a + b;
        System.out.println(result);
        return result; // return - оператор, заканчивающий работу метода и возвращающий значение
    }


} // End class
