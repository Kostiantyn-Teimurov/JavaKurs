package lessons.lesson_26.transport;

// extends - наследование
// Smartphone is-a Vehicle -> НЕ верно. Применять наследование нельзя
public class Bus extends Vehicle {

    private int capacity;
    private int countPassengers;

    // Так выглядит конструктор по-умолчанию для класса-потомка
//    public Bus() {
//        // super - обращение к родительскому классу
//        // super() - вызов конструктора родительского класса
//        super();
//    }


    public Bus(String model, int year, int capacity) {
        // Нужно сначала создать объект родителя
        // Если в конструкторе потомке нет явного вызова конструктора родителя,
        // то будет вызван пустой конструктор родителя
        super(model, year); // вызов родительского конструктора, принимающего модель и год
        // super() вызывается сам, если в родителя есть пустой конструктор

        // Вызов конструктора родителя должен быть первой строчкой исполняемого кода
        this.capacity = capacity;

    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public boolean takePassenger() {
        // Проверить есть ли свободное место - посадить. Увеличить кол-во пассажиров
        if (countPassengers < capacity) {
            countPassengers++;
            System.out.println("Пассажир зашел в автобус: " + model);
//            System.out.println("Пассажир зашел в автобус: " + getModel());
            // Есть доступ в наследнике к полю родителя с модификатором protected
            return true;
        }
        System.out.printf("В автобусе %s больше мест нет. Сейчас %d пассажиров \n", model, countPassengers);
        return false;
    }

    // Метод высадки пассажира из автобуса
    public boolean dropPassenger() {
        // Задача - не уйти в минус
        if (countPassengers > 0) {
            countPassengers--;
            System.out.println("Пассажир вышел из автобуса: " + model);
            return true;
        }
        System.out.println("В автобусе больше нет пассажиров");
        return false;
    }


}
