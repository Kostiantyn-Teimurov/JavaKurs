package lessons.lesson_12;

public class Overflow {
    public static void main(String[] args) {
        // -128...127
        byte byteVar = 127;
        byteVar++;
        System.out.println(byteVar);
        byteVar--;
        System.out.println(byteVar);

        short shortVar = 32767;
        shortVar += 5;
        System.out.println(shortVar);

    }
}
