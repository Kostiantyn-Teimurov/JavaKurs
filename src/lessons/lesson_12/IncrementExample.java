package lessons.lesson_12;

public class IncrementExample {
    public static void main(String[] args) {
        int x = 5;
        x += 5;
        x -= 2;
        x *= 5;
        x /= 5;
        System.out.println(x);
        x = 5;
        x++; // сначала использует, а потом добавляет.
        x--;
        System.out.println(x);
        ++x; // сначала добавляет, а потом использует.
        --x;
        System.out.println(x);

    }
}
