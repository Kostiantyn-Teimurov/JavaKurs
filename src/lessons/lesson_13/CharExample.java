package lessons.lesson_13;

public class CharExample {
    public static void main(String[] args) {

        // Таблица Unicode
        char a = 'A'; // Переменная будет хранить букву А латинского алфавита
        char a1 = 65; // Буква А. Символ соответствующий коду 65 в десятичной СС
        char a2 = 0x41; // присваиваю число в 16-формате без ведущих нулей.
        // a2 = 0x0041;
        char a3 = '\u0041'; // Ещё один способ задать код в 16-ном формате
        char x = '\u1507';

        System.out.println("a: " + a);
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("a3: " + a3);
        System.out.println("x: " + x);

        System.out.println("==================");
        char letter = 'A';
        letter++; // Увеличение кода символа

        System.out.println("letter: " + letter);

        char digit = 48; // Символ 0
        System.out.println("digit: " + digit);

        digit += 5;
        System.out.println("digit: " + digit);

        /*
        0...9 => 48...57
        a...z => 97...122
        A...Z => 65...90
        */

        // Сначала меньший тип приводится к большему. Потом операция. Потом нужно привести назад к меньшему.
        // Если не указать явно, то будет пытаться инт привести в чар или байт и будет ошибка
        digit = (char) (digit + 3);
        byte b1 = 120;
        b1 = (byte) (b1 + 1);

        System.out.println(b1);

        // Чтобы получить код символа в 10 СС нужно привести тип char к типу int
        System.out.println("int из char даст 10-й код символа: " + digit);
        System.out.println("int из char даст 10-й код символа: " + (int) digit);
        System.out.println(0 + digit);


        // .matches("\\d+") - проверяет, только ли цифры есть в строке
    }
}
