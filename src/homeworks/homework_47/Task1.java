package homeworks.homework_47;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>(List.of(1, 2, -1, 13, 14, 12, 0, 5, 1, -15, 24, 99, 98, 100, 10, 5, 7, 0, -33));

        System.out.println(filterList(integers));
        System.out.println(integers);

    }

    private static List<Integer> filterList(List<Integer> list) {
        return list.stream()
                .filter(i -> i % 2 == 0)
                .filter(i -> i > 10 && i < 100)
                .collect(Collectors.toList());
    }

}
