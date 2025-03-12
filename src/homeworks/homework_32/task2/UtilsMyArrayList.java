package homeworks.homework_32.task2;

import lists.MyArrayList;
import lists.MyList;

public class UtilsMyArrayList {

    public static <T, U> void printTwoLists(MyList<T> list1, MyList/*TODO Так лучше?*/<U> list2) {
        System.out.println(list1.toString());
        System.out.println(list2.toString());
        System.out.println("\n============");


        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }

    }

}
