package lessons.lesson_14;

public class StringEquals {
    public static void main(String[] args) {

        // Области памяти. Хранение переменных:
        // Stack - стопка - примитивные типы данных
        // Heap - куча. - ссылочные типы данных - в них не хранится значение, в них ссылка, где есть эти данные

        int x = 10;

        // Ссылочный ти данных. В str1 хранится ссылка на область в памяти, в которой находится объект типа Стринг.
        String str1 = "Java";
        String str2 = "Java";
        String str3 = "JAVA";
        String str4 = new String("Java");

        System.out.println(str1 + " | " + str2 + " | " + str3 + " | " + str4);

        boolean b1 = str1 == str2;
        System.out.println("str1 == str2: " + b1);
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str1 == str4: " + (str1 == str4));


        // Важно! - для сравнения строк по их значению мы должны использовать метод Equals!

        boolean b2 = str1.equals(str2);
        System.out.println("str1.equals(str2): " + b2);
        System.out.println("str1.equals(str3): " + str1.equals(str3));
        System.out.println("str1.equals(str4): " + str1.equals(str4));
        System.out.println("str2.equals(str4): " + str2.equals(str4));


        // Мы можем сравнивать значения игнорируя регистр

        System.out.println("str1.equalsIgnoreCase(str3): " + str1.equalsIgnoreCase(str3));
    }
}
