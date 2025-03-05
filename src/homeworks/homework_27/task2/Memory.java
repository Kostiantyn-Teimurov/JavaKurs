package homeworks.homework_27.task2;

public class Memory extends Component {

    private final int capacity;

    public Memory(String brand, String model, int capacity) {
        super(brand, model);
        this.capacity = capacity;
    }

    public String toString() {
        return "Memory: capacity=" + capacity;
    }


    public int getCapacity() {
        return capacity;
    }
}
