package homeworks.homework_26.task2;

public class FamilyApp {
    public static void main(String[] args) {

        Son son = new Son("Max", "Schevchenko", "ukr", "kind");
        System.out.println(son.toString());
        System.out.println(son.infoSon());
        son.spendMoney();
        son.work();

        //TODO Как не указывать каждый раз фамилию?
        Daughter daughter = new Daughter("Lisa", "Schevchenko", "ukr", "smart");
        System.out.println(daughter.toString());

        daughter.shopping();
        daughter.shopping();
        daughter.shopping();
        daughter.shopping();
        daughter.shopping();
        daughter.shopping();
        daughter.shopping();

        System.out.println(daughter.toString());

    }
}
