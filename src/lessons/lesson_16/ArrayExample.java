package lessons.lesson_16;

import java.util.Random;

public class ArrayExample {
    public static void main(String[] args) {

        int[] array; // Объявления массива целых чисел
        // int array []; - Альтернативный способ. НЕ РЕКОМЕНДУЕТСЯ
        String[] strings; // Массив строк

        array = new int[4]; // новый массив, 4 ячейки инт - инициализация
        strings = new String[10]; // Массив на 10 ячеек строк

        int[] array2 = new int[8]; // Всё вместе
        boolean[] bools = new boolean[3];

        /*
        Значения по умолчанию для типа данных
        1. Для всех числовых типов (и чар тоже) == 0 (0.0)
        2. Для булевых == false
        3. для всех ссылочных == null - Ничего
         */

        int value = array2[0]; // получение значения по индексу 0
        System.out.println("array2[0]: " + value);
        System.out.println("array2[7]: " + array2[7]);
        System.out.println("bools[1]: " + bools[1]);
        System.out.println("strings[9]: " + strings[9]);

        // Распечатать все значения в массиве так не получится
        System.out.println(array2);

        // Явная инициализация массива значениями
        int[] numbers = new int[]{45, 56, -16, 0, 159};
        int[] ints = {-10, 54, 32333, 444}; // Короткая форма явной инициализации

        int val = numbers[0];
        System.out.println("numbers[0]: " + val);
        System.out.println("numbers[4]: " + numbers[4]);

        numbers[2] = 100; // Присвоение нового значения в 2 ячейку

        int len = numbers.length; // типа метод. Кол-во ячеек
        System.out.println("numbers.length: " + len);

        int i = 0;
        while (i < numbers.length) {
            System.out.print(numbers[i] + ", ");
            i++;
        }
        System.out.println();


        Random random = new Random();

        int[] num = new int[10];
        i = 0;
        System.out.print("[");
        while (i < num.length) {
            num[i] = random.nextInt(101);
            System.out.print(num[i] + ", ");
            i++;
        }
        System.out.println("]");

        int min = num[0];
        i = 1;
        while (i < num.length) {
            if (min > num[i]) {
                min = num[i];
            }
            i++;
        }
        System.out.println(min);

    }
}
