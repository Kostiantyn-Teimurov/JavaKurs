package homeworks.homework_42.myComparators;

import java.util.Arrays;
import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer i1, Integer i2) {
        System.out.println("i1: " + i1 + " | " + "i2: " + i2);

        if (i1 % 2 == 0 && i2 % 2 != 0) {
            System.out.println("i1 < i2 (i1 влево от i2)\n");
            return -1;
        }
        if (i1 % 2 != 0 && i2 % 2 == 0) {
            System.out.println("i1 > i2 (ничего не меняется)\n");
            return 1;
        }
        System.out.println("i1 - i2 (кто меньше, тот влево от большего)\n");
        return i1.compareTo(i2);
    }

}