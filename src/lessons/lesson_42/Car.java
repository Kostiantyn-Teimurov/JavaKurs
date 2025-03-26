package lessons.lesson_42;

public class Car implements Comparable<Car> {

    private String model;
    private int year;
    private int masSpeed;

    public Car(String model, int year, int masSpeed) {
        this.model = model;
        this.year = year;
        this.masSpeed = masSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", maxSpeed=" + masSpeed +
                '}';
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMaxSpeed() {
        return masSpeed;
    }

    public void setMasSpeed(int masSpeed) {
        this.masSpeed = masSpeed;
    }

    // Сравнивает текущий объект (this) с другим объектом этого класса (Car)
    @Override
    public int compareTo(Car car) {
        return this.year - car.year;
    }

    /*
    this < car -> отрицательное значение
    this > car -> положительное значение
    this == car -> 0

    this - car =
     */
}
