package lessons.lesson_15;


import java.util.Random;
import java.util.Scanner;

// Ctrl + alt + O - оптимизация импорта

public class IfExample {
    public static void main(String[] args) {

        int score = 80;

        if (score >= 90) {
            System.out.println("Супер!");
        } else if (score >= 70) {
            System.out.println("Хорошо");
        } else if (score >= 50) {
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Плохо");
        }

        // Random

        Random rand = new Random(); // - Подключение рандома.

        // rand.nextInt(10) + 1; 0 - 10
        // rand.nextInt(21) - 10; -10 - 10


        // Нахождение min из нескольких чисел
        int v1 = rand.nextInt(51); // Случайное число с 0 до 50 вкл.
        int v2 = rand.nextInt(51);
        int v3 = rand.nextInt(51);

        int min = v1;

        if (v2 < min) {
            min = v2;
        }
        if (v3 < min) {
            min = v3;
        }
        System.out.println("min: " + min);


        // =========== Switch =============

        int x = 5;
        if (x == 5) {
            System.out.println("if: x == 5");
        } else if (x == 7) {
            System.out.println("if: x == 7");
        } else {
            System.out.println("else: drugoye");
        }

        switch (x) {
            case 5:
                System.out.println("switch: x == 5");
                break;
            case 7:
                System.out.println("switch: x == 7");
                break;
            default:
                System.out.println("switch: drugoye");
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 4");
        int input = scanner.nextInt();
        scanner.nextLine();

        switch (input) {
            case 1:
                System.out.println("Вы ввели один");
                break;
            case 2:
                System.out.println("Вы ввели два");
                break;
            case 3:
            case 4:
                System.out.println("Вы ввели три или четыре");
                break;
            default:
                System.out.println("Я таких чисел не знаю");
        }



        /* Java 14 or high
        switch (input) {
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("two");
            case 3, 4 -> System.out.println("three or for");
            default -> System.out.println("=_=");
        }

        String result = switch (input) {
            case 1 -> "one";
            case 2 -> "two";
            case 3, 4 -> "three or for";
            default -> "=_=";
        };

         */

        // Задача: деньги 100. оценки 0 - 5. 5->20, 4->10, 3->0, 2->-20, 1->all

        Random random = new Random();
        int note = random.nextInt(5) + 1;

        int money = 100;

        switch (note) {
            case 1:
                money = 0;
                break;
            case 2:
                money -= 20;
                break;
            case 4:
                money += 10;
                break;
            case 5:
                money += 20;
        }

        System.out.println("Ребёнок получил оценку: " + note);
        System.out.println("У ребенка сейчас денег: " + money);


        // Мульти строка - """....."""

        System.out.println("У меня есть загадка. Что это: желтый, большой, с рогами и полный зайцев?");

        String answer = scanner.nextLine();
        // trim == отрезает пробелы до и после
        // toLowerCase - все в маленькие
        String answerClean = answer.trim().toLowerCase();
        switch (answerClean) {
            case "троллейбус":
            case "троллейбус!":
                System.out.println("Угадал!");
                break;
            case "сдаюсь":
            case "сдаюсь!":
                System.out.println("Эх, сдался.. правильный ответ - троллейбус");
                break;
            default:
                System.out.println("Ответ неверный, попробуй ещё раз!");
        }


    }

}
