package homeworks.homework_45;

import java.util.HashMap;
import java.util.Map;

public class Task1_2 {

    public static void main(String[] args) {

        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";
        Map<String, Integer> frequencyMap = frequencyDictionary(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println(frequencyDictionary(text));

        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);
        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v + "; | "));
        System.out.println();
    }


    private static Map<String, Integer> frequencyDictionary(String string) {
        String newString = string.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "");
//        String[] words = newString.split("\\s+");

        Map<String, Integer> resultMap = new HashMap<>();

        for (String s : newString.split("\\s+")) {
            if (resultMap.containsKey(s)) {
                resultMap.put(s, resultMap.get(s) + 1);
            } else {
                resultMap.put(s, 1);
            }
        }
        return resultMap;
    }


    private static Map<Character, Integer> frequencyCharsDictionary(String string) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (Character chr : string.toCharArray()) {
            if (charMap.containsKey(chr)) {
                charMap.put(chr, charMap.get(chr) + 1);
            } else {
                charMap.put(chr, 1);
            }
        }
        return charMap;
    }
}
