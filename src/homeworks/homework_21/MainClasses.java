package homeworks.homework_21;

public class MainClasses {
    public static void main(String[] args) {

        Room room = new Room("спальня", "белый", 5, 4);
        room.infoRoom();
        room.area();
        System.out.println("================");


        Developer developer = new Developer("Kostia", "Java", 26, 0);
        developer.info();
        developer.howLongInIT = 1;
        developer.info();
        developer.howLongInIT = 6;
        developer.info();
        System.out.println("=================");


        Friend friend = new Friend("Vasya");
        friend.friend();

    }
}
