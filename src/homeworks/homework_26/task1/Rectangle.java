package homeworks.homework_26.task1;

public class Rectangle extends Shape {

    private double width;
    private double height;


    public void setDimensions(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void calculateArea() {
        System.out.println(width * height);
    }
}
