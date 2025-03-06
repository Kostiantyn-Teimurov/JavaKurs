package lessons.lesson_21;

public class Dog {

    String name;
    int weight;

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void info() {
        System.out.println("I am dog " + name + ", my weight: " + weight);
    }

    public void eat() {
        System.out.println("Я кушаю, ням-ням!");
        this.weight++;
    }

    public void run() {

        while (weight < 3) {
            System.out.println("Я слишком голодная и худая!");
            System.out.println("Мой вес: " + weight + "!");

            eat();
        }

        System.out.println("Я бегаю!");
        weight -= 2;
        System.out.println("Вес после пробежки: " + weight);
        System.out.println("==============");

    }


}
