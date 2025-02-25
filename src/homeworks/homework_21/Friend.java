package homeworks.homework_21;

public class Friend {

    String name;
    boolean isFriend;

    public Friend(String name) {
        this.name = name;
    }

    public void friend() {
        if (name == "Vasya" || name == "Petya") {
            isFriend = true;
        }
        System.out.println(name + " is my Friend: " + isFriend);
    }

}
