package homeworks.homework_32.task1;

public class Pair<T> {
    private T x1;
    private T x2;

    public Pair(T x1, T x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public T getFirst() {
        return x1;
    }

    public T getSecond() {
        return x2;
    }

    public void setFirst(T value) {
        this.x1 = value;
    }

    public void setSecond(T value) {
        this.x2 = value;
    }

    void swap() {
        T y = x1;
        x1 = x2;
        x2 = y;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "x1 = " + x1 +
                ", x2 = " + x2 +
                '}';
    }
}
