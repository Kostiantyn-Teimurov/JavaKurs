package homeworks.homework_17;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        int[] numbers = new int[50];
        Random random = new Random();

        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = random.nextInt(100) + 1;
            System.out.print(numbers[i] + ", ");
        }

        System.out.println();

        boolean isSimple = false;
        int count = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == 2) {
                count++;
                System.out.print(numbers[i] + " ");
                continue;
            }
            for (int j = 2; j < numbers[i]; j++) {
                if (numbers[i] % j == 0) {
                    isSimple = false;
                    break;
                }
                isSimple = true;
            }
            if (isSimple) {
                count++;
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
        System.out.println(count);

    }
}
