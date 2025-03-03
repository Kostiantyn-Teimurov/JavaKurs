package homeworks.homework_25;

import java.util.Arrays;
import java.util.Random;

public class DogApp {
    public static void main(String[] args) {

        Random random = new Random();

        Dog[] dogs = new Dog[5];
        System.out.println(Arrays.toString(dogs));

        for (int i = 0; i < dogs.length; i++) {
            dogs[i] = new Dog("Marsel" + i, random.nextInt(51) + 30);
            System.out.println(dogs[i].toString());
        }

        int[] barriers = new int[7];

        for (int i = 0; i < barriers.length; i++) {
            barriers[i] = random.nextInt(101) + 70;
        }

        for (int i = 0; i < dogs.length; i++) {
            for (int j = 0; j < barriers.length; j++) {
                dogs[i].jumpBarrier(barriers[j]);
            }
            System.out.println(dogs[i].getCounter());
        }
    }
}
