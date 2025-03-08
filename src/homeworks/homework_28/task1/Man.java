package homeworks.homework_28.task1;

public class Man {

    private int runSpeed;
    private int restTime;

    protected String typeRunner = "Человек";

    public Man() {
        this(10, 15);
    }

    public Man(int runSpeed, int restTime) {
        this.runSpeed = runSpeed;
        this.restTime = restTime;
    }

    public void run() {
        System.out.printf("%s бежит со скоростью %d км/ч.\n", typeRunner, runSpeed);
        rest();
    }

    protected void rest() {
        System.out.printf("%sу нужно %d минут отдыха.\n", typeRunner, restTime);
    }

    @Override
    public String toString() {
        return "Man{" +
                "runSpeed=" + runSpeed +
                ", restTime=" + restTime +
                '}';
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }

    public int getRestTime() {
        return restTime;
    }

    public void setRestTime(int restTime) {
        this.restTime = restTime;
    }
}
