package homeworks.homework_28.task1;

public class SportsmanPro extends SportsmanAmateur {

    {
        typeRunner = "Профи";
    }

    public SportsmanPro() {
        super(25, 5);
    }

    public SportsmanPro(int runSpeed, int restTime) {
        super(runSpeed, restTime);
    }
}
