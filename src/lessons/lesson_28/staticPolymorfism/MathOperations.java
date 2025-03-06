package lessons.lesson_28.staticPolymorfism;


// В Java полиморфизм проявляется в двух формах:

// 1. Статический (компиляционный) полиморфизм - реализуется с помощью перегрузки методов (Method Overloading)

// 2. Динамический (исполнительный) полиморфизм - реализуется через переопределение методов (Method Overriding)

// Переопределение позволяет подклассам (наследникам) изменять поведение методов родительского класса

// Переопределение методов происходит когда наследник предоставляет специфическую реализацию метода который уже определен
// в родительском классе (суперКлассе)

public class MathOperations {

    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(double a, double b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }


    public static void main(String[] args) {
        System.out.println(sum(1, 2));
    }

}
