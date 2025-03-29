package homeworks.homework_44;

import java.util.*;

public class Task1 {

    private static List<String> getUniqueSortedWords(String string) {
        String newString = string.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "");
        System.out.println(newString);

        String[] words = newString.split("\\s+");
        System.out.println(Arrays.toString(words));
        Set<String> listWords = new TreeSet<>(Comparator.comparing(String::length).thenComparing(String::compareTo));
        listWords.addAll(Arrays.asList(words));

        System.out.println(listWords);
        return new ArrayList<>(listWords);

    }

    public static void main(String[] args) {

        String testString = "Тестовая для   строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(getUniqueSortedWords(testString));

    }
}
