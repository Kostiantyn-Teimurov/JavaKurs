package lesson_25;

// Константа считается НЕ та переменная, которую нельзя изменить в рамках одного объекта.
// Ее не может изменить НИ ОДИН объект класса, в котором она находится.
// Создается и инициализируется один раз для всех экземпляров класса.

// static - делает переменную единственной для всех экземпляров класса
// + final делает ее неизменяемой

public class ConstantDemo {

    public static final double PI = 3.141519; // Константа. Большими буквами
    public static final String COUNTRY = "Germany";
    public static final String[] COLORS = {"blue", "red", "green"}; // - НЕ константа

    public static final int[] ints = new int[5]; // Не является константой, состояние объекта (значения в массиве) можно изменить

    public static double doublePiSqrt() {
        double result = 2 * PI * PI;
        return result;
    }

}
