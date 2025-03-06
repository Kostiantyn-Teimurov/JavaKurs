package lessons.lesson_28.animals;

public class Cat extends Animal {

    public void eat() {
        System.out.println("Cat eat");
    }

    // Переопределение родительского метода voice()

    // Аннотация. Говорю, что хочу переопределить родительский метод. Проверка, что он действительно есть
    @Override
    public void voice() {
        System.out.println("Cat say MEOW!");
    }

}
