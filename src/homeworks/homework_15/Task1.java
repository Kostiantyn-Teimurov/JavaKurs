package homeworks.homework_15;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        Random random = new Random();
        int num1 = random.nextInt(101);
        int num2 = random.nextInt(101);
        int num3 = random.nextInt(101);
        int num4 = random.nextInt(101);

        System.out.println("Число1: " + num1 + "; Число2: " + num2 + "; Число3: " + num3 + "; Число4: " + num4);

        int max = num1;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num4 > max) {
            max = num4;
        }

        System.out.println("Максимальное число: " + max);
    }
}
