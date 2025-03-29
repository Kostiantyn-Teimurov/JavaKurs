package homeworks.lesson_44;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {

        Set<String> strings1 = new HashSet<>(List.of("A", "B", "C", "D"));
        Set<String> strings2 = new HashSet<>(List.of("C", "D", "E", "F"));

        System.out.println(union(strings1, strings2));
        System.out.println(intersection(strings1, strings2));
        System.out.println(difference(strings1, strings2));

        System.out.println("==========");
        System.out.println(intersection(strings2, strings1));
        System.out.println(difference(strings2, strings1));
        System.out.println();
        System.out.println(strings1);
        System.out.println(strings2);

    }


    private static Set<String> union(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    private static Set<String> intersection(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    private static Set<String> difference(Set<String> set1, Set<String> set2) {
        Set<String> result = new HashSet<>(set1);
        result.removeAll(set2);
        return result;
    }

}
