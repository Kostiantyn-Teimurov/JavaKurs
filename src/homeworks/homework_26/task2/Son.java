package homeworks.homework_26.task2;

public class Son extends Family {

    private String name;
    private String temper;
    private int countFriends;

    public Son(String name, String lastName, String nation, String temper) {
        super(lastName, nation);
        this.name = name;
        this.temper = temper;
    }

    public String infoSon() {
        return String.join(" ", name, lastName, nation, temper);
    }

    public void work() {
        System.out.println(name + " поработал.");
        addMoney();
    }

    public void addFriend() {
        countFriends++;
    }

    public int getCountFriends() {
        return countFriends;
    }

}
