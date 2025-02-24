package homeworks.homework_16;

public class Task6 {
    public static void main(String[] args) {

        int[] numbers = {5, 6, -25, 0, 31, -15};

        int min = numbers[0];
        int max = numbers[0];
        int idxMin = 0;
        int idxMax = 0;

        int i = 0;
        while (i < numbers.length) {
            if (numbers[i] < min) {
                min = numbers[i];
                idxMin = i;
            }
            if (numbers[i] > max) {
                max = numbers[i];
                idxMax = i;
            }
            i++;
        }
        numbers[idxMin] = max;
        numbers[idxMax] = min;

        /*

        i = 0;
        while (i < numbers.length) {
            System.out.print(numbers[i] + ", ");
            i++;
        }

         */
    }
}
