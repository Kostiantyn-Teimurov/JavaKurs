package homeworks.homework_48;

import java.util.ArrayList;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {

        List<Integer> integers = List.of(1, 2, 5, 12, 13, 56, 24, -10, -5, 0, 45, -25, 20, 30, 41, 21, 32, 53, 55, 65, 43);

        List<Integer> integers2 = new ArrayList<>();
        integers.stream()
                .filter(i -> i % 2 == 0)
                .forEach(integer -> integers2.add(integer * 2));

        System.out.println(integers2);
    }
}
