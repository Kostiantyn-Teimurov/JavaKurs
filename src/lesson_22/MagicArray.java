package lesson_22;

import java.util.Arrays;


public class MagicArray {

    int[] array; // null
    int cursor; // по умолчанию = 0


    // Методы, расширяющие функционал массива

    public MagicArray() {
        this.array = new int[10];
    }

    public MagicArray(int[] array) {
        this.array = new int[array.length];
        if (array.length > 0) {
            this.array = array;
            this.cursor = array.length;
        } else {
            this.array = new int[10];
        }
    }

    public MagicArray(int[] array, int cursor) {
        this.array = array;
        this.cursor = cursor;
    }

    // Добавление в массив одного элемента
    void add(int value) {
        // ПРОВЕРКА! Есть ли свободное место во внутреннем массиве
        // Если места нет - нужно добавить место
        if (cursor == array.length) {
            // Расширить внутренний массив - отдельный метод
            expandArray();
        }
        array[cursor] = value;
        cursor++;
    }

    // Добавление в массив нескольких элементов
    void add(int... numbers) {
        /*System.out.println("===============Секвенция=========");
        // c numbers я могу обращаться точно так же, как со ссылкой на массив интов
        System.out.println("Принял несколько int: " + numbers.length);
        System.out.println(Arrays.toString(numbers));
        System.out.println("У каждого инта есть индекс, как в массиве: " + numbers[0]);
        System.out.println("===============");
         */
        // Перебираем все значения. Для каждого вызываем метод ADD
        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
        }
    }

    // Динамическое расширение массива
    void expandArray() {
        System.out.println("Расширяем массив! Курсор = " + cursor);
        /*
        1. Создать новый массив бОльшего размера (в 2 раза больше)
        2. Переписать в новый массив все значения из старого
        3. Перебросить ссылку
         */
        // 1
        int[] newArray = new int[array.length * 2];

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

    // Текущее кол-во элементов в массиве
    int size() {
        return cursor;
    }

    // Возвращает значение по индексу
    int get(int index) {
        // Проконтролировать входящий индекс!

        if (index >= 0 && index < cursor) {
            return array[index];
        }

        // Fixme Указать место в коде с ошибкой / проблемой
        // Код, если индекс не корректный. Хорошего решения нет
        return -1;
        // todo Поправить обработку некорректного индекса
    }


    // Удалить элемент по индексу
    int remove(int index) {
        /*
        1. Проверка индекса на валидность
        2. Удалить значение по индексу
        3. Передвинуть курсор
        4. Вернуть старое значение
         */
        if (index >= 0 && index < cursor) {
            // Логика удаления
            int value = array[index];

            // Fixme cursor --
            for (int i = index; i < cursor - 1; i++) {
                array[i] = array[i + 1];

            }
            cursor--;
            return value;
        } else {
            // Индекс не валидный
            // todo поправить возвращаемое значение
            return -1;
        }

    }

    // Поиск по значению. Возвращать индекс
    int indexOf(int value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // Индекс последнего вхождения
    int lastIndexOf(int value) {
        int index = -1;
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                index = i;
            }
        }
        return index;
    }

    // Удаление по значению
    boolean removeByValue(int value) {
        return remove(indexOf(value)) == value;
    }

    // Удаление по значению 2
    boolean removeByValue2(int value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                for (int j = i; j < cursor - 1; j++) {
                    array[j] = array[j + 1];
                }
                cursor--;
                return true;
            }
        }
        return false;
    }

    // Найти все значения
    int[] findAllValues(int value) {
        int count = 0;

        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                count++;
            }
        }

        int[] valuesFind = new int[count];
        int idx = 0;
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                valuesFind[idx++] = i;
            }
        }
        return valuesFind;
    }

    void test() {
        System.out.println(Arrays.toString(array));
    }
}

/*
1. Добавить в массив элемент (не думаю об индексах, размере массива)
2. Динамическое изменение размера внутреннего массива
3. Возвратить строковое представление массива (все элементы массива в одной строке)
4. Добавить в массив сразу несколько значений ++
5. Текущее кол-во элементов в массиве
6. Возвращает значение по индексу
7. Удалить элемент по индексу (есть индекс - удалить элемент из массива). Возвращает старое значение
8. Удаление по значению. Возвращает boolean. Если удалил - true
9. Поиск по значению. Возвращать индекс первого вхождения элемента
10. Индекс последнего вхождения
11. Конструктор, принимающий обычный массив. Создать магический массив с элементами из этого массива
 */