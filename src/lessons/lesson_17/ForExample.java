package lessons.lesson_17;

import java.util.Random;

public class ForExample {
    public static void main(String[] args) {

        // for (<Блок инициализации> ; <Блок проверок / условие выхода> ; <Блок изменений>) {
        // тело цикла

        for (int i = 0; i < 10; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();

        int i1 = 5;
        for (i1 = 0; i1 >= 0; i1 += 1_000_000) {
            System.out.print(i1 + ", ");
        }
        System.out.println();

        for (String str = "Hello"; str.length() < 10; str += "5") {
            System.out.println(str);
        }
        System.out.println("\n====================");

        // Мы можем инициализировать и изменять любое кол_во переменных в блоках

        int k = 14;
        for (int a = 0, f = 1; k >= 0 && f < 10; k--, a = ++a + k, f++) {
            System.out.println(k + " : " + a + " : " + f);
        }

        int a = 15, b = 20, d;


        Random random = new Random();
        // int length - random.nexInt(11) + 5; //

        int[] ints = new int[random.nextInt(11) + 5];

        System.out.print("[");
        // [0..len-2] -> ", " ; len - 1 -> "]\n
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(101) - 50; // [-50//50]
            System.out.print(ints[i] + (i < ints.length - 1 ? ", " : "]\n")); // if i < ints.length => ", "
        }                                                                     // else => "]\n"

        System.out.println("]");

        int min = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < min) {
                min = ints[i];
            }
        }
        System.out.println(min);


        for (int i = 0; i < 7; i++) {
            if (i == 3) continue;        // Прервать текущую итерацию цикла и перейти в блок изменений
            System.out.print(i + ", ");
        }
        System.out.println();

        for (int i = 0; i < 7; i++) {
            if (i == 3) {
                break;                  // Прервать весь цикл
            }
            System.out.print(i + ", ");
        }

    }
}
