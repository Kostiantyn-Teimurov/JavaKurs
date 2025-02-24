package homeworks.homework_17;

public class Task2 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        replaceArray(numbers);
        replaceArray(numbers, 2);
        replaceArray(numbers, 7);
        replaceArray(numbers, 8);
    }

    public static void replaceArray(int[] array) {
        System.out.print("[");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + (i != 0 ? ", " : "]\n"));
        }
    }


    public static void replaceArray(int[] array, int idx) {
        if (idx < 0 || idx > array.length || array == null) {
            System.out.println("Error");
        } else {
            System.out.print("[");
            for (int i = 0; i < idx; i++) {
                System.out.print(array[i] + (i != array.length - 1 ? ", " : "]\n"));
            }
            for (int i = array.length - 1; i >= idx; i--) {
                System.out.print(array[i] + (i > idx ? ", " : "]\n"));
            }
        }


    }

}
