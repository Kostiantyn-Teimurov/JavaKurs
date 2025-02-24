package homeworks.homework_13;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();

        System.out.println(name.length());

        char firstSymbol = name.charAt(0);
        char lastSymbol = name.charAt(name.length() - 1);

        System.out.println((int) firstSymbol);
        System.out.println((int) lastSymbol);
    }
}
