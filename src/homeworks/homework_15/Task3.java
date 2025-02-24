package homeworks.homework_15;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четырехзначное число:");
        String input = scanner.nextLine();

        // .matches("\\d+") - проверяет, только ли цифры есть в строке
        if (input.length() != 4 || !input.matches("\\d+")) {
            System.out.println("Ошибка. Введите число из 4 цифр!");
            return;
        }
        int symbol1 = input.charAt(0) - 48;
        int symbol2 = input.charAt(1) - 48;
        int symbol3 = input.charAt(2) - '0';
        int symbol4 = input.charAt(3) - '0';

        System.out.println(symbol1);
        System.out.println(symbol2);
        System.out.println(symbol3);
        System.out.println(symbol4);

        if (symbol1 + symbol2 == symbol3 + symbol4) {
            System.out.println("Число счастливое!");
        } else {
            System.out.println("Число НЕ счастливое..");
        }


        /*
        1234 % 10 ==> 4
        1234 / 10 ==> 123

        1234 % 1000 ==> 234
        1234 / 1000 ==> 1
         */
    }
}
