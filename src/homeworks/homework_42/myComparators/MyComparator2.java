package homeworks.homework_42.myComparators;

import java.util.Comparator;

public class MyComparator2 implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
        if (i1 % 2 == 0 && i2 % 2 != 0) {
            return -1;
        }
        if (i1 % 2 != 0 && i2 % 2 == 0) {
            return 1;
        }
        if (i1 % 2 == 0) {
            return i1.compareTo(i2);
        }
        return i2.compareTo(i1);
    }
}
