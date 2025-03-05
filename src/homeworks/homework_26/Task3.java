package homeworks.homework_26;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(phraseString());
    }


    public static String phraseString() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");

        // trim() - убирает пробелы спереди и в конце, если они есть
        String scan = scanner.nextLine().trim();

        if (scan.isEmpty()) return "";

        String[] words = scan.split("\\s+");
        // \\s+ - находит все пробелы

//        String result = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() == 0) continue;
            sb.append(word.charAt(0));
//            result += word.charAt(0);

//            char[] chars = words[i].toCharArray();
//            System.out.print(Character.toUpperCase(chars[0]));
        }
        return sb.toString().toUpperCase();
    }
}
