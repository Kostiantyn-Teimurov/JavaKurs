package homeworks.homework_17;

import java.beans.PropertyEditorSupport;

public class Task3 {
    public static void main(String[] args) {

        degreeCount(0);
        degreeCount(1);
        degreeCount(4);
        degreeCount(-2);

    }

    public static void degreeCount(int num) {
        int x = 2;
        double result = 1;

        if (num == 0) {
            result = 1;
        } else if (num >= 0) {
            for (int i = 0; i < num; i++) {
                result *= x;
            }
        } else if (num < 0) {
            for (int i = 0; i > num; i--) {
                result *= x;
            }
            result = 1.0 / result;
        }

        System.out.println(result);
    }

}
