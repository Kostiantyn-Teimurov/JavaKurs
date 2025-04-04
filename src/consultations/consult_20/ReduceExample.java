package consultations.consult_20;

import java.util.List;
import java.util.Optional;
import java.util.Random;

public class ReduceExample {

    /*
    аккумулирующие методы

    Эти методы используются для вычисления одного значения на основании данных потока (и некого начального значения)

    Optional<T> reduce(BinaryOperator<T> accumulator) - выполняет свертку (аккумулирование) элементов потока.

    Optional<T> reduce(T identity, BinaryOperator<T> accumulator) - выполняет свертку (аккумулирование) элементов потока.

    BinaryOperator<T> - функциональный интерфейс, который является специальной формой BiFunction<T, T, T>
    Используется когда два объекта одного типа объединяются и возвращается объект того же типа


     */

    public static void main(String[] args) {

//        task1();
//        task2();
        task3();

        Random random = new Random();

        String result;
        int x = random.nextInt();
        System.out.println("x: " + x);

        result = x >= 0 ? "положительное" : "отрицательное";

        System.out.println("result: " + result);

    }

    private static void task3() {
        // Можно использовать для нахождения максимума. Происходит не накопление, а заменя значения переменной
        List<String> strings = List.of("Java", "Kotlin", "Python");
        Optional<String> longest = strings.stream()
                .reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2);
        System.out.println(longest);


    }

    private static void task2() {
        List<String> strings = List.of("Java", "Kotlin", "Python");

        Optional<String> concat = strings.stream()
                .reduce((s1, s2) -> s1 + " " + s2);
        System.out.println(concat);

        String concat2 = strings.stream().reduce("", (s1, s2) -> s1 + " " + s2);
        System.out.println(concat2);


    }

    private static void task1() {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // посчитать сумму всех эл, которые кратные трем

        // res - 45
        // 3, 6, 9, 12, 15
        Optional<Integer> sum = integers.stream()
                .filter(i -> i % 3 == 0)
                .peek(System.out::println)
                .reduce((i1, i2) -> i1 + i2);
        System.out.println(sum);


        Integer sum2 = integers.stream()
                .filter(i -> i % 3 == 0)
                .reduce(0, (i1, i2) -> i1 + i2);
        System.out.println("sum2: " + sum2);


    }
}
