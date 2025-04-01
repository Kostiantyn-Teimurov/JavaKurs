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
        System.out.println(frequencyDictionary3(text));
        System.out.println(frequencyDictionary4(text));
        System.out.println(frequencyDictionary5(text));

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


    private static Map<String, Integer> frequencyDictionary2(String string) {
        String newString = string.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "");

        Map<String, Integer> resultMap = new HashMap<>();

        for (String word : newString.split("\\s+")) {
            Integer amount = resultMap.getOrDefault(word, 0);
            resultMap.put(word, ++amount);
        }
        return resultMap;
    }

    // Методы merge, compute - для вычисления новых значений в карте на основе ключа и текущего значения.
    // Позволяет вычислить новое значение ключа, используя функцию пересчета
    // Новое значение может зависеть от текущего ключа и текущего значения
    // Если функция пересчета вернет null, то запись с текущим ключом удаляется из карты
    private static Map<String, Integer> frequencyDictionary3(String string) {
        String[] newString = string.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").split("\\s+");

        Map<String, Integer> resultMap = new HashMap<>();

        for (String word : newString) {
            // key = word
            // oldValue = resultMap.get(key);
            // oldValue == null -> put(word, 1) : put(word, oldValue +1)
            resultMap.compute(word, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);
        }

        return resultMap;
    }

    private static Map<String, Integer> frequencyDictionary4(String string) {
        String[] newString = string.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").split("\\s+");

        Map<String, Integer> resultMap = new HashMap<>();

        for (String word : newString) {
            // computeIfPresent - вычисляет новое значение, ТОЛЬКО ЕСЛИ ключу было ассоциировано какое-то не-null значение
            // если метод get(key) возвращает не null

            resultMap.computeIfPresent(word, (key, value) -> value + 1);


            // computeIfAbsent - вычисляет новое значение для ключа, ТОЛЬКО ЕСЛИ ключ не присутствует в карте (или возвращает null)
            resultMap.computeIfAbsent(word, key -> 1);
//            resultMap.computeIfAbsent(word, key -> 0);
            // put(word, 1)
        }

        return resultMap;
    }


    private static Map<String, Integer> frequencyDictionary5(String string) {
        String[] newString = string.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").split("\\s+");

        Map<String, Integer> resultMap = new HashMap<>();

        for (String word : newString) {
            /*
            merge(K key, V newValue, BiFunction<K,V> remappingFunction)
            merge используется для объединения значений по ключу
            Как работает:
                - Если ключа нет(или null), новая пара key:newValue вставляется в карту
                - Если ключ уже есть(!= null) применится функция объединения, которая может использовать старое и новое значение
             */
            resultMap.merge(word, 1, (oldValue, newValue) -> oldValue + newValue);
//            resultMap.merge(word, 1, Integer::sum);
        }

        return resultMap;
    }

}