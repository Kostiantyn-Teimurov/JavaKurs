package lessons.lesson_24;

/*
Статические члены класса имеют доступ (видят) ТОЛЬКО статический контент
 */

public class StaticExample {

    // non-static поле класса
    int x;

    // static поле класса
    static int staticY;

    // Статический метод
    public static void staticMethod() {
        // Статические методы видят ТОЛЬКО статические члены (поля и методы) класса
        // x++ - Нет доступа к не-статическому полю
        staticY++; // доступ к статическому полю есть

        // Можем вызывать только статические методы
        // nonStatic()

        // Ключевое слово this не доступно
        // this.x - не доступно
        System.out.println("Вызван статический метод");
    }


    // НЕ-статический метод
    public void nonStaticMethod() {
        // У нестатического метода есть доступ ко ВСЕМ членам класса
        x++;
        staticY++;
        // Можем вызывать любые методы
        staticMethod();
    }


    // Метод main статический
    public static void main(String[] args) {

        // x = 10 -- Ошибка компиляции. У статик метода нет доступа к НЕ-статик переменной
        staticY = 10;
        System.out.println(staticY);

        // nonStaticMethod(); - не могу вызвать не-статик без создания объекта
        StaticExample staticExample = new StaticExample();
        staticExample.nonStaticMethod();
        // я могу вызвать не-статик метод только используя ссылку на объект

        System.out.println(StaticExample.staticY);

        // Я могу вызвать статический метод БЕЗ создания класса

        StaticExample.staticMethod();

        int sum = MathUtil.sumIntegers(1, 2, 3, 4, 5, 6);
        System.out.println("Сумма чисел: " + sum);

    }
}
