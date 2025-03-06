package lessons.lesson_28.animals;

public class ZooApp {
    public static void main(String[] args) {


        Cat cat = new Cat();

        cat.voice(); // унаследован от Animal
        System.out.println(cat.toString());

        cat.eat(); // метод Cat

        Dog dog = new Dog();

        dog.voice(); // Если в потомке не переопределен метод, то будет вызвана реализация метода родителя
        System.out.println(dog.toString());

        System.out.println("=====================");

        Object object = new Object();


    }
}
