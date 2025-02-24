package lesson_12;

public class PrintFormat {
    public static void main(String[] args) {
        double result = 20.0 / 7;
        int age = 25;
        String name = "Alice";

        System.out.println("Name: " + name + ", Age: " + age + ", score: " + result);

        // printf - форматированный вывод
        System.out.printf("Name: %s, Age: %d, score: %.3f\n", name, age, result);
        System.out.println("World");

        /*
        Место куда я хочу вставить значение переменной - помечается %
        После % я должен указать тип данных
        %d - целое число (digit)
        %f - число с плавающей точкой (float)
        %.3f - указать кол-во знаков после запятой
        %s - текст (string)
        \n - работает в любой строке - перевод каретки
        */
    }
}
