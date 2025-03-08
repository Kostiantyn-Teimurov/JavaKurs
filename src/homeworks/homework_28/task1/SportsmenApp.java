package homeworks.homework_28.task1;

public class SportsmenApp {
    public static void main(String[] args) {

        Man man = new Man();

        SportsmanAmateur sportsmanAmateur = new SportsmanAmateur();

        man.run();

        sportsmanAmateur.run();

        SportsmanPro sportsmanPro = new SportsmanPro();

        Man[] humans = new Man[3];
        humans[0] = man;
        humans[1] = sportsmanAmateur;
        humans[2] = sportsmanPro;

        System.out.println("==============");
        for (int i = 0; i < humans.length; i++) {
            humans[i].run();
        }

    }
}
