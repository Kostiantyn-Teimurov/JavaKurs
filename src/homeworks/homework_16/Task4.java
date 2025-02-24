package homeworks.homework_16;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
