package lessons.lesson_15;

public class TernaryOperator {
    public static void main(String[] args) {

        int age = 20;
        String status;

        if (age >= 18) {
            status = "Совершеннолетний";
        } else {
            status = "Маленький";
        }

        System.out.println(status);

        // переменная = (условие) ? значение_если_True : значение_если_False

        String result = (age >= 18) ? "Совершеннолетний" : "Маленький";
        System.out.println(result);


        int x = 10;

        System.out.println("Значение в переменной x " + ((x >= 0) ? "положительное" : "отрицательное"));

    }
}
