package lessons.lesson_46;

// Stream API. Функциональные интерфейсы Function, Predicate, Consumer - являются частью Java Lambda Expression. Введены с Java 8
// Имплементации этих интерфейсов применяются когда метод принимает интерфейс в качестве параметра


import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class InterfacesExample {
    public static void main(String[] args) {

        // Consumer<T> - выполняет операцию над объектом типа T, не возвращая никакого результата
        // void accept(T t)

        Consumer<String> example = new Consumer<String>() {
            @Override
            public void accept(String string) {
                System.out.println(string + "!!!");
            }
        };

        example = string -> System.out.println(string + "!!!");

        example.accept("Hello World");
        example.accept("Java");

        // Составной интерфейс
        Consumer<String> consumer1 = str -> System.out.println("1. " + str.length());
        Consumer<String> consumer2 = string -> System.out.println("2. " + string + "!");

        Consumer<String> resultConsumer = consumer1.andThen(consumer2);
        resultConsumer.accept("Test");


        // Predicate<T> - проверка объекта на соответствие условию (тестирование)
        // boolean test(T t) - основной (абстрактный) метод

        Predicate<String> examplePredicate = new Predicate<String>() {
            @Override
            public boolean test(String string) {
                return false;
            }
        };

        Predicate<String> isShort = str -> str.length() < 3;
        boolean result = isShort.test("Java");
        System.out.println("isShort.test(\"Java\"): " + result);
        System.out.println("isShort.test(\"JS\"): " + isShort.test("JS"));

        List<Integer> list = new ArrayList<>(List.of(-1, 3, 34, 5, 0, 43, -54, 335, 6, 7, 9, 12, -24, 0, 4));

        // Список всех отрицательных чисел
        List<Integer> res = filterListPredicate(list, i -> i < 0);
        System.out.println("filterListPredicate(list, i -> i < 0): " + res);

        // Список всех нечетных чисел
        res = filterListPredicate(list, value -> value % 2 != 0);
        System.out.println(res);

        // Список всех четных чисел больше 5
        res = filterListPredicate(list, value -> value % 2 == 0 && value > 5);
        System.out.println(res);


        System.out.println("===============\n");

        Predicate<String> isLingString = string -> string.length() > 4;
        Predicate<String> isContainsJava = str -> str.contains("Java");

        Predicate<String> combinePredicate = isLingString.and(isContainsJava);
        Predicate<String> combinePredicate1 = isLingString.or(isContainsJava);
        String word = "Java";

        System.out.println(combinePredicate.test(word));
        System.out.println(combinePredicate1.test(word));

        Predicate<String> combine2 = isContainsJava.negate();
        System.out.println(combine2.test(word));


        System.out.println("\n============= Function ============");
        // Function<T, R> - производит операцию над объектом типа T, возвращает результат типа R
        // R apply(T t)

        Function<String, Integer> integerFunction = new Function<String, Integer>() {
            @Override
            public Integer apply(String string) {
                return 0;
            }
        };

        integerFunction = string -> string.length();

        int len = integerFunction.apply("Hello World");
        System.out.println(len);

        Function<String, String> toUpperCase = String::toUpperCase;
        Function<String, String> toUpper = str -> str.toUpperCase();
        System.out.println(toUpper.apply("Hello World"));

    }


    // Метод должен возвращать список объектов, удовлетворяющих условию (прошедших проверку предиката)
    public static List<Integer> filterListPredicate(List<Integer> integers, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();

        for (Integer value : integers) {
            if (predicate.test(value)) {
                result.add(value);
            }
        }

        return result;
    }

    public static List<Integer> filterNegative(List<Integer> integers, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer value : integers) {
            if (value < 0) {
                result.add(value);
            }
        }
        return result;
    }

}
