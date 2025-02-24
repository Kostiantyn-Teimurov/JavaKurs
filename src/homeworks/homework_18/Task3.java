package homeworks.homework_18;

public class Task3 {
    public static void main(String[] args) {

        int[] array = {0, 13, -25, 11, 31, 55, 98, 11, 5};
        int[] simples = getSimple(array);

        for (int i = 0; i < simples.length; i++) {
            System.out.print(simples[i] + ", ");
        }

    } // Methods

    public static int[] getSimple(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (isSimpleNum(array[i])) {
                count++;
            }
        }

        int[] simples = new int[count];
        int idx = 0;

        for (int i = 0; i < array.length; i++) {
            if (isSimpleNum(array[i])) {
                simples[idx++] = array[i];
            }
        }
        return simples;

    }


    public static boolean isSimpleNum(int x) {
        boolean isSimple = true;

        if (x < 2) {
            isSimple = false;
            return isSimple;
        }
        if (x == 2 || x == 3) {
            return isSimple;
        }
        if (x % 2 == 0 || x % 3 == 0) {
            isSimple = false;
            return isSimple;
        }
        for (int i = 5; i * i <= x; i += 6) {
            if (x % i == 0 || x % (i + 2) == 0) {
                isSimple = false;
                return isSimple;
            }
        }
        return isSimple;

    }


} // End
