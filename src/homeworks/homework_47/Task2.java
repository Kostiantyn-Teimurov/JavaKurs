package homeworks.homework_47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    public static void main(String[] args) {

        String text = "Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.\n" +
                "\n" +
                "В новом списке должны быть только те числа из старого списка, которые соответствуют всем условиям: четные, больше 10 и меньше 100\n" +
                "\n" +
                "Для фильтрации используйте Stream API\n" +
                "\n" +
                "Task 2\n" +
                "Дан список строк.\n" +
                "\n" +
                "Используя Stream API, отфильтруйте строки, которые начинаются на определенную букву (например, \"A\") и отсортируйте их в алфавитном порядке.\n" +
                "\n" +
                "Результат сохраните в новый список строк.\n" +
                "\n" +
                "Task 3\n" +
                "Дан список Person с полями name, age, city. Используйте Stream API для фильтрации людей, которые старше определенного возраста и проживают в определенном городе, а затем соберите их в список.\n" +
                "\n" +
                "Например, старше 25 лет и проживающих в городе \"Berlin\"";


        List<String> listStrings = Arrays.asList(text.replaceAll("[\n,\"]", "").split(" "));
        System.out.println(listStrings);

        List<String> filteredStringsList = listStrings.stream()
                .filter(s -> s.charAt(0) != 'A')
//                .filter(s -> s.charAt(0) == 'A')
                .sorted()
                .collect(Collectors.toList());

        System.out.println(filteredStringsList);
    }
}
