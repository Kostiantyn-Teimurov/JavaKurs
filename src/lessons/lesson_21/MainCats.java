package lessons.lesson_21;

public class MainCats {
    public static void main(String[] args) {

        Cat cat = new Cat(); // Создание объекта класса кот
        // 1. Физически создается объект типа Cat в памяти
        // 2. Вызывается конструктор класса

        // При создании объектов класса все его поля инициализируются какими-то значениями
        // По умолчанию: 0/0.0 | false | null

        cat.sayMeow();
        cat.run();
        cat.sleep();

        String catName = cat.name;
        System.out.println("Имя: " + catName);

        System.out.println("Возраст: " + cat.age);

        Cat cat1 = new Cat("Max");
        // Будет создан новый объект класса Cat
        // Имя (строка) которая была передана в конструктор будет присвоено свойству name объекта класса

        System.out.println("cat1.name: " + cat1.name);
        System.out.println("cat1.color: " + cat.color);


        cat.whoAmI();
        cat1.whoAmI();


        System.out.println("==================");
        Cat cat2 = new Cat("Diamond", "red");
//        System.out.println("cat2.name: " + cat2.name);

        cat2.whoAmI();

        Cat barsik = new Cat("Barsik", "white", 2);
        System.out.println("barsik.name: " + barsik.name);
        System.out.println("barsik.color: " + barsik.color);
        System.out.println("barsik.age: " + barsik.age);

        barsik.whoAmI();


        Cat catClone = barsik;
        catClone.whoAmI();
        barsik.age = 100;
        System.out.println("barsik.age = 100");
        barsik.whoAmI();
        catClone.whoAmI();
        catClone.age = 50;
        catClone.whoAmI();
        barsik.whoAmI();

        System.out.println("=====================");

        catClone = new Cat("Kratos", "black", 66);
        catClone.whoAmI();
        barsik.whoAmI();

        catClone = null; // Ничто. Ссылка не ссылается ни на какой объект
        // Если попытаться вызвать метод или получить свойство, то будет ошибка - NullPointerException

        if (catClone != null) {
            catClone.whoAmI();
        } else {
            System.out.println("В переменной хранится null!");
        }

        System.out.println("=========================");


    }
}
