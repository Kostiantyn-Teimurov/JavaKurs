package homeworks.homework_17;

public class Task1 {
    public static void main(String[] args) {

        countStringElements("Hello");

        System.out.println("Hello".length());
    }

    public static void countStringElements(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
        }
        System.out.println(count);
    }

}
