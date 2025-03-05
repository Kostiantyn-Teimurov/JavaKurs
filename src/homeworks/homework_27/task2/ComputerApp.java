package homeworks.homework_27.task2;

public class ComputerApp {
    public static void main(String[] args) {
        Storage storage = new Storage("Apple", "rn-234", 8);
        Computer computer = new Computer(storage);

        System.out.println(computer.toString());


    }
}
