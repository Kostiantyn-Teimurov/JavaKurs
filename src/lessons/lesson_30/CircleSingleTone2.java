package lessons.lesson_30;
// Рефлексия

import homeworks.homework_29.task1.Shape;

// Паттерны    !!!!!
public class CircleSingleTone2 extends Shape {

    private static CircleSingleTone2 instance;

    private double r;


    private CircleSingleTone2(double r) {
        this.r = r;
    }

    // Позволяет проверить конструктор, и потом создать его
    public static CircleSingleTone2 getCircle(double r) {
        if (r < 0) return null;
        return new CircleSingleTone2(r);
    }


    // Классический SingleTone
    // Я могу в статическом методе вызвать конструктор! Хотя не статику не могу

    // Позволяет создать объект один раз!
//    public static CircleSingleTone getInstance(double r) {
//        if (instance == null) {
//            instance = new CircleSingleTone(r);
//        }
//        return instance;
//    }


    //    public CircleSingleTone(double r) {
//        if (r < 0) return;
//        this.r = r;
//    }

    @Override
    public double calculateArea() {
        return Math.PI * r * r;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * r;
    }
}
