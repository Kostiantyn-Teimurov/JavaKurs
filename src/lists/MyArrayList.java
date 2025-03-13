package lists;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;


public class MyArrayList<T> implements MyList<T> {
    private T[] array; // null
    private int cursor; // по умолчанию = 0


    @SuppressWarnings("unchecked") // Подавляю предупреждение компилятора о непроверяемом приведении типа
    public MyArrayList() {
        // Стирание типов. НЕВОЗМОЖНО создать объект типа Т
        this.array = (T[]) new Object[10];
    }

    @SuppressWarnings("unchecked")
    public MyArrayList(T[] array) {

        if (array == null || array.length == 0) {
            this.array = (T[]) new Object[10];
        } else {
            this.array = (T[]) new Object[array.length * 2];
            // (int...numbers) может принять ссылку на массив int[]
            addAll(array);
        }
    }


    @Override
    // Добавление в массив одного элемента
    public void add(T value) {
        // ПРОВЕРКА! Есть ли свободное место во внутреннем массиве
        // Если места нет - нужно добавить место
        if (cursor == array.length) {
            // Расширить внутренний массив - отдельный метод
            expandArray();
        }
        array[cursor] = value;
        cursor++;
    }

    //  СЕКВЕНЦИЯ!!!!!!!!!!! полезно
    @Override
    public void addAll(T... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
        }
    }

    // Динамическое расширение массива
    @SuppressWarnings("unchecked")
    private void expandArray() {
        System.out.println("Расширяем массив! Курсор = " + cursor);
        // 1
        T[] newArray = (T[]) new Object[array.length * 2];

        // 2
        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }

        // 3. Перебрасываем ссылку. Переменная array хранит ссылку на новый массив
        array = newArray;
    }


    // Возвращает строковое представление массива
    public String toString() {

        if (cursor == 0) return "[]";

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result += array[i] + (i < cursor - 1 ? ", " : "]");
        }

        return result;
    }

    @Override
    // Возвращает значение по индексу
    public T get(int index) {
        // Проконтролировать входящий индекс!

        if (index >= 0 && index < cursor) {
            return array[index];
        }

        return null;
    }


    @Override
    // Удалить элемент по индексу
    public T remove(int index) {
        if (index >= 0 && index < cursor) {
            // Логика удаления
            T value = array[index];

            // Fixme cursor --
            for (int i = index; i < cursor - 1; i++) {
                array[i] = array[i + 1];

            }
            cursor--;
            return value;
        } else {
            // Индекс не валидный
            return null;
        }

    }

    @Override
    // Удаление по значению
    public boolean remove(T value) {
        int index = indexOf(value);
        if (index < 0) return false;
        remove(index);
        return true;
    }

    @Override
    // Поиск по значению. Возвращать индекс
    public int indexOf(T value) {
        for (int i = 0; i < cursor; i++) {

            // null-безопасное сравнение
            if (Objects.equals(array[i], value)) {
//            if (array[i].equals(value)) { // Если null - будет ОШИБКА
                return i;
            }
        }
        return -1;
    }

    @Override
    // Индекс последнего вхождения
    public int lastIndexOf(T value) {
        for (int i = cursor - 1; i >= 0; i--) {
            // Безопасное сравнение, если null. null-безопасный метод сравнение
            if (Objects.equals(array[i], value)) return i;
//            if (array[i].equals(value)) return i;
        }
        return -1;
    }

    @Override
    public boolean contains(T value) {
        return indexOf(value) >= 0;
    }

    @Override
    public boolean isEmpty() {
        if (array.length == 0) return true;
        return false;
    }

    // Переписать значение по указанному индексу
    @Override
    public void set(int index, T value) {
        if (index >= 0 && index < cursor) {
            array[index] = value;
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public T[] toArray() {
        /*
        1. Создать массив размерностью cursor (кол-во значимых элементов)
        2. Пройтись по внутреннему массиву и скопировать все элементы в новый (до курсора)
        3. Вернуть ссылку на новый массив
         */

        // Взять какой-то объект из моего массива и узнать с помощью Рефлексии тип этого объекта.
        // И потом с помощью Рефлексии я могу создать массив этого типа

        if (cursor == 0) return null;

        Class<T> clazz = (Class<T>) array[0].getClass();
        System.out.println("clazz: " + clazz);

        // Создаю массив того же типа, что и 0-й элемент.
        T[] result = (T[]) Array.newInstance(clazz, cursor);

        // TODO Здесь будет ОШИБКА
//        T[] result = (T[]) new Object[cursor];
//        T[] res = new T[11]; // - Не можем так сделать, потому что там тип Object
//        T obj = new T();

        for (int i = 0; i < cursor; i++) {
            result[i] = array[i];
        }
        return result;
    }

    @Override
    // Текущее кол-во элементов в массиве
    public int size() {
        return cursor;
    }

    void test() {
        System.out.println(Arrays.toString(array));
    }


    // Невозможно вернуть объект типа интерфейс.
    // Если тип возвращаемого значения (или параметр метода) имеет тип "Интерфейс",
    // это значит, что я должен вернуть объект класса, который имплементировал этот интерфейс

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }


    private class MyIterator implements Iterator<T> {

        int currentIndex = 0;


        @Override
        public boolean hasNext() {
            return currentIndex < cursor;
        }

        @Override
        public T next() {
            return array[currentIndex++];
        }

    } // End class MyIterator


}