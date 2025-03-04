package homeworks.homework_26.task1;

public class Shape {
    protected String name;
    protected String color;

    public Shape() {
    }

    public void displayInfo() {
        System.out.println(name + " " + color);
    }

    public void setColor(String color) {
        this.color = color;
    }
}
