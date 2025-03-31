package lessons.lesson_45;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapExample {
    public static void main(String[] args) {

        // HashTable - устаревшая

        // Коллизия - иногда разные ключи могут выдать одинаковый хеш-код - то есть помещаются в одну ячейку

        Map<String, String> phoneBook = new HashMap<>();

        // Добавить пару ключ-значение
        // V put (Key key, V value)

        System.out.println(phoneBook.put("Hanna", "+49-11111"));

        phoneBook.put("John", "+49-333");
        phoneBook.put("Max", "+49-2222");
        System.out.println("phoneBook: " + phoneBook);


        String oldValue = phoneBook.put("John", "+49-444444");

        phoneBook.put(null, "+3450507");
        phoneBook.put("Null", null);

        System.out.println("oldValue: " + oldValue);
        System.out.println("phoneBook: " + phoneBook);

        Map<String, String> book2 = new HashMap<>();
        book2.put("Micheal", "+49-666666");
        book2.put("Sebastian", "+49-555555");

        // putAll - принимает карту (Map) и копирует все пары ключ-значение из этой карты
        phoneBook.putAll(book2);
        System.out.println("phoneBook: " + phoneBook);


        // boolean containsKey(Object key) - true, если карта содержит такой ключ
        // boolean containsValue(Object value) - true, если карта содержит хотя бы одно такое значение
        System.out.println(phoneBook.containsKey("Micheal"));
        System.out.println(phoneBook.containsKey("123"));
        System.out.println(phoneBook.containsKey(123));

        System.out.println(phoneBook.containsValue("+3450507"));
        System.out.println(phoneBook.containsValue("+49-666666"));


        System.out.println("============== GET ===============");

        // Взятие значения по ключу
        // V get (K key) - если нет - null
        String value = phoneBook.get("Hanna");
        System.out.println("phoneBook.get(\"Hanna\"): " + value);
        System.out.println("phoneBook.get(\"Null\"): " + phoneBook.get("Null"));

        // getOrDefault(Object key, V defaultValue)
        // возвращает значение по ключу, если ключа нет - вернет значение по умолчанию
        System.out.println("phoneBook.getOrDefault(\"Hanna\", \"DEFAULT\"): " + phoneBook.getOrDefault("Hanna", "DEFAULT"));
        System.out.println("phoneBook.getOrDefault(\"Alex\", \"DEFAULT\"): " + phoneBook.getOrDefault("Alex", "DEFAULT"));

        System.out.println("Objects.hashCode(null): " + Objects.hashCode(null));

        System.out.println("============ Add ========");

        // Конструкторы
        // 16 корзин с коэффициентом заполнения 0.75
        Map<Integer, String> construct = new HashMap<>(); // Создается пустой список пар ключ-значения.
        construct = new HashMap<>(30); // Создается пустой словарь на 32 корзины. Коэф заполнения 0.75
        construct = new HashMap<>(32, 0.90f); // Создается пустой словарь на 32 корзины. Коэф заполнения 0.90
        Map<Integer, String> otherMap = new HashMap<>();
        otherMap.put(1, "a");

        construct = new HashMap<>(otherMap); // скопирует все пары-ключ значение

        // V remove(Object key) - удаляет пару ключ-значение. Возвращает старое значение или null
        System.out.println("phoneBook: " + phoneBook);
        System.out.println(phoneBook.remove("Sebastian"));
        System.out.println(phoneBook.remove("Sebastian"));
//        System.out.println(phoneBook.remove("Null"));
        System.out.println(phoneBook);

        // boolean remove(Object key, Object value) - удаляет пару ключ-значение, только если ключ и значение совпадает
        System.out.println("phoneBook.remove(\"John\", \"0000300\"): " + phoneBook.remove("John", "0000300"));

        // void clear() - очищает карту
        // int size() - кол-во эл (пар)
        // boolean isEmpty() - true если пустой
        System.out.println("phoneBook.size(): " + phoneBook.size());


    }
}
