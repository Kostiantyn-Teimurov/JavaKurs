package homeworks.homework_25;

public class ImmutablePoint {

    private final int x;
    private final int y;

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
//        this.x = x;
    }

    public void setY(int y) {
//        this.y = y;
    }

    // значения переменных final нельзя изменить

}
