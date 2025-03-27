package homeworks.homework_43;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 5, 10, 7, 9));
        List<Integer> list2 = new ArrayList<>(List.of(1, 2, 10, 5, 8, 13));

        System.out.println(retainLists(list1, list2));

        List<String> strings1 = new ArrayList<>(List.of("1", "2", "Hello", "", "Hi"));
        List<String> strings2 = new ArrayList<>(List.of("1", "2", "Hello2", ".", "Hi"));

        System.out.println(retainLists(strings1, strings2));

//        list1.addAll(strings1);

    }

    public static <T> List<T> retainLists(List<T> list1, List<T> list2) {
        list1.retainAll(list2);
        return list1;
    }


}


