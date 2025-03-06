package lessons.lesson_28.animals;

public class Animal {

    public void voice() {
        System.out.println("Animal say something");
    }


    // Переопределил метод родителя Object
    @Override
    public String toString() {
        return "Animal toString";
    }

}
