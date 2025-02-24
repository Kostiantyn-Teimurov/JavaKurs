package lesson_11;

// Java - строго типизированный язык. А питон - динамически типизированный язык.
// Каждая переменная должна иметь определенный тип данных. Не может меняться.
// Объявляя переменную мы должны указать тип данных.

public class Variables {
    public static void main(String[] args) {

        int myFirstVariable; // Объявление (декларация) переменной типа int
        myFirstVariable = 1; // Присвоение значения. Инициализация переменной - первое присвоение значения

        System.out.println(myFirstVariable);

        int mySecondVariable = 25;

        System.out.println(mySecondVariable);

        mySecondVariable = 50;

        System.out.println("mySecondVar: " + mySecondVariable);

        byte byteVar = 125;
        byteVar = 0;
        System.out.println("Значение переменной byteVar: " + byteVar);

        short shortVar;
        shortVar = 31000;

        long longVar = 2_100_000_000_000_000L;
        System.out.println(longVar);

        double doubleVar = 10.5421;
        System.out.println(doubleVar);

        float floatVar = 123.564f;


    }
}