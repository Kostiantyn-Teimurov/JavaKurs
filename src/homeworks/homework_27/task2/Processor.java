package homeworks.homework_27.task2;

public class Processor extends Component {

    private final int power;

    public Processor(String brand, String model, int power) {
        super(brand, model);
        this.power = power;
    }

    public String toString() {
        return "Processor: power=" + power;
    }

    public int getPower() {
        return power;
    }
}
