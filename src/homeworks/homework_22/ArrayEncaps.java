package homeworks.homework_22;

import lesson_22.MagicArray;

import java.util.Arrays;

public class ArrayEncaps {
    public static void main(String[] args) {

        int[] test = {1, 2, 3, 4, 5};

        MagicArrayEncaps magic = new MagicArrayEncaps(test);
        magic.add(10);

        System.out.println(magic.toString());

        magic.test();
        test[3] = 1000;

        magic.test();
        System.out.println(magic.toString());

        int[] fromMagic = magic.toArray();
        System.out.println(fromMagic.length);
        System.out.println(Arrays.toString(fromMagic));




    }
}
