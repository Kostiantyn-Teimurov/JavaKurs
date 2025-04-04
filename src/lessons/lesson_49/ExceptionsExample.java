package lessons.lesson_49;

import javax.sound.midi.Soundbank;
import java.net.MalformedURLException;
import java.net.URL;

public class ExceptionsExample {

    public static void main(String[] args) {

        // Ошибки компиляции
//        int a = "Java";
//        int x = 10


        // Ошибка Runtime (время выполнения)

        // Exception (исключения) - представляют собой событие, которые, могут возникнуть во время выполнения программы
        // и нарушить ее нормальное выполнение

        // Исключение в Java является объектом определенного класса, который наследуется от класса Throwable().

        // Обработка ошибок - предусмотреть возможность появления Exception (объекта определенного класса)
        // и написать како-то код, который будет выполнен в этом случае возникновении ошибки

        /*
        try-catch

        try {
                // код, который может вызвать исключение
            } catch (ExceptionType name) {
                // код для обработки ошибки
                // код, который будет выполнен при возникновении объекта определенного класса
            } catch (AnotherExceptionType #2) {
                // Kod обработки другого типа ошибки. Нужно писать от меньшего к большему
            } finally {
                // код, который будет выполнен в любом случае перед выходи из конструкции try-catch
                // хороший тон, после закрытия какого-то блока - подключения базы данных или фреймворка
            }
         */


        int[] array = {1, 23, 4};
//        array[10] = 100; // java.lang.ArrayIndexOutOfBoundsException

        try {
            array[2] = 10;
            System.out.println("Try continue");
            array[10] = 100;
            System.out.println("Try continue #2");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Что-то не так с индексом: " + exception.getMessage());
        } catch (Exception ex) {
            System.out.println("Какая-то ошибка");
        } finally {
            System.out.println("Finally\n");
        }

//        int x = 10 / 0; // java.lang.ArithmeticException

        System.out.println("Продолжение работы программы");


        System.out.println("=======================");
        try {
            array[2] = 10;
            System.out.println("Try continue");
            array[10] = 100;
            System.out.println("Try continue #2");
        } catch (Exception ex) {
            System.out.println("Какая-то ошибка");
            ex.printStackTrace();
        }

        System.out.println("\n====================");

        System.err.println("Печатаю в потоке ошибок");

        System.out.println("\n=====================");


        // Проверяемые (checked exception) и непроверяемые исключения

        // Проверяемые (checked exception) - это тип исключения, наличие которых вы обязаны проверить и обработать

        // Непроверяемые исключения - это исключения, возможность появления которых, я не обязан обрабатывать

        String result = getUrlString();
        System.out.println("result: " + result);


        System.out.println("+==================\n");

        String result2;
        try {
            result2 = getUrlString2();
        } catch (MalformedURLException e) {
            System.out.println("MalformedURLException: " + e.getMessage());
            result2 = "http://google.com";
        }

        System.out.println("result2: " + result2);

    }


    private static String getUrlString() {
        URL myUrl = null;

        // Бросает проверяемое исключение

        try {
            myUrl = new URL("htt://example.com");
        } catch (MalformedURLException e) {
            System.out.println("Неверный формат URL: " + e.getMessage());
            return "http://google.com";
        }

        return myUrl.toString();

    }


    // Ключевое слово throws - используется в сигнатуре метода для указания, что метод может выбросить исключение
    private static String getUrlString2() throws MalformedURLException {
        URL myUrl = new URL("htt://example.com");
        return myUrl.toString();
    }


}
