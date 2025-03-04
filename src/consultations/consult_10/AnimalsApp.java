package consultations.consult_10;

public class AnimalsApp {
    public static void main(String[] args) {

        Dog dog = new Dog("Бобик");
        dog.eat();

        Cat cat = new Cat("kot");

        cat.setName("Мурка");
        System.out.println(cat.toString());
        cat.eat();

    }
}
