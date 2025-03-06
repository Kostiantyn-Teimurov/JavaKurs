package homeworks.homework_28.task2;

import lessons.lesson_28.animals.Cat;

public class VehicleApp {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();
        Vehicle motorcycle = new Motorcycle();

        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = car;
        vehicles[1] = bicycle;
        vehicles[2] = motorcycle;

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].startEngine();
        }


    }
}
