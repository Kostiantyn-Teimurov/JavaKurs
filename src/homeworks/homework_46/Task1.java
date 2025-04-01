package homeworks.homework_46;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task1 {

    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 50);
        map1.put("banana", 20);
        map1.put("cherry", 30);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("banana", 25);
        map2.put("cherry", 30);
        map2.put("date", 40);

        Map<String, Integer> intersectionMap = intersection(map1, map2);
        System.out.println(map1);
        System.out.println(map2);
        intersectionMap.forEach((key, value) -> System.out.println(key + ": " + value));

    }

    private static Map<String, Integer> intersection(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> map1Copy = new HashMap<>(map1);
        Set<String> setMap1 = map1Copy.keySet();
        Set<String> setMap2 = map2.keySet();

        setMap1.retainAll(setMap2);

        return map1Copy;
    }
}
