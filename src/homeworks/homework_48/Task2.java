package homeworks.homework_48;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task2 {
    public static void main(String[] args) {

        List<String> strings = List.of("Имеется список строк. Используя Stream API, найдите строку c минимальной длиной.".split(" "));
        System.out.println(strings);

        Optional<String> minString = strings.stream()
                .min(Comparator.comparing(String::length));
        System.out.println(minString.orElse(null));

    }
}
