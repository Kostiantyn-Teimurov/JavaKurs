package homeworks.homework_48;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {

    public static void main(String[] args) {

//        List<Integer> integers = List.of(1, 2, 5, 12, 13, 56, 24, -10, -5, 0, 45, -25, 20, 30, 41, 21, 32, 53, 55, 65, 43);

        List<Integer> integerList = IntStream.range(0, 101)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(21 % 10);

        List<Integer> integerList1 = integerList.stream()
                .filter(i -> i > 10)
//                .sorted(Comparator.comparing(i -> i % 10))
//                .sorted((i1, i2) -> Integer.compare(i1 % 10, i2 % 10))
                .sorted(Comparator.<Integer>comparingInt(i -> i % 10).thenComparing(Comparator.reverseOrder()))
                .collect(Collectors.toList());

        System.out.println(integerList1);
    }

}
