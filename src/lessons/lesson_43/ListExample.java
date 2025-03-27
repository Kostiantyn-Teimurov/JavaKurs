package lessons.lesson_43;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {

        // Конструкторы

        // Конструкторы ArrayList

        List<Integer> list = new ArrayList<>(); // Создает пустой список (с начальной емкостью 10 элементов)
        list = new ArrayList<>(50); // Создает пустой список с указанной емкостью

        // Создает список, содержащий все эл указанной коллекции (копирование эл из другой коллекции)
        list = new ArrayList<>(List.of(1, -10, 5, 0, 25, -100));


        // Конструкторы LinkedList
        list = new LinkedList<>(); // пустой список, двусвязный список
        list = new LinkedList<>(List.of(1, -10, 5, 0, 25, -100));


        // Методы интерфейса List

        // boolean add (E e) - + эл в конец списка
        list.add(1000);
        list.add(-100);
        System.out.println("list: " + list);

        // void add(int index, E element) - добавляет эл на указанную позицию. Перед индексом index
        list.add(3, 500);
        System.out.println("list: " + list);


        // E get(int index) - возвращает эл по индексу
        int value = list.get(5);
        System.out.println("value: " + value);


        // E remove(int index) - удаляет эл по индексу, возвращает старое значение
        System.out.println("list.remove(5): " + list.remove(5));
        System.out.println(list);

        // boolean remove(Object obj) - метод удаления по значению (из интерфейса Collection) - принимает ссылочный тип данных
        System.out.println(list.remove(Integer.valueOf(0)));
        System.out.println(list.remove("String"));
        System.out.println(list);


        // Поиск эл по значению - возвращает индекс
        // int indexOf(Object obj) - первое вхождение
        System.out.println("list.indexOf(-100): " + list.indexOf(-100));

        System.out.println("list.lastIndexOf(4000): " + list.lastIndexOf(4000));
        System.out.println("list.lastIndexOf(-100): " + list.lastIndexOf(-100));


        System.out.println("\n=============== sort =====================\n");

        // void sort(Comparator<? super E> comparator) - сортирует список с использованием указанного компаратора
        list.sort((i1, i2) -> Integer.compare(i2, i1));
        list.sort(Comparator.reverseOrder());
        System.out.println("Наоборот: " + list);

        list.sort(Integer::compareTo);
        list.sort(Comparator.naturalOrder());
        System.out.println("Естественный порядок: " + list);


        // List<E> subList(int indexFrom, indexTo) - возвращает список из элементов, находящихся на позициях от индекса и до индекса НЕ ВКЛЮЧИТЕЛЬНО
        List<Integer> subList = list.subList(1, 5);
        System.out.println("sublist(1, 5): " + subList);


        System.out.println("======================");

        Deque<Integer> deque = new LinkedList<>();


    }
}
