package homeworks.homework_32.task3;

public class NumericPair<T extends Number> {
    private T x;
    private T y;

    public NumericPair(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public double sum() {
        return x.doubleValue() + y.doubleValue();
    }

}
