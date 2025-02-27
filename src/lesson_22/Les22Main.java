package lesson_22;

import java.util.Arrays;

public class Les22Main {
    public static void main(String[] args) {

        MagicArray magic = new MagicArray();

        System.out.println(magic.toString());

        magic.add(5);
        magic.add(20);
        magic.add(0);
        magic.add(10);

        magic.add(6, 7, 8);
        magic.add(10, 20, 30, 40, 20);

        System.out.println("В массиве сейчас элементов: " + magic.size());

        String arrayToString = magic.toString();
        System.out.println("arrayToString: " + arrayToString);

        System.out.print("Внутренний массив: ");
        magic.test();

        System.out.println("============");
        int value = magic.get(0);
        System.out.println("magic.get(0): " + value);

//        System.out.println("magic.get(15): " + magic.get(15));
//        System.out.println("magic.get(-1): " + magic.get(-1));
//        System.out.println("magic.get(30): " + magic.get(30));

        int oldValue = magic.remove(3);
        System.out.println("magic.remove(3): " + oldValue);
        System.out.println(magic.toString());
        System.out.println("size: " + magic.size());
        System.out.print("Внутренний массив: ");
        magic.test();


        System.out.println("================");

        System.out.println("magic.indexOf(20): " + magic.indexOf(20));
        int index = magic.indexOf(20);
        if (index >= 0) {
            System.out.println("Значение было найдено");
        } else {
            System.out.println("Такого значения в массиве нет");
        }


        System.out.println("\n===========HomeWork==============\n");
        System.out.println("magic.lastIndexOf(20): " + magic.lastIndexOf(20));
        System.out.println("magic.removeByValue(2): " + magic.removeByValue(20));
        magic.test();

        int[] numbers = new int[5];
        MagicArray magic2 = new MagicArray(numbers);

        magic2.add(1, 2, 7, 3, 2, 2, 3, 4, 5, 2);

        boolean isRemoved = magic2.removeByValue(1);
        System.out.println("magic2.removeByValue(1): " + isRemoved);

        System.out.println("magic2.toString(): " + magic2.toString());
        System.out.print("Внутренний массив2: ");
        magic2.test();

        int findThisValue = 2;
        int[] valuesFind = magic2.findAllValues(findThisValue);

        System.out.println("Число " + findThisValue + " находится по таким индексам: " + Arrays.toString(valuesFind));

        System.out.println("\n====================");
        int[] numbers1 = new int[]{10, 0, 10, 5, 7, 5, 10, 10};
        MagicArray magic3 = new MagicArray(numbers1);

//        magic3.add(100);
        magic3.test();
        numbers1[1] = 100;
//        numbers1[1] = 100;

        magic3.add(100);
        magic3.test();


        valuesFind = magic3.findAllValues(10);

        System.out.println("Число 10 находится по таким индексам: " + Arrays.toString(valuesFind));


        System.out.println("==================");

        int[] fromMagic = magic.toArray();
        System.out.println(fromMagic.length);
        System.out.println(Arrays.toString(fromMagic));

    }
}
