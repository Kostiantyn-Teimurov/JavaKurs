package homeworks.homework_17;

public class Task5 {
    public static void main(String[] args) {

        String[] array = {"One", "Two", "Twenty"};

        longestString(array);

    }

    public static void longestString(String[] array) {
        String max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > max.length()) {
                max = array[i];
            }
        }

        for (int i = 0; i < max.length(); i++) {
            System.out.println(max.charAt(i));
        }
    }


}
