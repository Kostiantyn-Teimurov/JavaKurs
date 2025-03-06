package lessons.lesson_23;

public class CatApp {
    public static void main(String[] args) {

        Cat cat = new Cat("Catty", 8, 5);

        cat.sayMeow();

        System.out.println(cat.toString());

        // Не доступны, так как помечены как private
//        System.out.println(cat.age);
//        cat.age = -1000;

//        cat.weight = 1500;
//        System.out.println(cat.toString());
//
//        cat.name = null;
//        System.out.println(cat.toString());

        //cat.testMethod(); Метод недоступен, помечен private

        Cat cat2 = new Cat(null, 150, -20);

        System.out.println(cat2.toString());

        System.out.println("================");

        int catAge = cat.getAge();
        System.out.println("В следующем году коту будет: " + (catAge + 1));
        System.out.println("Вес: " + cat.getWeight());
        System.out.println("Имя кота: " + cat.getName());


        cat.setAge(15);
        cat.setAge(-15);
        System.out.println(cat.toString());
        cat.setWeight(15);
        System.out.println(cat.toString());
        cat.setWeight(-15);
        System.out.println(cat.toString());


        System.out.println("=================");
        cat.isProtected = true;
        System.out.println("isProtected: " + cat.isProtected);

        cat.isDefault = false;
        System.out.println("isDefault: " + cat.isDefault);

    }


}
