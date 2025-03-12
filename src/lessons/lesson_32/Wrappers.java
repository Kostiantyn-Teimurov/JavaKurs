package lessons.lesson_32;

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

        // .valueOf() - преобразует явным образом примитив или строку в объект типа обертки

        Integer e = Integer.valueOf(127);
        Integer e1 = Integer.valueOf("127");
        System.out.println(e + " | " + e1);

        Double dbl = Double.valueOf(154.5);
        System.out.println("dbl: " + dbl);


        Boolean bol = Boolean.valueOf("true");
        System.out.println("bol: " + bol);

        System.out.println("==============================");

        // parseXXX() - преобразует строку в соответствующий примитив
        double dblP = Double.parseDouble("456"); // Возвращает примитив
        Double dblD = Double.valueOf("456"); // Возвращает ссылочный тип

        System.out.println(dblP + " | " + dblD);

        System.out.println(Integer.parseInt("123"));


        // toString - переопределен метод, который возвращает строковое представление числа
        // equals - сравнивает два объекта по значению

        Integer i1 = 127;
        Integer i2 = 256;

        System.out.println(i1 > i2);

        // compareTo - сравнивает текущий объект с другим. Кто больше?
        // Возвращаемое значение int
        System.out.println("i1.compareTo(i2): " + i1.compareTo(i2));
        /*
        i1 > i2 -> 1
        i1 < i2 -> -1
        i1 = i2 -> 0
         */

        System.out.println("\n===========================");
        // xxxValue() - возвращает значение объекта как примитивный тип

        Double d2 = 125.67; // Автоупаковка. Примитивный тип автоматом упаковывается в ссылочный тип
        d2 = Double.valueOf(125.67); // Явная принудительная упаковка
        double dPrimitive = d2; // Автораспаковка
        dPrimitive = d2.doubleValue(); // Явная принудительная Распаковка.

        System.out.println("\n=======================");
        /*
        Абстрактный класс Number. Все числовые обертки наследуются от абстрактного класса Number.
        Byte, Short, Integer, Long, Float, Double
         */

        /*
        byteValue()
        shortValue()
        intValue()
        longValue()
        floatValue()
        doubleValue()
         */

        //

        Integer integer = 31844;
        double dVal = integer.doubleValue();
        System.out.println(dVal);
        System.out.println(integer.longValue());

        Double dblWrapper = 245.78;
        int iVal = dblWrapper.intValue();
        System.out.println(iVal);

        System.out.println(dblWrapper.byteValue());
        System.out.println(dblWrapper.shortValue());


    }

}
