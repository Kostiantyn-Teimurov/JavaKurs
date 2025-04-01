package consultations.consult_16;


import java.util.HashMap;
import java.util.Map;

public class Compute {

    public static void main(String[] args) {

        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<Character, Integer> frequencyMap = frequencyCharDictionary(text);

    }

    private static Map<Character, Integer> frequencyCharDictionary(String text) {
        Map<Character, Integer> result = new HashMap<>();
        for (Character ch : text.toCharArray()) {

            // map.put(ch, 1) если такого ключа в мапе нет
            // такой ключ. put(ch, результатРАботыФункции)
            result.merge(ch, 1, (oldValue, newValue) -> oldValue + 1);
        }
        return result;
    }


    private static Map<Character, Integer> frequencyCharDictionary2(String text) {
        Map<Character, Integer> result = new HashMap<>();
        for (Character ch : text.toCharArray()) {

            // put(ch, значениеИзФункции) - выполнится метод
            // (ключ, значение) -> get(ch)
            // 1. old == null ? ключа еще не было (или ключ был, но значение null) -> put(ch, 1)
            // 2. Иначе (old != null) - put(ch, oldV + 1)
//            result.compute(ch, (key, oldValue) -> {
//               if (oldValue == null) {
//                   return 1;
//               }
//               return oldValue + 1;
//            });

            result.compute(ch, (key, oldV) -> oldV == null ? 1 : oldV + 1);
        }

        return result;
    }
}
