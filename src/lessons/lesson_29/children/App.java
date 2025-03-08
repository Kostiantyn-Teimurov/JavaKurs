package lessons.lesson_29.children;

public class App {
    public static void main(String[] args) {

        Parent parent = new Parent("р");

        System.out.println(parent.name);

        Child child = new Child("ывфп", 100);

        System.out.println(child.name);
        System.out.println(child.age);

    }
}
