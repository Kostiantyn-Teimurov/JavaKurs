package lessons.lesson_31.generics;

// Дженерики работают только с объектами классов. Только со ссылочными типами данных
// Не работают с примитивными типами данных


// Мы создаем универсальный класс. И не указываем конкретный тип данных, с которым он работает
// Мы хотим определять тип данных при создании каждого объекта


public class GenericBox<T> {  // Символ заполнитель. Т - type. E - element. K, V - key, value
    // <T> - означает, что вместо Т при создании объекта будет подставлен конкретный тип данных

    private T value;

    public GenericBox(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericBox{" +
                "value=" + value +
                '}';
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
