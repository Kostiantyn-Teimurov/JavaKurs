package lessons.lesson_30.flyable;

public abstract class Transport {

    int capacity;
    int amountPassenger;

    public Transport(int capacity) {
        this.capacity = capacity;
    }

    abstract boolean takePassenger();


    public int getCapacity() {
        return capacity;
    }
}
