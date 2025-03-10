package homeworks.homework_30.task1;

public class Triathlete implements Swimmer, Runner {

    @Override
    public void run() {
        System.out.println(getClass().getSimpleName() + " running");
    }

    @Override
    public void swim() {
        System.out.println(getClass().getSimpleName() + " swimming");
    }
}
