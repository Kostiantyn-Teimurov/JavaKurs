package lessons.lesson_49.validator;

public class PersonApp {

    public static void main(String[] args) {

        Person33 person = new Person33("john@gmail.com", "Pasword245");

        System.out.println(person);

        System.out.println("=================");

        Person33 person1 = new Person33("john.gmail.com", "qwertydKdsg6)");
        System.out.println(person1);

    }

}
