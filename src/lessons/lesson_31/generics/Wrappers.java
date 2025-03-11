package lessons.lesson_31.generics;

public class Wrappers {

    // Классы-обертки используются для представления примитивных типов как объектов (как ссылочных)

    /*
    Byte - обертка byte
    Short - обертка short
    Integer - обертка int
    Long - обертка long
    Float - обертка float
    Double - обертка double
    Character - обертка char
    Boolean - обертка boolean
     */


    public static void main(String[] args) {

        Integer maxValue = Integer.MAX_VALUE;
        System.out.println("max: " + maxValue);
        Integer minValue = Integer.MIN_VALUE;
        System.out.println("min: " + minValue);

        // Поддержка null
//            int x = null; примитив null не поддерживал
        maxValue = null;

        // Приведение типов. Автоупаковка и автораспаковка

        Integer wrapperInt = 5; // Автоупаковка примитива int в ссылочный тип Integer
        System.out.println(wrapperInt);

        int primitiveInt = wrapperInt; // Автораспаковка. Из типа Integer автоматически преобразована в примитив типа int
        System.out.println(primitiveInt);

        System.out.println("\n================================");


        // Сравнение объектов
        // -128...127 - Кеширование

        Integer a = 127; // Создан объект с адресом в памяти @2aaa2
        Integer b = 127; // Объект с таким значением уже есть, новый не создается. Выдается ссылка на уже существующий -> @2aaa2
        // Сравниваем значения, записанные в переменных (т.е. ссылки, т.е. адреса объектов в памяти
        System.out.println(a == b); // true

        Integer c = 128; // Создан объект с адресом в памяти @3bbb3
        Integer d = 128; // НЕ проверяется. Создается новая ссылка
        System.out.println("128 == 128: " + (c == d)); // false


        // Лучше использовать метод .equals
        System.out.println("a.equals(b): " + a.equals(b)); // true
        System.out.println("c.equals(d): " + c.equals(d)); // true


        System.out.println("===========================");

        // Общие схожие методы, которыми обладают классы-обертки.

    }

}
