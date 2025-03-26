package homeworks.homework_42.myComparators;

import java.util.Arrays;

public class MyComparatorsApp {
    public static void main(String[] args) {

        /*
        0 -> ничего не меняется
        1 -> первый больше второго - ничего не меняется
        -1 -> первый меньше - влево от второго
         */

        Integer[] integers = new Integer[]{1, 6, 5, 4, 7, 8, 9, 2, 7, 3, Integer.MIN_VALUE, Integer.MAX_VALUE};
        Arrays.sort(integers, new MyComparator());
        System.out.println(Arrays.toString(integers));


        integers = new Integer[]{1, 6, 5, 4, 7, 8, 9, 2, 7, 3, Integer.MIN_VALUE, Integer.MAX_VALUE};
        Arrays.sort(integers, new MyComparator2());
        System.out.println(Arrays.toString(integers));
    }
}
