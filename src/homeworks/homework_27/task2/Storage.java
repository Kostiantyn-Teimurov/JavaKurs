package homeworks.homework_27.task2;

public class Storage extends Component {

    private final int capacity;

    public Storage(String brand, String model, int capacity) {
        super(brand, model);
        this.capacity = capacity;
    }

    public String toString() {
        return "Storage: capacity=" + capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
