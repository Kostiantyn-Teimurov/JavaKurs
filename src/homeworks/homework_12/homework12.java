package homeworks.homework_12;

public class homework12 {
    public static void main(String[] args) {
        // Task1
        int num1 = 0;
        int num2 = 1;
        int num3 = 2;
        int num4 = 3;
        int result;
        result = (num1 + num2 + num3 + num4) / 4;
        System.out.println(result); // Отбросила 0.5
        double result1 = (num1 + num2 + num3 + num4) / 4.0;
        double difference = result1 - result;
        System.out.println(difference);

        // Task2
        double temp = (2 + 5 + 6 + 4 + 5 + 4 + 8) / 7.0;
        System.out.println(temp);

        // Task3
        int age = 26;
        double milkCost = 1.53;
        String name = "Kostia";
        System.out.printf("Привет! Меня зовут %s, мне %d лет. Я покупаю молоко по %.2f за литр.\n", name, age, milkCost);

        // Task4
        int var1 = 10;
        double myDouble;
        myDouble = var1;
        System.out.println(myDouble);

        // Task5
        myDouble = 5.99;
        int myInt;
        myInt = (int) myDouble;
        System.out.println(myInt);

        // Task6
        long bigNumber;
        bigNumber = 15000000000L;
        int smallNumber;
        smallNumber = (int) bigNumber;
        System.out.println(smallNumber);

        // Потому что в int всего 4 млрд 294 млн 967 тысяч 296 значений - 15 млрд не помещаются.
        // Прогоняет три раза по кругу и на четвертый выводит что осталось
        long result2 = bigNumber % 4294967296L;
        System.out.println(result2);

        System.out.println("smallNumber: " + smallNumber);
        System.out.println("long: " + Long.toBinaryString(bigNumber));
        System.out.println("int1:    " + Integer.toBinaryString(smallNumber));

    }
}
