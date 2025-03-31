package lessons.lesson_45;

import java.util.*;

public class MapExample2 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "red");
        map.put(4, "green");
        map.put(15, "yellow");
        map.put(16, "blue");
        map.put(0, "white");
        map.put(100, "black");
        map.put(17, "orange");
        map.put(7, "red");

        System.out.println(map);

        // Collection<V> values() - возвращает коллекцию всех значений карты
        Collection<String> values = map.values();
        System.out.println("map.values(): " + values);

        // Set<K> keySet() - возвращает сет, состоящий из всех ключей карты
        Set<Integer> keys = map.keySet();
        System.out.println("map.keySet(): " + keys);

        // Могу перебрать ключи в цикле и получить все значения
        for (Integer key : keys) {
            System.out.print(map.get(key) + "; ");
        }
        System.out.println();

        /*
        ФОКУС.
        Изменения взаимосвязаны
        Метод keySet и values - возвращают представление/проекцию/вьюху (view) соответствующих ключей и значений
        Эта проекция поддерживается самой картой - они напрямую связаны = СВЯЗЬ ДВУСТОРОННЯ
        Если не хотим изменять карты - надо СКОПИРОВАТЬ
         */
        // Удаляю ключ из сета ключей
        keys.remove(17);
        System.out.println("keys: " + keys);
        System.out.println("map: " + map);
        System.out.println("values: " + values);

        System.out.println("=====================\n");

        values.remove("green");
        System.out.println("values: " + values);
        System.out.println("map: " + map);
        System.out.println("keys: " + keys);

        System.out.println("========================\n");
        map.remove(16);
        System.out.println("values: " + values);
        System.out.println("map: " + map);
        System.out.println("keys: " + keys);

        values.remove("red");
        System.out.println("values: " + values);
        System.out.println("map: " + map);
        System.out.println("keys: " + keys);

        // Удалить все пары с такими значениями
        values.removeAll(List.of("red"));

        System.out.println("=====================\n");

        // Если мы хотим разорвать связь
        Set<Integer> keysCopy = new HashSet<>(map.keySet());


        System.out.println("===========  Map.Entry  =============");

        // Set<Map.Entry<Integer, String>> entrySet() - возвращает сет вхождений всех пар ключ-значение
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("entry: " + entry + " -> " + entry.getKey() + " | " + entry.getValue());
        }

        //
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey().equals(100)) {
                entry.setValue("JAVA");
            }
        }

        System.out.println(map);

        // foreach - простой способ перебора всех пар ключ-значения с возможностью применить к ним какую-то функцию

    }
}
