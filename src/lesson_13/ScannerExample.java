package lesson_13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        // Строка подготавливает программу для чтения данных из стандартного потока ввода
        // от пользователя через клавиатуру
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        // Читает всю строку, введенную пользователем - и возвращает ее в виде String
        String name = scanner.nextLine();
        System.out.println("Привет, " + name);

        // Прочитать число
        System.out.println("Введите ваш возраст:");
        int age = scanner.nextInt(); // Считает одно число типа int

        // Всегда после nexInt, nexDouble нужно вызвать просто метод nextLine, чтобы скушать остаток строки
        scanner.nextLine();
        System.out.println("Age: " + age);

        System.out.println("Введите город:");
        String city = scanner.nextLine();
        System.out.println("City: " + city);


        // Чтение токенами чисел
        // Разделитель - пробельный символ
        // \s+ - пробельный символ:
        // - пробел, знак табуляции, перевод каретки /n, возврат каретки \r


        System.out.println("Введите число PI: ");
        double pi = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Pi: " + pi);


    }
}
