package lessons.lesson_42;

import java.util.Arrays;
import java.util.Comparator;

public class Lambda {

    public static void main(String[] args) {

        Car[] cars = new Car[6];
        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2000, 190);
        cars[2] = new Car("Citroen", 2018, 190);
        cars[3] = new Car("VW", 2021, 250);
        cars[4] = new Car("Ferrari", 2025, 300);
        cars[5] = new Car("Ferrari", 2021, Integer.MIN_VALUE);

        // Он имеет РОВНО ОДИН абстрактный метод. (метод который нужно реализовать)
        // Функциональный интерфейс - это интерфейс,
        // Интерфейс Comparator - Функциональный интерфейс

        /*
        Лямбда-выражения это краткий способ реализаций анонимных функций (методов) в Java
        Компактный синтаксис для реализации методов функциональных интерфейсов

        Лямбда-выражение во многих случаях могут заменить анонимные классы и реализовывать на лету функциональные интерфейсы

        (parameters) -> expression
        или
        (parameters) -> {statements;}
         */


        // По году в обратном порядке с использованием лямбда-выражения
        Arrays.sort(cars, (Car car1, Car car2) -> {
            return car2.getYear() - car1.getYear();
        });

        printCars(cars);


        Arrays.sort(cars, (Car car1, Car car2) -> car2.getYear() - car1.getYear());

        printCars(cars);

        // Отсортировать машины по максимальной скорости в порядке убывания.
        // Если скорость совпадает - отсортировать по году - естественный порядок (от младшей к старшей)

        Comparator<Car> carComparator = (c1, c2) -> {
//            System.out.println(c1.getMaxSpeed() + " | " + c2.getMaxSpeed());
//            int speedCompare = c1.getMaxSpeed() - c2.getMaxSpeed();
            // Нужно использовать оберточный Integer.compare(x1, x2)
            int speedCompare = Integer.compare(c1.getMaxSpeed(), c2.getMaxSpeed());
//            System.out.println("c1 - c2: " + speedCompare);

            if (speedCompare == 0) {
                return Integer.compare(c1.getYear(), c2.getYear());
            }

            return speedCompare;
        };

        Arrays.sort(cars, carComparator);
        printCars(cars);

        System.out.println("\n==========  comparing  ============\n");
        // Comparator - имеет набор статических и дефолтных методов, облегчающих написание сложных / составных компараторов

        // comparing - позволяет сортировать объекты по ключу
        // Функция-ключ - это способ вытащить из объекта то значение, по которому мы хотим сравнить два Объекта

        /*
        car -> car.geYear()
        car::getModel()
         */

        // Отсортировать машины по модели в естественном порядке


        printCars(cars);

        // Ссылка на метод - это сокращенная запись лямбды
        Arrays.sort(cars, Comparator.comparing(Car::getModel));
        printCars(cars);


        // Специальные версии метода для сравнения примитивов. Избежать авто-упаковки/распаковки

        //comparingInt, comparingInt, comparingInt
        Arrays.sort(cars, Comparator.comparingInt(Car::getYear));

        // Отсортировать по году выпуска в порядке убывания
        Arrays.sort(cars, Comparator.comparing(Car::getYear, Comparator.reverseOrder()));
        printCars(cars);

        /*
        Второй параметр метода comparing
        Comparator.naturalOrder() - Естественный порядок сортировки
        Comparator.reverseOrder() - Обратный порядок сортировки
        Comparator.nullsFirst() - значения null будут признаны как наименьшие (т.е. Располагаться слева)
         */
        Arrays.sort(cars, Comparator.comparing(Car::getYear, Comparator.naturalOrder()));

        cars[5] = new Car(null, 2021, 250);

        Arrays.sort(cars, Comparator.comparing(Car::getModel, Comparator.nullsFirst(String::compareTo)));
        Arrays.sort(cars, Comparator.comparing(Car::getModel, Comparator.nullsLast(Comparator.naturalOrder())));
        Arrays.sort(cars, Comparator.comparing(Car::getModel, Comparator.nullsLast(Comparator.reverseOrder())));

        printCars(cars);

        System.out.println("============================\n");
        // Отсортировать по модели. Если модели равны, то отсортировать по убыванию года выпуска

        Arrays.sort(cars, Comparator.comparing(Car::getModel, Comparator.nullsFirst(String::compareTo)).thenComparing(Car::getYear, Comparator.reverseOrder()));

        printCars(cars);

        // Отсортировать машины по году, если равен - отсортировать по модели в обратном порядке

        Arrays.sort(cars, Comparator.comparing(Car::getYear, Comparator.nullsLast(Integer::compareTo)).thenComparing(Car::getModel, Comparator.nullsLast(Comparator.reverseOrder())));
        printCars(cars);

        // Отсортировать машины по году в обратном порядке, если год равен - отсортировать по макс скорости

        Arrays.sort(cars, Comparator.comparing(Car::getYear, Comparator.nullsLast(Comparator.reverseOrder())).thenComparing(Car::getMaxSpeed));
        printCars(cars);

        Arrays.sort(cars, Comparator.comparing(Car::getYear).reversed());
        printCars(cars);


    }

    public static void printCars(Car[] cars) {
        System.out.println("==================");
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("==================");
    }
}
