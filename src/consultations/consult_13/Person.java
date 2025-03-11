package consultations.consult_13;

public class Person {
    private String name;


    public Person(String name) {
        this.name = name;
    }

    private void sayHello() {
        System.out.println("HI my name is: " + name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
