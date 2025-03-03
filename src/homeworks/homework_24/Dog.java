package homeworks.homework_24;

public class Dog {

    private int maxHeight;

    private String name;
    private int jumpHeight;

    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxHeight = jumpHeight;
    }

    private void jump() {
        System.out.println("Собака " + name + " прыгнула!");
    }

    private void train() {
        if (maxHeight + 10 < jumpHeight * 2) {
            maxHeight += 10;
            System.out.println("Собака потренировалась");
        } else {
            maxHeight = jumpHeight * 2;
        }
    }

    public void jumpBarrier(int barrier) {
        if (maxHeight > barrier) {
            jump();
            return;
        }
        if (jumpHeight * 2 > barrier) {
            while (maxHeight < barrier) {
                train();
            }
            jump();
            return;
        }
        System.out.println("Собака не может взять барьер");
    }

}
