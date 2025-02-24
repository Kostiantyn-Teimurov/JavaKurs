package lesson_14;

import java.util.Locale;
import java.util.Scanner;

public class ScannerLocal {
    public static void main(String[] args) {

        String data = "3,14 42,7";


        Scanner sc = new Scanner(data);

        // sc.useLocale(Locale.US); - Вызывать определенную локаль

        // Locale - используется локаль вашей системы для определения формата чисел.
        // И каким знаком отделяется дробная часть числа

        System.out.println(Locale.getDefault());

        // Locale.US - дробная часть отделяется точкой (.)
        // остальное - запятой (,)

        System.out.println(sc.nextDouble());
        System.out.println(sc.nextDouble());


        String text = "42,3,Java,3.14,Hello";
        Scanner scanner = new Scanner(text);
        scanner.useLocale(Locale.US); // Устанавливаем для сканера локаль
        scanner.useDelimiter(",");

        System.out.println(scanner.next());
        String java = scanner.next();   // next() читает токен и преобразовывает в String
        System.out.println(java);
        System.out.println(scanner.next());
        System.out.println(scanner.next());

        scanner.reset(); // - Вернутся к стандартному разделителю


    }
}
