package homeworks.homework_28.task1;

public class SportsmanPro extends SportsmanAmateur {

    @Override
    public void run() {
        int speed = 25;
        relax();
    }

    @Override
    protected void relax() {
        System.out.println("Нужно отдохнуть 5 минут!");
    }

}
