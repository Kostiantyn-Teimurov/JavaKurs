package lessons.lesson_30.flyable;


// Множественная реализация интерфейсов
public class Duck implements Flyable, Swimmable {


    @Override
    public void fly() {
        System.out.println("Duck flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck swimming");
    }


//    void test() {
//        System.out.println();
//    }
}
