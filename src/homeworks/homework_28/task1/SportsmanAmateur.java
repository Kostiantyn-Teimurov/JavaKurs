package homeworks.homework_28.task1;

public class SportsmanAmateur extends Man {
    @Override
    public void run() {
        int speed = 15;
        relax();
    }

    @Override
    protected void relax() {
        System.out.println("Нужно отдохнуть 10 минут!");
    }
}
