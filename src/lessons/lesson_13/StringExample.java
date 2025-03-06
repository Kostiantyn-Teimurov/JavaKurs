package lessons.lesson_13;

public class StringExample {
    public static void main(String[] args) {

        String greeting = "Hello, World!";

        // String string1 = new String(("Hello!")); // Такой способ нерекомендуемый!

        System.out.println(greeting);

        int length = greeting.length(); // Вызов метода length() - посчитать кол-во символов в строке.

        System.out.println("length(): " + length);
        System.out.println("Hello".length());

        System.out.println(greeting.toUpperCase());
        System.out.println(greeting);
        greeting = greeting.toUpperCase();

        // Строка иммутабельна - неизменна


        // Конкатенация:

        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";

        // 1. +
        String concatStr = str1 + str2 + str3;
        System.out.println("concatStr: " + concatStr);


        System.out.println(1 + 3 + " : " + (2 + 3));
        // 1 + 3 -> 4
        // 4 + str " : " -> всё приводится к типу String
        // Скобки - решают проблему


        // 2. Методы:
        String concatStr2 = str1.concat(str2); // str1 + str2
        concatStr2 = concatStr2.concat(str3); // concatStr2 + str3
        System.out.println("concatStr2: " + concatStr2);

        // Цепочка вызовов методов:
        String concatStr3 = str1.concat(str2).concat(str3).concat("!!!"); // ((str1 + str2) + str3) + !!!
        System.out.println("concatStr3: " + concatStr3);

        // 3. Одинаковый разделитель:
        String concatStr5 = String.join(", ", "Hello", "World", "Test"); // Hello World Test
        System.out.println("concatStr5: " + concatStr5);


        int a = 1;
        int b = 2;
        String str = "Сумма a + b = " + a + b; // Сумма a + b = 12
        System.out.println("str: " + str);

        str = "Сумма a + b = " + (a + b); // Сумма a + b = 3
        System.out.println("str: " + str);

        System.out.println("=========================");

        String digits = "0123456789";
        System.out.println("digits.length(): " + digits.length());

        // charAt(index) - Взять символ из строки по его индексу (номер)
        char symbol = digits.charAt(4); // Взять символ под индексом (номером) 4
        System.out.println("symbol: " + symbol);

        char last = digits.charAt(digits.length() - 1);
        System.out.println("last: " + last);

        System.out.println("===========================");

        // Выделение подстроки:
        String subString = digits.substring(2); // Выделять подстроку начиная с индекса 2 включительно
        System.out.println("subString: " + subString);
        System.out.println("digits: " + digits);

        String subString2 = digits.substring(2, 7); // Выделять подстроку с индекса 2 (вкл) до 7 (не вкл)
        System.out.println("subString2: " + subString2);

        System.out.println("===========================");

        // Замена частей строки
        // replace() - заменяет все совпадения заданной строки на другую строку.
        // Работает только со строками, не поддерживает регулярные выражения.

        String string = "One World One";
        String replStr = string.replace("ne", "WWW");
        System.out.println("replStr: " + replStr);

        // replaceFirst() - Заменяет только первое найденное совпадение - поддерживает регулярные выражения
        replStr = string.replaceFirst("One", "WWW");
        System.out.println("replStr: " + replStr);

        // replaceAll() - заменяет все найденные совпадения на другую строку - поддерживает регулярки
        replStr = string.replaceAll("One", "WWW");
        System.out.println("replStr: " + replStr);

        String stringReg = "One World One Onix O";
        replStr = stringReg.replaceAll("\\bO\\w*", "Replaced");
        System.out.println("replStr: " + replStr);

        // .matches("\\d+") - проверяет, только ли цифры есть в строке

    }
}
