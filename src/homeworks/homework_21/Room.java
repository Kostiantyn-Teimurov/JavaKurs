package homeworks.homework_21;

public class Room {

    String type;
    String color;
    int length;
    int width;

    public Room(String type, String color, int length, int width) {
        this.type = type;
        this.color = color;
        this.length = length;
        this.width = width;
    }

    public void infoRoom() {
        System.out.printf("Тип комнаты: %s, цвет: %s, длина: %d, ширина: %d\n", type, color, length, width);
    }

    public void area() {
        System.out.println(length * width);
    }


}
