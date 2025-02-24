package homeworks.homework_16;

public class Task7 {
    public static void main(String[] args) {

        String[] array = {"One", "Two", "Twenty"};

        String max = "";
        int i = 0;

        while (i < array.length) {
            if (array[i].length() > max.length()) {
                max = array[i];
            }
            i++;
        }

        i = 0;
        while (i < max.length()) {
            System.out.println(max.charAt(i));
            i++;
        }
    }
}
