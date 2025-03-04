package homeworks.homework_26.task2;

public class Daughter extends Parents {
    private String name;
    private String temper;
    private int countFriends;


    public Daughter(String name, String lastName, String nation, String temper) {
        super(lastName, nation);
        this.name = name;
        this.temper = temper;
    }

    public void shopping() {
        if (money > 300) {
            money -= 300;
            System.out.println(name + " пошопилась. У семьи осталось " + money + " y.e.");
            return;
        }
        cry();
    }

    private void cry() {
        credit += 500;
        money += 500;
        System.out.println(name + " плачет, нужно что-то сделать! Кредит: " + credit);
        shopping();
    }

    public void addFriend() {
        countFriends++;
    }

    public int getCountFriends() {
        return countFriends;
    }

}
