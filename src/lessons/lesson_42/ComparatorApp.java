package lessons.lesson_42;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {

        int[] ints = new int[]{9, 5, 1, 2, 7, 3, 0};

        // Примитивы и обертки УЖЕ имеют встроенную реализацию Comparable
        Arrays.sort(ints);

        System.out.println(Arrays.toString(ints));

        Car[] cars = new Car[6];
        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2000, 190);
        cars[2] = new Car("Citroen", 2018, 190);
        cars[3] = new Car("VW", 2021, 250);
        cars[4] = new Car("Ferrari", 2025, 300);
        cars[5] = new Car("Ferrari", 2021, Integer.MIN_VALUE);

        /*
        A < a
        Z < a
        b > A
        A < B
         */
        printCars(cars);


        Arrays.sort(cars);
        // Интерфейс Comparable<T> (сравнимый)
        // Интерфейс Comparator<T>
        printCars(cars);


        CarSpeedComparator carSpeedComparator = new CarSpeedComparator();
        Arrays.sort(cars, carSpeedComparator);
        printCars(cars);

        Arrays.sort(cars, new CarModelComparator());
        printCars(cars);


        System.out.println("\n============  Анонимные классы  =================\n");

        // Анонимный класс - это класс для создания объекта на лету, без явного объявления класса
        // Используются когда необходим одноразовый объект

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getModel().compareTo(car2.getModel());
            }
        });

        printCars(cars);

        // Сортировка по году в обратном порядке
        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car2.getYear() - car1.getYear();
            }
        });


        // Сравнить машины по году, если == тогда сравнить ещё и по модели в порядке убывания
        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                int yearCompare = c1.getYear() - c2.getYear();
                if (yearCompare != 0) return yearCompare;

                // обратная сортировка по модели
                return c2.getModel().compareTo(c1.getModel());
            }
        });
        printCars(cars);


        System.out.println("\n===============  Функциональные интерфейсы  ====================\n");
        System.out.println("В файле лямбда");

        Comparator<Car> byModel = Comparator.comparing(car -> car.getModel());
        Arrays.sort(cars, byModel);

    }


    public static void printCars(Car[] cars) {
        System.out.println("==================");
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("==================");
    }


}
