package homeworks.homework_32.task3;

public class NumericPair<T extends Number, E extends Number> {
    private T x;
    private E y;

    public NumericPair(T x, E y) {
        this.x = x;
        this.y = y;
    }

    public double sum() {
        return x.doubleValue() + y.doubleValue();
    }


    public static void main(String[] args) {

        NumericPair<Integer, Integer> intPair = new NumericPair<>(10, 20);
        System.out.println(intPair.sum());

        NumericPair<Double, Double> doublePair = new NumericPair<>(5.5, 4.5);
        System.out.println(doublePair.sum());

        NumericPair<Double, Double> doublePair2 = new NumericPair<>(Double.valueOf(5), 4.5);
        System.out.println(doublePair2.sum());

        NumericPair<Byte, Float> bytePair = new NumericPair<>((byte) 5, 10F);
        System.out.println(bytePair.sum());
        // TODO
//        public byte byteValue() return (byte)intValue();

    }

}
