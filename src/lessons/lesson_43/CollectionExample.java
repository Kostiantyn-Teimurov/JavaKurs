package lessons.lesson_43;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {

        // Интерфейс Collection гарантирует наличие базовых методов для всех расширяющих его интерфейсов
        // List, Queue, Set
        // Это позволяет единообразно обрабатывать различные типы коллекций

        // Создаем коллекцию строк
        // Ссылка типа интерфейс -> набор доступных методов + ссылку на объект какого класса может хранить эта переменная.
        // Справа мы можем подставить объекты разных классов (получить разные реализации этого интерфейса)

        Collection<String> strings = new HashSet<>();
        strings = new ArrayList<>();

        // int size() - возвращает кол-во эл в коллекции
        System.out.println("strings.size(): " + strings.size());

        // boolean isEmpty() - возвращает true , если коллекция пуста
        System.out.println("strings.isEmpty(): " + strings.isEmpty());


        strings.add("Java");
        System.out.println("strings.add(\"Python\"): " + strings.add("Python"));

        // Переопределенный метод toString() для красивого вывода эл коллекции
        System.out.println(strings);


        // Статический метод .of() - метод в нескольких интерфейсах в классах JFC
        // добавлен в Java 9
        // Создает неизменяемую (нельзя удалить или добавить эл) коллекцию из предоставленных эл
        // Доступен для List, Set, Map

        Collection<Integer> integers = List.of(0, 1, 2, 3, 5, 6);
        System.out.println("integers: " + integers);
        // integers.add(7); // попытка модифицировать (изменить) неизменяемую коллекцию приведет к ошибке (Исключительная ситуация)


        // Методы addAll, removeAll

        // addAll(Collection<? extends T> col) - добавит все элементы из указанной коллекции
        strings.addAll(List.of("JS", "Go Land", "Ruby", "Kotlin"));
        System.out.println(strings);

        System.out.println("==========================");

        // removeAll(Collection<?> colB) -

        Collection<Integer> colA = new ArrayList<>();
        colA.addAll(List.of(0, 1, 2, 3, 4, 5, 3, 2));

        colA.removeAll(List.of(3, 2, 1, 10));
        System.out.println("colA.removeAll(List.of(3, 2, 1)):" + colA);

        // Пересечение
        // removeAll(Collection<?> colB) - Оставляет в коллекции вызова только те эл, которые содержатся в коллекции В.
        // Удаляет из кол вызова эл, которые НЕ содержатся в кол В
        // colA.retain(colB) - оставляет в А только те эл, которые также есть в В

        colA = new ArrayList<>();
        Collection<Integer> colB = new ArrayList<>();
        colA.addAll(List.of(10, 20, 30, 20, 40, 50, 60));
        colB.addAll(List.of(20, 30, 40, 100));
        System.out.println("colA: " + colA);
        System.out.println("colB: " + colB);
        colA.retainAll(colB);
        System.out.println("colA.retainAll(colB): " + colA);


        //
        System.out.println("colA.containsAll(List.of(20, 30)): " + colA.containsAll(List.of(20, 30))); // true

        // boolean remove(Object obj) - удаляет эл из кол. true если удален
        System.out.println("colA.remove(100): " + colA.remove(100));
        System.out.println("colA.remove(20): " + colA.remove(20)); // удалит ОДНО значение.

        colA.removeAll(List.of(20));

        colA.clear();
        System.out.println(colA);

    }
}
