package lessons.lesson_44;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        String str = "abc";
        System.out.println(str.hashCode());

        String str2 = "abc";
        System.out.println(str.equals(str2));
        System.out.println(str2.hashCode());

        System.out.println("=======================");


        /*
        Для корректной работы хеш-коллекций есть важное правило - контракт между hashCode() и equals()

        1. Если два объекта равны по методу equals(), то их hashCode() тоже должны быть равны
        2. Если хеш-коды различны - то объекты ТОЧНО НЕ равны по equals()
        (обратное не всегда верно. Коллизия - разные объекты могут иметь одинаковые хеш-коды)
        3. Вызов метода hashCode() должен возвращать одинаковое значение при многократных вызовах на неизменном объекте
         */

        Set<Integer> set = new HashSet<>(); // Создает пустой хеш-сет. Емкость 16 и коеф заполнения 0.75
        set = new HashSet<>(20); // Создает пустой hashSet с указанной емкостью

        // Принимает коллекцию - создает новый сет (множество), содержащий уникальные эл из указанной коллекции
        set = new HashSet<>(List.of(1, 2, 3, 4, 3, 5, -10, 6, 6, 4, 0));

        System.out.println(set);

        Integer v = 100;
        System.out.println(v.hashCode());


        List<Integer> startValues = List.of(15, 1, 2, 3, 4, 5, 6, 8, 15, 7, 0, 16, 32);

        // HashSet - не поддерживает порядок добавления элементов
        Set<Integer> integers = new HashSet<>(startValues);
        System.out.println("hashSet: " + integers);

        // LinkedSet - сохраняет порядок добавления элементов
        Set<Integer> linkedSet = new LinkedHashSet<>(startValues);
        System.out.println("linkedSet: " + linkedSet);

        System.out.println("=====================");

        // Методы интерфейса Set

        // boolean add(E e)
        System.out.println("integers.add(100): " + integers.add(100)); // true - эл добавлен
        System.out.println(integers);
        System.out.println("" + integers.add(100)); // false - элемент Не добавлен, такое значение уже есть
        System.out.println(integers);

        System.out.println("========================");

        // boolean remove(Object o) - удаляет эл по значению
        System.out.println(integers.remove(100));
        System.out.println(integers);

        // boolean contains(Object o) - проверяет присутствие элемента в множестве
        System.out.println("integers.contains(100): " + integers.contains(100));
        System.out.println("integers.contains(32): " + integers.contains(32));

        /*
        int size()
        boolean isEmpty() - true, если пустой
        clear()
         */

        System.out.println("======================");

        // iterator() - возвращает итератор для эл сет-а
        // Наличие итератора позволяет последовательно перебирать все эл циклом for-each

        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.print(value + ", ");
        }
        System.out.println();

        for (Integer val : integers) {
            System.out.print(val + ", ");
        }
        System.out.println();


        // Убрать дубликаты.
        // Написать метод, который принимает список и возвращает список, состоящий только из уникальных эл начального списка

        List<Integer> result = getUniqueList(startValues);
        System.out.println("getUniqueList(startValues): " + result);


        System.out.println("==================");

        // SortedSet - расширяет интферфейс Set
        // Эл упорядочены в соответствии с их естественным порядком (если эл реализуют Comparable), или компаратором переданным при создании
        // Реализован в виде бинарного дерева

        // SortedSet Конструкторы
        // Пустой - Естественный порядок сортировки
        SortedSet<Integer> sortedSet = new TreeSet<>(); // пустое, упорядоченное множество. Сортировка в соответствии с Comparable

        sortedSet.add(100);
        sortedSet.add(32);
        sortedSet.add(150);
        sortedSet.add(125);
        System.out.println("sortedSet: " + sortedSet);

        // Принимает коллекцию. Создает set из эл коллекции. Сoртировка в естественном порядке
        sortedSet = new TreeSet<>(startValues);
        System.out.println("sortedSet: " + sortedSet);


        // Конструктор с компаратором, определяющим порядок хранения элементов
        SortedSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder()); // будет поддерживаться порядок, обратный естественному
        treeSet.addAll(startValues);
        treeSet.add(10);
        System.out.println("treeSet: " + treeSet);

        // То же самое на лямбде
        treeSet = new TreeSet<>((i1, i2) -> Integer.compare(i2, i1));
        treeSet.addAll(startValues);

        treeSet = new TreeSet<>(startValues);
        // first() - возвращает самый первый (самый левый) (наименьший с точки зрения компаратора)
        // last()
        System.out.println("treeSet.first(): " + treeSet.first());
        System.out.println("treeSet.last(): " + treeSet.last());

        // SortedSet<E> headSet(E e) - возвращает все эл слева. Часть множества, эл которого строго меньше чем е.
        // SortedSet<E> tailSet(E e) - >= e
        SortedSet<Integer> headSet = treeSet.headSet(6);
        System.out.println("treeSet.headSet(6): " + headSet);
        SortedSet<Integer> tailSet = treeSet.tailSet(6);
        System.out.println("treeSet.tailSet(6): " + tailSet);


        // SortedSet<E> subSet(E from, E to) - возвращает часть множества, которые находятся в диапазоне
        SortedSet<Integer> subSet = treeSet.subSet(6, 16);
        System.out.println("treeSet.subSet(6, 16): " + subSet);


        // comparator() - возвращает компаратор, используемый для упорядочивания эл в этом множестве
        // Если используется естественный порядок - вернется null


        homework("Тестовая 577  строка, со           словами!");

    }

    private static void homework(String testStr) {

        // Заменить все НЕ буквы на пустоту - регулярное выражение
        // заменить символ, который не является буквой, цифрой или пробелом - на "" (пустоту)
        String newString = testStr.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "");
        System.out.println(newString);

//        // Сделать из слов строку через разделитель
//        String str = String.join(" ", "Hello", "Java", "Test");
//        System.out.println(str);

//        // Преобразование строки в массив слов
//        String[] words = str.split(" ");
//        System.out.println(Arrays.toString(words));


        // s+ - "пробельный символ" в количестве 1 шт или больше
        String[] words1 = newString.split("\\s+");
        System.out.println(Arrays.toString(words1));

        // Arrays.asList(T[] array - преобразует массив в список (List)
        List<String> list = Arrays.asList(words1);
        System.out.println(list);

    }


    public static <T> List<T> getUniqueList(List<T> list) {
        Set<T> result = new LinkedHashSet<>(list);
        return new ArrayList<>(result);
    }

}
