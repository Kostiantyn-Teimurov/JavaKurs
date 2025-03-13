package homeworks.homework_32.task1;

public class PairApp {
    public static void main(String[] args) {

        Pair<String> pair = new Pair<>("Hello", "Java");

        System.out.println(pair);
        System.out.println(pair.toString());

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        pair.swap();
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

    }
}
