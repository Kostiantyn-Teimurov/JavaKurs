package consultations.consult_10;

public class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

//    public Animal() {
//    }

    void eat() {
        System.out.println(name + " Покушал");
    }

    public String toString() {
        return "Animal " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
