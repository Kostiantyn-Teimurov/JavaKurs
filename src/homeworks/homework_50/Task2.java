package homeworks.homework_50;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Task2 {

    public static void main(String[] args) {

        // 1.
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getYear() + ", " + localDate.getMonthValue() + ", " + localDate.getDayOfMonth());

        // 2.
        LocalDate myBirthDay = LocalDate.of(1998, 6, 19);
        System.out.println(myBirthDay);

        // 3.
        LocalDate localDate1 = LocalDate.of(2500, 5, 1);
        LocalDate localDate2 = LocalDate.of(2026, 1, 1);

        boolean comparison;
        comparison = localDate1.equals(localDate2);
        System.out.println(comparison);
        System.out.println(localDate1.isBefore(localDate2));
        System.out.println(localDate1.isAfter(localDate2));
        System.out.println(localDate1.until(localDate2, ChronoUnit.DAYS));
        System.out.println(ChronoUnit.YEARS.between(localDate1, localDate2));

        // 4.
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTime.plusHours(3));

        // 5.
        localDate1 = localDate.plusWeeks(1);
        System.out.println(localDate1);
        System.out.println(LocalDate.now().minus(1, ChronoUnit.YEARS));
        System.out.println(LocalDate.now().plusYears(1));
        LocalDate tomorrow = localDate.plusDays(1);
        LocalDate yesterday = localDate.minusDays(1);
        System.out.println(tomorrow.isBefore(localDate));
        System.out.println(tomorrow.isAfter(localDate));
        System.out.println(yesterday.isBefore(localDate));
        System.out.println(yesterday.isAfter(localDate));

    }

}
