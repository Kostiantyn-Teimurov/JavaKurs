package homeworks.homework_24;

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
            System.out.println("Собака потренировалась");
        } else {
            jumpHeight = maxHeight;
        }
    }

    public void jumpBarrier(int barrier) {
        if (jumpHeight > barrier) {
            jump();
            return;
        }
        if (maxHeight > barrier) {
            while (jumpHeight < barrier) {
                train();
            }
            jump();
            return;
        }
        System.out.println("Собака не может взять барьер");
    }

}
