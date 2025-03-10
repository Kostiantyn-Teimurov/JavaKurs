package lessons.lesson_30.flyable;

public class Airplane extends Transport implements Flyable {


    public Airplane(int capacity) {
        super(capacity);
    }

    @Override
    boolean takePassenger() {
        if (amountPassenger < capacity) {
            amountPassenger++;
            return true;
        }

        return false;
    }

    @Override
    public void fly() {
        System.out.println("Airplane flying");
    }


}
