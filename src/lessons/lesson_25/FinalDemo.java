package lessons.lesson_25;

// final - применять к классам, членам классов, переменным (и к аргументам методов)

public class FinalDemo {

    // Для примитивных типов данных - после инициализации нельзя изменить значение
    private final int capacity;

    // Ссылочный тип данных. Нельзя изменить значение переменной (привязать новый объект)
    // Состояние объекта, который привязан, я могу изменять
    private final int[] ints = new int[5]; // [0, 0, 0, 0, 0]

    private int notFinal;


    public FinalDemo(int capacity) {
        this.capacity = capacity;
        // Нельзя поменять значение final переменной
        // this.capacity ++;

        // Нельзя присвоить ссылку на другой объект или null
//        this.ints = new [2];
        ints[0] = 100;
        ints[1] = 200;
        ints[2] = 300;
    }

    // Параметры методы тоже можно пометить как final
    // Внутри метода невозможно изменить значение переменной
    public final void finalArguments(final int x, final int[] array) {
        // x++; - нельзя изменить

        // Не могу присвоить ссылку на новый объект
        // array = new int[10];
        array[0] = x;
        array[1] = 1000;
    }

    // Сетеры для финальных полей не генерируются
//    public void setCapacity(int capacity) {
//        this.capacity = capacity;
//    }

    public int getCapacity() {
        return capacity;
    }

    public int[] getInts() {
        return ints;
    }

    public int getNotFinal() {
        return notFinal;
    }

    public void setNotFinal(int notFinal) {
        this.notFinal = notFinal;
    }
}
