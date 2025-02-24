package homeworks.homework_16;

import java.util.Objects;
import java.util.Scanner;

public class Tasks_1_3 {
    public static void main(String[] args) {

        // Task1
        int i = 1;
        long result = 1;

        while (i <= 15) {
            result *= i;
            i++;
        }
        System.out.println(result);


        //Task2
        String str = "Task";
        i = 1;
        while (i <= 10) {
            System.out.println(str + i);
            i++;
        }


        //Task3
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equalsIgnoreCase("привет")) {
            System.out.println("Введите слово 'привет': ");
            input = scanner.nextLine();
        }
        System.out.println("Всё верно!");

    }
}
