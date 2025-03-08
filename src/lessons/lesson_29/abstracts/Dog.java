package lessons.lesson_29.abstracts;


// Если потомок реализовал не все абстрактные методы родителя, то такой класс должен быть помечен как абстрактный

public abstract class Dog extends Animal{

    @Override
    void move() {
        System.out.println("Doge move");
    }
}
