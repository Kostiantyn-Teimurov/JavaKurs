package lessons.lesson_24;

public class CarApp {
    public static void main(String[] args) {

        System.out.println("static field: " + Car.totalCars); // поле

        Car bmw = new Car("BMW", 200);
        System.out.println(Car.totalCars);
        System.out.println(bmw.toString());

        Car vw = new Car("VW", 300);
        System.out.println(Car.totalCars);
        System.out.println(vw.toString());

        System.out.println("Static variable: " + Car.totalCars);

        // Я могу обратиться к статике от имени конкретного объекта
        // Но это плохо. НЕ рекомендуется!
        // Нужно от имени класса

        // Модификатор статик применим только к полям или методам класса
        // static int x; - нельзя


    }
}
