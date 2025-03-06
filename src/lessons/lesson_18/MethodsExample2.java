package lessons.lesson_18;

public class MethodsExample2 {
    public static void main(String[] args) {

        int temp = 55;

        changeMe(temp);

        System.out.println(temp); // ==> 55

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArray(numbers);

        changeMe(numbers);
        printArray(numbers);


        int[] link2 = numbers;
        link2[2] = -10000;
        printArray(numbers);
        printArray(link2);


        // null - НИЧТО - спец значение, указывающее, что ссылка не ссылается на объект - отсутствие значения
        // null - Всё выдает ошибки, кроме проверить и распечатать!

        numbers = null;

        // numbers[0] = 10; // Ошибка возникает во время работы программы. Нельзя взять 0-й элемент из ничего

        numbers = new int[]{10, 20, 30};
        System.out.println("numbers: ");
        printArray(numbers);
        numbers = link2;


        String hello = "Hello";
        changeMe(hello);
        System.out.println("hello main: " + hello); // Hello - потому что стринг иммутабельна.
        // В методе мы изменяли её, но на самом деле мы создали новую ссылку с новой конкатенированной строкой.


        String str2 = hello.toUpperCase();
        System.out.println("str2: " + str2); // Здесь мы тоже создаем новую ссылку с новой строкой


    } // Methods area


    public static void changeMe(String str) {
        str = str + "!!!";
        System.out.println("str: " + str);
    }


    public static void changeMe(int[] array) {
        array[0] = 1000;
    }


    public static void changeMe(int x) {
        x = 100;
        // System.out.println(x);  ==> 100
    }

    // Метод красиво выводящий целые числа массива
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i != array.length - 1 ? ", " : "]\n"));
        }
    }
} // End class
