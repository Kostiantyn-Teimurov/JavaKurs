package lesson_26.transport;

public class Vehicle {

    protected String model; // Здесь наследники имеют прямой доступ к полю
    private int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

//    public Vehicle() {
//    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return model + ", year of manufacture : " + year;
    }

    public void start() {
        System.out.println(model + " начинает движение");
    }

    public void stop() {
        System.out.println(model + " останавливается");
    }

}
