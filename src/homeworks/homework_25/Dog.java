package homeworks.homework_25;

public class Dog {

    private int maxHeight;

    private String name;
    private int jumpHeight;

    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxHeight = jumpHeight * 2;
    }

    private void jump() {
        System.out.println("Собака " + name + " прыгнула!");
    }

    private void train() {
        if (jumpHeight + 10 < maxHeight) {
            jumpHeight += 10;
//            System.out.println("Собака потренировалась");
        } else {
            jumpHeight = maxHeight;
//            System.out.println("Собака потренировалась, дальше не будет толку");
        }
    }

    public boolean jumpBarrier(int barrier) {
        if (jumpHeight > barrier) {
            jump();
            return true;
        }
        if (maxHeight > barrier) {
            while (jumpHeight < barrier) {
                train();
            }
            jump();
            return true;
        }
        System.out.println("Собака " + name + " не может взять барьер");
        return false;
    }

    public String toString() {
        return String.format("Dog: %s. JumpHeight: %d", name, jumpHeight);
    }

}
