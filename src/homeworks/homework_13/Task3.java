package homeworks.homework_13;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите, пожалуйста, строку чётной длинны: ");
        String stringUser = scanner.nextLine();

        if (stringUser.length() % 2 != 0) {
            System.out.println("Введите чётную строку!");
        } else {
            //char symbol1 = stringUser.charAt((stringUser.length() / 2) - 1);
            String symbols = stringUser.substring((stringUser.length() / 2) - 1, (stringUser.length() / 2) + 1);
            System.out.println(symbols);
        }
    }
}