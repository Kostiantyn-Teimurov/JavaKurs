package homeworks.homework_29.task1;
// Рефлексия

// Паттерны    !!!!!
public class CircleSingleTone extends Shape {

    private static CircleSingleTone instance;

    private double r;


    private CircleSingleTone(double r) {
        this.r = r;
    }

    // Позволяет проверить конструктор, и потом его вызвать, чтобы создать объект
    public static CircleSingleTone getCircle(double r) {
        if (r < 0) return null;
        return new CircleSingleTone(r);
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
