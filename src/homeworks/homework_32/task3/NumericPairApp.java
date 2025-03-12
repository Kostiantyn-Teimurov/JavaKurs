package homeworks.homework_32.task3;

public class NumericPairApp {
    public static void main(String[] args) {

        NumericPair<Integer> intPair = new NumericPair<>(10, 20);
        System.out.println(intPair.sum());

        NumericPair<Double> doublePair = new NumericPair<>(5.5, 4.5);
        System.out.println(doublePair.sum());


        NumericPair<Byte> bytePair = new NumericPair<>((byte) 1, (byte) 10);
        System.out.println(bytePair.sum());
        // TODO
//        public byte byteValue() return (byte)intValue();

    }
}
