package homeworks.homework_26.task1;

public class Circle extends Shape {

    private double radius;


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        if (radius < 0) {
            System.out.println("Error");
            return;
        }
        System.out.println(Math.PI * (radius * radius));
    }
}
