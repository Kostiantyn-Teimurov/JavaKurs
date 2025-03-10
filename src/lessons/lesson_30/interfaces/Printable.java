package lessons.lesson_30.interfaces;


// Интерфейс содержит только поведение, которое
public interface Printable {
    // Интерфейс - это совокупность абстрактных методов, задающих поведение
    // Интерфейс - косвенно абстрактный по умолчанию. Не нужно писать abstract.


    // Могут быть константы (public static final)
    public static final String color = "black";


    // Все методы интерфейса косвенно (неявно и по умолчанию) и абстрактные и публичные
//    public abstract
    void print();


    // Начиная с JDK 8 доступны методы по умолчанию (имеющие реализацию)

    default void defaultMethod() {
        System.out.println("Default Method");
    }


    // Начиная с JDK 8 доступны статические методы

    static void testStatic(String str) {
        System.out.println("Static method: " + str);
    }

    // С JDK 9 появились приватные метода *могут быть статические и не стат.
    // Переопределить в классе НЕВОЗМОЖНО!

}
