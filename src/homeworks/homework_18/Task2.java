package homeworks.homework_18;

public class Task2 {
    public static void main(String[] args) {

        String[] array = new String[]{null, null, "Hi", "Hello", "Hello, how are?"};

        String[] array2 = getArray(array);


        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + ", ");
        }

    } // Methods

    public static String[] getArray(String[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Error");
            return new String[]{};
        }

        String nutNullValue = findFirstNotNullValueInArray(array);

        if (nutNullValue == null) {
            // Весь массив забит налами
            System.out.println("Not-Null not found in array");
            return new String[0]; // []
        }


        String smallest = nutNullValue;
        String biggest = nutNullValue;

        for (int i = 0; i < array.length; i++) {
            // if (array[i] == null) continue;
            if (array[i] != null && array[i].length() > biggest.length()) {
                biggest = array[i];
            }
            if (array[i] != null && array[i].length() < smallest.length()) {
                smallest = array[i];
            }
        }
        return new String[]{biggest, smallest};

    }


    public static String findFirstNotNullValueInArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) return strings[i];
        }
        // Если мы не нашли ничего, то возвращаем null.
        return null;
    }


} // End