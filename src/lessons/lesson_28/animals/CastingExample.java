package lessons.lesson_28.animals;

/*
Объекты могут принадлежать к классу х и при этом могут быть приведены к другому типу, если между классами есть связь наследования
Это называется кастингом (casting).

Кастинг бывает двух видов:
1. Восходящее преобразование (upcasting) - преобразование объекта дочернего класса в тип родительского класса.
2. Нисходящее преобразование (downcasting) - преобразование объекта родительского класса обратно в тип дочернего класса


 */

public class CastingExample {
    public static void main(String[] args) {

        // Восходящие и нисходящие преобразования

        // Восходящее образование происходит автоматически

        Animal animal = getAnimal();

        Animal animal1 = new Hamster(); // неявное автоматическое преобразование Hamster к типу Animal

        // Сейчас объект Hamster
        // у хомяка нет этого методу, поэтому вызывается реализация с Animal
        animal1.voice();


        Animal[] animals = new Animal[3];
        animals[0] = animal;
        animals[1] = animal1;
        animals[2] = new Dog();

        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
        }

        Object obj = new Cat();

        // TODO Нисходящее преобразование

        test(new Cat());

        int intx = 10;
        double doubleX = intx; // неявное
        System.out.println(doubleX);

        intx = (int) doubleX; // явное

        Animal animalD = new Dog(); // Upcasting
        Dog dog = (Dog) animalD; // Downcasting - Явное нисходящее преобразование

        dog.bark();

        Animal animalCat = new Cat();

        // Ошибка ClassCastException. Попытались привести объект к неверному типу
//        Dog dog1 = (Dog) animalCat;
//        dog1.bark();


        System.out.println("=============");
        for (int i = 0; i < animals.length; i++) {
            Animal currentAnimal = animals[i];
            currentAnimal.voice();

            //  Можно проверить тип объекта для избежания ошибок перед downcasting
            if (currentAnimal instanceof Cat) {
                System.out.println("В ячейке " + i + " is a Cat type");
                Cat catLink = (Cat) currentAnimal;
                catLink.eat(); // специфический метод кота
            }

            if (currentAnimal instanceof Dog) {
                Dog dogLink = (Dog) currentAnimal;
                dogLink.bark(); // метод класса Dog
            }

        }


    }

    private static Animal getAnimal() {
        Animal animal = new Cat(); // тип Cat автоматически преобразуется к типу Animal

        /*
        !!! ВАЖНО !!!
        Тип ссылочной переменной определяет:
        1. Ссылки на объекты каких типов могут храниться в этой переменной
        2. Список методов, которые можно вызвать обращаясь к этой переменной
         */

        // Недоступны методы класса Cat. Доступны только Animal Object
        // Ссылочная может хранить объект своего класса или любого ребенка.
        // animal.eat() - недоступно


        // Какая реализация будет вызвана - определяется типом объекта, который привязан по этой ссылке
        // У кота есть такой метод, поэтому реализация будет у класса Cat
        animal.voice();
        return animal;
    }

    public static void test(Animal animal) {
        animal.voice();
    }

}
