package lessons.lesson_15;

public class Block {
    public static void main(String[] args) {

        // Scope - области видимости переменной - часть программы, в которой переменная доступна для использования
        // Область видимости определяется фигурными скобками

        int x = 10;

        // Анонимный блок
        {
            int y = 5;
            x = x + y;
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }

//        x = x + y; Переменная y не видна. Недоступна вне своей области видимости (блока кода)

        // y - две разных переменных
        int y = 124;


    }
}
