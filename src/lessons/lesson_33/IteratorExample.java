package lessons.lesson_33;


/*
// Есть два интерфейса Iterable и Iterator

1. Iterable - означает, что объекты этого класса можно последовательно перебирать (итерироваться по ним)
    Один абстрактный метод: Iterator<T> iterator() - возвращает итератор для этого набора элементов (коллекции)

2. Iterator - итератор, который позволяет обходить коллекцию.
    - boolean hasNext() - есть ли следующий элемент
    - T next() - возвращает след элемент
    - void remove() - удаляет последний возвращенный элемент (не обязателен для переопределения)

*/

import lists.MyArrayList;
import lists.MyList;

import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {

        MyList<String> list = new MyArrayList<>();

        list.addAll("Hello", "World", "Java", "Python");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String strCurrent = iterator.next();
            System.out.println(strCurrent);
        }

        // Цикл for-each
        // for (Тип переменной имя переменной : коллекция)

        System.out.println("\n============================");

        // Синтаксический сахар - делает то, что выше, но автоматически
        for (String strCurrent : list) {
            System.out.println(strCurrent);
        }


        System.out.println("===================");

        MyList<Integer> integers = new MyArrayList<>();
        integers.addAll(1, 2, 3, 4, 5, 6);

        for (Integer number : integers) {
            System.out.println(number * 2);
//            if (number == 3) integers.remove(Integer.valueOf(3)); // НЕ РЕКОМЕНДУЕТСЯ!!!
        }

        int[] array = {10, 20, 30, 40, 50};

        for (int number : array) {
            System.out.println(number);
        }

        String[] array2 = {"Hello", "Java"};

        for (String str : array2) {
            System.out.println(str);
        }


        // При переборе итератором НЕ НУЖНО добавлять или менять элементы.
        // То есть просто роспечать или что-то сделать с каждым элементом


    }
}
