package lessons.lesson_28.animals;

public class Hamster extends Animal {

    // Ничего не переопределяем = получаем реализацию всех методов по наследству


    // Переопределил метод родителя Animal
    @Override
    public String toString() {
        return "Hamster!";
    }


}