package homeworks.homework_32.task2;

import lists.MyArrayList;
import lists.MyList;

import java.util.Arrays;

public class UtilsMyArrayList {

    public static <T, U> void printTwoLists(MyList<T> list1, MyList<U> list2) {
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

    public static void main(String[] args) {

        MyList<String> names = new MyArrayList<>();
        names.add("Alice");
        names.add("Tom");

        MyList<Integer> scores = new MyArrayList<>();
        scores.add(85);
        scores.add(92);

        UtilsMyArrayList.printTwoLists(names, scores);

        String[] array = {"Hello", "Hi", "Bonjour"};

        // TODO Ошибки не будет, если в метод приходит интерфейс, а здесь создаю объект класса?
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
