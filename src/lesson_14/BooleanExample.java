package lesson_14;

public class BooleanExample {
    public static void main(String[] args) {

        boolean boll1 = true;
        boll1 = false;

        System.out.println(boll1);

        int x = 10;
        int y = 5;

        boolean b1 = x == y;
        System.out.printf("%s == %s -> %s\n", x, y, b1);

        b1 = x != y;
        System.out.printf("%s != %s -> %s\n", x, y, b1);

        b1 = 10 >= 10;
        System.out.println(b1);


        String str = "Java is the best";

        // contains -- метод, проверка есть ли в строке символы. Регистрозависима
        boolean contains = str.contains("Java");
        System.out.println("str.contains(\"Java\"): " + contains);
        System.out.println("str.contains(\"is t\"): " + str.contains("is t"));

        // startsWith / endsWith
        // Начинается / заканчивается ли строка на указанную подстроку
        boolean startsWith = str.startsWith("Ja");
        System.out.println(startsWith);
        System.out.println("str.startsWith(\"ava\"): " + str.startsWith("ava"));

        boolean endsWith = str.endsWith("best");
        System.out.println(endsWith);
        System.out.println("str.endsWith(\"Java\"): " + str.endsWith("Java"));


        System.out.println("\n =============Логические операции ============");

        // Логическое НЕ (отрицание) "!" - меняет булеан на противоположное

        boolean b2 = false;
        b2 = !b2;
        System.out.println("!false: " + b2);

        // Составные сравнения = два условия

        // 1. AND &
        b2 = true & true;
        int input = 50;
        b2 = input >= 0 & input <= 100;
        System.out.println("input >= 0 & input <= 100: " + b2);

        // 2. OR |
        b2 = true | false;


        // 3. Логическое исключающее ИЛИ: (XOR) - ^
        // Возвращает true, если две части выражения разные
        b2 = true ^ false;
        System.out.println("true ^ false: " + b2);
        b2 = true ^ true;
        System.out.println("true ^ true: " + b2);


        // 4. Логическое сокращенное И - &&
        // Выдает тру, если обе части выражения возвращают тру
        b2 = true && true;
        System.out.println("true && true: " + b2);
        System.out.println("true && false: " + (true && false));


        // 5. !
        int a = 10;
        int b = 0;
        boolean bol = (b != 0) && (a / b > 2);
        // boolean bol = (b != 0) & (a / b > 2); -- Ошибка. На ноль не может делить
        // && - не считает дальше, если в левой части false. Если не было бы &&, то была бы ошибка
        System.out.println("bol: " + bol);


        // 6. Логическое сокращенное ИЛИ - ||
        // Выдает тру, если хотя бы одна часть выражения равна true

        // true || ? -> true (не важно что справа)

        b = 0;
        bol = true || (a / b > 2);
        System.out.println("true || (a / b > 2): " + bol);


        System.out.println("\n==========Приоритет логических операций==========");

        /*
        !, &, ^, |, &&, || - приоритет
         */

        System.out.println("true ^ true & false: " + (true ^ true & false));
        System.out.println("true ^ true && false: " + (true ^ true && false));

    }
}
