package homeworks.homework_26.task2;

public class Parents {

    private String nameDad;
    private String nameMom;

    protected String lastName;
    protected String nation;
    protected static int money = 1000;
    protected static int credit;

    public Parents(String nameDad, String nameMom, String lastName, String nation) {
        this.nameDad = nameDad;
        this.nameMom = nameMom;
        this.lastName = lastName;
        this.nation = nation;
    }

    public Parents(String lastName, String nation) {
        this.lastName = lastName;
        this.nation = nation;
    }

    public void spendMoney() {
        if (money > 10) {
            money -= 10;
            System.out.println("У семьи осталось " + money + " y.e.");
            return;
        }
        System.out.println("Нет денег! У семьи ничего не осталось");
    }

    protected void addMoney() {
        money += 100;
        System.out.println("Бюджет пополнили. Баланс семьи: " + money);
    }

    public String toString() {
        return String.format("Семья: %s, нация: %s, деньги: %d, кредит: %d", lastName, nation, money, credit);
    }

    public String getNation() {
        return nation;
    }

    public int getMoney() {
        return money;
    }
}
