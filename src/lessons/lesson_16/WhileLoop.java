package lessons.lesson_16;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        int number = 1;

        while (number <= 5) {
            System.out.print(number + ", ");
            number++;
        }
        System.out.println();
        System.out.println("Цикл закончен");

        /*
        number = 1;
        while (number <= 5) {
            System.out.print(number + ", ");
            // бесконечный цикл
        }

         */

        number = 100;
        while (number >= 90) {
            System.out.print(number + ", ");
            number--;
        }

        System.out.println();

        number = 1;
        int sum = 0;
        while (number <= 100) {
            sum += number;
            number++;
        }
        System.out.println(sum);

        number = 1;
        while (number <= 21) {
            System.out.println("Число, которое проверяем: " + number);
            if (number % 2 == 0) {
                System.out.print(number++ + ", "); // Так перебираем в два раза меньше чисел. Сначала печатаем, потом добавляем
            }
            number++;
        }
        System.out.println("\n =====================================");

        // Перебрать символы в строке
        String str = "Hello";
        int i = 0;

        while (i <= str.length() - 1) {
            System.out.println(str.charAt(i));
            i++;
        }


        System.out.println("\n ===================DRY==============");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите положительное число: ");
        int input = scanner.nextInt();
        scanner.nextLine();

        // Цикл с предусловием
        while (input <= 0) {
            System.out.println("Введите положительное число: ");
            input = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("Спасибо, вы ввели: " + input);


        // DRY - принцип - Не повторяй себя!

        // Цикл с постусловием
        // Цикл do-while - всегда выполняется тело цикла хотя бы один раз. Не важно тру или фол

        int num;
        do {
            System.out.println("Введите число больше 0: ");
            num = scanner.nextInt();
            scanner.nextLine();
        } while (num <= 0);
        System.out.println("Спасибо, вы ввели: " + num);

    }
}
