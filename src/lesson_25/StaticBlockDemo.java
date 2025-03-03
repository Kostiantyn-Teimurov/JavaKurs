package lesson_25;

public class StaticBlockDemo {
    static int counter = 5;
    static String[] colors = new String[counter];

    private String title;
    private int capacity = 10; // Инициализация значения

    // Статический блок инициализации
    // Здесь могут быть проинициализированы статистические поля класса

    static {
        System.out.println("Static Block RUN");
        colors[0] = "red";
        colors[1] = "green";
        colors[2] = "yellow";
    }

    // Не статические блоки инициализации.
    // Выполняются при каждом создании объекта.
    // Вызывается до конструктора

    {
        System.out.println("Non-static block RUN");
        if (counter == 0) {
            this.capacity = 50;
        }
    }


    public StaticBlockDemo() {
        System.out.println("Constructor RUN");
//        if (counter == 0) {
//            this.capacity = 50;
//        }

//        colors[0] = "red";
//        colors[1] = "green";
//        colors[2] = "yellow";

    }

    public StaticBlockDemo(String title) {
        System.out.println("Constructor 2 RUN");
//        if (counter == 0) {
//            this.capacity = 50;
//        }
        this.title = title;
    }

    public String toString() {
        return String.format("Title: %s, capasity: %d, static-counter: %d", title, capacity, counter);

    }


}
