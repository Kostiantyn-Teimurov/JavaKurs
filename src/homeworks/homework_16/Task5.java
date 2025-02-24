package homeworks.homework_16;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[random.nextInt(11) + 5];

        int min = array[0];
        int max = array[0];
        int sum = 0;

        int i = 0;
        while (i < array.length) {
            array[i] = random.nextInt(101) - 50;
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
            sum += array[i];
            System.out.print(array[i] + ", ");
            i++;
        }

        double average = (double) sum / array.length;

        System.out.println();
        System.out.println("average: " + average);
        System.out.println("min: " + min);
        System.out.println("max: " + max);

    }
}