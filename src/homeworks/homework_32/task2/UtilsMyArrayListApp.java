package homeworks.homework_32.task2;

import lists.MyArrayList;
import lists.MyList;

import java.util.Arrays;

public class UtilsMyArrayListApp {
    public static void main(String[] args) {

        MyList<String> names = new MyArrayList<>();
        names.add("Alice");
        names.add("Tom");

        MyArrayList<Integer> scores = new MyArrayList<>();
        scores.add(85);
        scores.add(92);

        UtilsMyArrayList.printTwoLists(names, scores);

        String[] array = {"Hello", "Hi", "Bonjour"};
        MyArrayList<String> arrayHallo = new MyArrayList<>(array);

        System.out.println("\n=======================");
        array = arrayHallo.toArray();
        System.out.println(arrayHallo);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayHallo.toArray()));
        System.out.println("\n==========================");

        UtilsMyArrayList.printTwoLists(names, arrayHallo);

    }
}
