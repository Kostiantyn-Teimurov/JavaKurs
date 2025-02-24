package homeworks.homework_15;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        Random random = new Random();

        int bal = random.nextInt(12) + 1;
        int tvTime = 60;
        int todayTime = 45;
        int nextDayTime = 0;

        switch (bal) {
            case 12:
            case 11:
            case 10:
                System.out.println("Ya rad");
                todayTime += 60;
                break;
            case 9:
            case 8:
            case 7:
                System.out.println("Nice");
                todayTime += 45;
                break;
            case 6:
            case 5:
            case 4:
                System.out.println("Norm");
                todayTime += 15;
                break;
            case 3:
                System.out.println("Ja ogorchen..");
                todayTime -= 30;
                break;
            case 2:
            case 1:
                System.out.println("Uzhas");
                todayTime = 0;
        }

        if (todayTime > tvTime) {
            nextDayTime = todayTime - tvTime;
            todayTime = 60;
        }

        System.out.println("Оценка: " + bal);
        System.out.println("Просмотр ТВ сегодня: " + todayTime + ". Накоплено минут на завтра: " + nextDayTime);

    }
}
