package homeworks.homework_14;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int userNum = scanner.nextInt();

        boolean condition1 = userNum % 2 == 0;
        boolean condition2 = userNum % 3 == 0;
        boolean condition3 = condition1 && condition2;

        System.out.println("Число: " + userNum + " четное: " + condition1 + "; кратно 3: " + condition2 + "; четное и кратное 3: " + condition3);
        
    }
}
