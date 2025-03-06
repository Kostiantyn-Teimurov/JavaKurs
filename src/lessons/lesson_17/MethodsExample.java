package lessons.lesson_17;

public class MethodsExample {
    public static void main(String[] args) {

        sayHello();
        sayHello();

        char ch = 'A';

        printDecimalCodeOfChar(ch);

        char ch2 = 'B';
        printDecimalCodeOfChar(ch2);
        printDecimalCodeOfChar('6');


        int[] array = {1, 45, 76, 54, 980, 435, 9, 0};
        int[] array2 = {1, 2, 3, 4, 5, 56, -100, 0, 43625343, 432, -4345};
        printArray(array);
        printArray(array2);


        String[] strings = {"Hello", "Java", "Test", "World"};
        // printArray(strings); - ошибка
        printArray(strings);


        testParameterOrder(1, "Hello");
        testParameterOrder("Java", 200);


    } // Method area

    /*
    Перегрузка методов
     */


    public static void testParameterOrder(int x, String str) {
        System.out.println("INT + String: " + x + " | " + str);
    }

    public static void testParameterOrder(String str, int x) {
        System.out.println("INT + String: " + x + " | " + str);
    }

    // Метод красиво выводящий все элементы массива СТРОК
    public static void printArray(String[] strings) {
        System.out.print("[");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + (i == strings.length - 1 ? "]\n" : ", "));
        }
    }


    // Метод красиво выводящий все элементы массива целых чисел
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i != array.length - 1 ? ", " : "]\n"));
        }
    }


    public static void printDecimalCodeOfChar(char ch1) {
        // char ch1 = ch (из аргумента вызова)
        System.out.println((int) ch1);
    }

    public static void sayHello() {
        System.out.println("Hello World!");
    }
} // End class
