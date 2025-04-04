package homeworks.homework_48;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Task2 {
    public static void main(String[] args) {

        List<String> strings = List.of("Имеется список строк. Используя Stream API, найдите строку c минимальной длиной.".split(" "));
        System.out.println(strings);

        Optional<String> minString = strings.stream()
                .filter(Objects::nonNull)
                .min(Comparator.comparing(String::length));
        System.out.println(minString.orElse(null));


        // Методы optional

        // ifPresent(Consumer<T> action) - если в Optional что-то есть - выполняется переданное действие
        // Consumer
        minString.ifPresent(string -> System.out.println("if Present: " + string));
        minString.ifPresent(System.out::println);

        // ifPresentOrElse - Если значение есть - выполнение первое действие (дадут значение)
        // Если пусто - выполняется второе действие

        minString.ifPresentOrElse(
                str -> System.out.println("Нашли: " + str),
                () -> System.out.println("Ничего не нашли")
        );

        strings.stream()
                .filter(Objects::nonNull)
                .min(Comparator.comparing(String::length))
                .ifPresentOrElse(
                        str -> System.out.println("FInd: " + str),
                        () -> System.out.println("Not find!")
                );

    }
}
