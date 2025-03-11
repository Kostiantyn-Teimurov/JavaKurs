package lists;

import java.util.Arrays;


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

        // Fixme Указать место в коде с ошибкой / проблемой
        // Код, если индекс не корректный. Хорошего решения нет
        return null;
        // todo Поправить обработку некорректного индекса
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
            // todo поправить возвращаемое значение
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
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    @Override
    // Индекс последнего вхождения
    public int lastIndexOf(T value) {
        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i] == value) return i;
        }
        return -1;
    }

    @Override
    public boolean contains(T value) {
        if (indexOf(value) == -1) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isEmpty() {
        if (array.length == 0) return true;
        return false;
    }

    @Override
    public void set(int index, T value) {
        if (index >= 0 && index < cursor) {
            array[index] = value;
        }
    }

    @Override
    public T[] toArray() {
        T[] result = (T[]) new Object[cursor];
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
}