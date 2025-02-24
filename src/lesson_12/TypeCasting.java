package lesson_12;

public class TypeCasting {
    public static void main(String[] args) {
        // Неявное преобразование - автоматически, когда меньший тип в больший
        byte byteVal = 123;
        int intVal;
        intVal = byteVal;
        System.out.println(intVal);

        double doubleVal = intVal; // Неявно инт в дабл
        System.out.println(doubleVal);

        // Явное преобразование - из большего в меньший. Небезопасно. Потеря данных!
        double doubleVal2 = 42.9;
        int int1 = (int) doubleVal2; // Явное преобразование из дабл в инт.

        System.out.println(doubleVal2);
        System.out.println(int1);

        short shortVal = (short) int1;
        System.out.println(shortVal);

        double bigDouble = 3_000_000_000_000_000.00; // дабл = гораздо больше чем инт


        // Преобразование в вычислениях

        int x = 20;
        int y = 7;

        double result;

        result = x / y;
        System.out.println("result: " + result);
        // x / y => 2 (int) -> неявное преобразование 2 -> 2.0

        result = x / 7.0;
        System.out.println("double result: " + result);
        // Если есть два разных типа данных, то сначала неявно приводит к одному - бОльшему типу и потом делает расчеты.
        // 20 / 7.0 -> 20.0 / 7.0

        /*
            (float) 20 / 7 -> 20.0f / 7 -> 20.0f / 7.0f -> 2.85f -> авто 2.85d -> result
            1. int x - явно преобразуется во float
            2. int y -> неявно во float
            3. Деление -> 2.85f
            4. 2.85f -> неявно (авто) преобразуется в тип данных double.
         */
        result = (float) x / y;
        System.out.println("float result: " + result);

        result = x / (double) y;
        System.out.println("double result: " + result);

        System.out.println("---------------");

        // Приоритет математических операций:

        /*
        1. ()
        2. *, /, %
        3. +, -
        */

        int varC = 2 + 8 / 2;
        System.out.println("varC: " + varC);

        varC = 2 % 5;
        System.out.println(varC);

        varC = 5 / 2 % 5 * 2;
        System.out.println(varC);


    }
}
