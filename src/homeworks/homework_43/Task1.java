package homeworks.homework_43;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 5, 10, 7));
        List<Integer> list2 = new ArrayList<>(List.of(1, 2, 10, 5));

        System.out.println(addLists(list1, list2));

        List<String> strings1 = new ArrayList<>(List.of("1", "2", "Hello", ""));
        List<String> strings2 = new ArrayList<>(List.of("1", "2", "Hello2", ""));

        System.out.println(addLists(strings1, strings2));

//        list1.addAll(strings1);

    }

    public static <T> List<T> addLists(List<T> list1, List<T> list2) {
        list1.addAll(list2);
        return list1;
    }


}


