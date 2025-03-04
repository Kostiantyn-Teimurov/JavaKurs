package homeworks.homework_26;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String scan = scanner.nextLine();

        String[] words = scan.split(" ");

        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            System.out.print(Character.toUpperCase(chars[0]));
        }


    }
}
