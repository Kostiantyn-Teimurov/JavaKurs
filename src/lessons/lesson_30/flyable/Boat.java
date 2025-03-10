package lessons.lesson_30.flyable;

public class Boat extends Transport implements Swimmable {

    public Boat(int capacity) {
        super(capacity);
    }

    @Override
    public void swim() {
        System.out.println("Boat swimming");
    }

    @Override
    boolean takePassenger() {
        return false;
    }
}
