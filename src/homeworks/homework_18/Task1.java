package homeworks.homework_18;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        // Arrays.copyOf() - копировать массив

        int[] array = {0, 1, 2, 3, 4, 5, 6};
        copyArray(array, 0);
        copyArray(array, -1);
        copyArray(array, 1);
        copyArray(array, 10);

    } // Methods

    public static void copyArray(int[] array, int idx) {
        if (idx <= 0) {
            System.out.println("Error");
            return;
        }

        int[] array2 = new int[idx]; // [0, 0, 0]
        System.out.println(Arrays.toString(array2)); // Печатает массив

        for (int i = 0; i < idx && i < array.length; i++) {
            array2[i] = array[i];
        }

        System.out.print("[");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + (i != array2.length - 1 ? ", " : "]\n"));
        }

    }


} // End
