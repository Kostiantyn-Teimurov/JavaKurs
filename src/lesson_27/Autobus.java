package lesson_27;

/*
Ассоциация - это связь, при которой один объект связан с другим объектом. Наиболее общая форма связи

Агрегация - это форма ассоциации, представляющая собой отношение "часть-целое",
где часть может существовать независимо от целого

Композиция - это более жесткая форма агрегации (также отношение часть-целое), НО где часть НЕ может существовать без целого
Обычно часть создается вместе с целым. Если целое уничтожается - часть также уничтожается. (жизненные циклы объектов)

Ассоциации (в том числе Агрегация и Композиция) реализуются через создание ссылок в классе на другие объекты
Это значит, что класс содержит поля, которые ссылаются на объекты других классов.

Ассоциация - это отношение между двумя классами, где один класс использует другой класс в качестве одного из своих полей


Автобус содержит Водителя. HAS-A Агрегация. Водитель может существовать отдельно от автобуса.

Автобус содержит Автопилот. HAS-A. Композиция. Автопилот является неотъемлемой частью автобуса.
Жесткая / неразрывная связь. Часть создается вместе с целым.

Направленность. Ассоциация может однонаправленная или двунаправленная.

Кардинальность связи. Определяет сколько объектов одного класса может быть ассоциировано с объектом

One-to-One, One-to-Many, Many-to-Many

1 : 1 Автобус и двигатель
Каждый автобус может иметь ровно один двигатель. И на каждый двигатель приходится ровно один автобус.

1 : Many -> Автобус и список пассажиров. Один автобус может иметь множество пассажиров. Один пассажир в одном автобусе.

Many : Many -> Список автобусов и список автобусных остановок. Каждый автобус останавливается на множестве остановок
На каждой остановке может обслуживаться множество автобусов



 */


import lesson_26.transport.Bus;

public class Autobus {

    private static int counter = 1;

    // Уникальный идентификатор объекта
    private final int id;

    private BusDriver driver; // Агрегация (мягкая связь)
    private AutoPilot autoPilot; // Композиция (жесткая связь)

    private final int capacity;
    private int countPassengers;

    private final Passenger[] passengers;


    public Autobus(BusDriver driver, int capacity) {
        this.id = counter++;
        this.driver = driver;
        driver.setAutobus(this);
        this.capacity = capacity;
        this.autoPilot = new AutoPilot("AP-v001");
        this.passengers = new Passenger[capacity];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Autobus {");
        sb.append("id=").append(id);
        sb.append(", driver=").append(driver.toString());
        sb.append(", autoPilot=").append(autoPilot.toString());
        sb.append(", capacity=").append(capacity).append("}");
        return sb.toString();
//        return "Autobus {" +
//                "id=" + id +
//                ", driver=" + driver.toString() +
//                ", autoPilot=" + autoPilot.toString() +
//                ", capacity=" + capacity +
//                '}';
    }

    public void showListPassengers() {
        if (countPassengers == 0) {
            System.out.println("[]");
            return;
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < countPassengers; i++) {
            sb.append(passengers[i].toString());
            sb.append((i < countPassengers - 1) ? ", " : "]");
        }
        System.out.println(sb.toString());
    }

    public boolean takePassenger(Passenger passenger) {
        if (passenger == null) return false;
        //1. Проверить свободное место
        //2. Находится ли этот пассажир в автобусе.
        //3. Добавляем в список пассажиров, увеличиваем кол=во, тру
        //4. Иначе - ошибка, фолс.

        if (countPassengers < capacity) {
            if (isPassengerInBus(passenger)) {
                // пассажир в автобусе, тру
                System.out.printf("Пассажир с id %d уже в автобусе с id %d\n", passenger.getId(), this.id);
                return false;
            }
            //  Садим на борт пассажира
            passengers[countPassengers] = passenger;
            countPassengers++;
            System.out.printf("Пассажир с id %d завершил посадку в автобус с id %d\n", passenger.getId(), this.id);
            return true;
        }

        // Свободного места в автобусе нет
        System.out.printf("В автобусе с id %d свободных мест нет!", this.id);
        return false;
    }

    public boolean dropPassenger(Passenger passenger) {
        if (passenger == null) return false;
        if (countPassengers <= 0) {
            System.out.printf("В автобусе с id %d больше нет пассажиров!\n", this.id);
            return false;
        }
        if (!isPassengerInBus(passenger)) {
            System.out.printf("В автобусе с id %d нет пассажира с id %d!\n", this.id, passenger.getId());
            return false;
        }
        for (int i = 0; i < countPassengers; i++) {
            if (passengers[i] == passenger) {
                for (int j = i; j < countPassengers - 1; j++) {
                    passengers[j] = passengers[j + 1];
                }
            }
        }
        System.out.printf("Пассажир с id %d вышел из автобуса с id %d\n", passenger.getId(), this.id);
        countPassengers--;
        return true;
    }

    private boolean isPassengerInBus(Passenger passenger) {
        for (int i = 0; i < countPassengers; i++) {
            if (passengers[i].getId() == passenger.getId()) {
                //id совпали = один и тот же объект
                return true;
            }
        }
        // Пассажира с таким id нет в массиве пассажиров
        return false;
    }


    public void setDriver(BusDriver driver) {
        this.driver.setAutobus(null);
        this.driver = driver;
        this.driver.setAutobus(this);
    }


    public int getId() {
        return id;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public AutoPilot getAutoPilot() {
        return autoPilot;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }
}
