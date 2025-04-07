package lessons.lesson_50;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class JavaTimeApi {

    // Java Time Api // java.time

    /*
    util.Date
    util.Calendar
    text.SimpleDateFormat

    Joda-Time
     */


    public static void main(String[] args) {

        // LocalDate - представляет дату (год, месяц, день) без времени.

        LocalDate date = LocalDate.now(); // возвращает текущую дату
        System.out.println("date: " + date);

        // Прибавить 1 день к дате
        LocalDate tomorrow = date.plusDays(1);
        System.out.println("tomorrow: " + tomorrow);
        System.out.println("plusWeeks: " + date.plusWeeks(4)); // + 4 недели к дате
        System.out.println("date.minusMonths(2): " + date.minusMonths(2));

        LocalDate date1 = LocalDate.of(2002, 2, 15); // Установить дату (год, месяц, число)
        System.out.println("date1: " + date1);

        // Можно использовать Enum с названием месяца
        date1 = LocalDate.of(2002, Month.FEBRUARY, 15);
        System.out.println("date1: " + date1);

        System.out.println("год: " + date.getYear() + "; месяц: " + date.getMonth() + "; месяц-цифра: " + date.getMonthValue());
        System.out.println("число: " + date.getDayOfMonth() + "; день недели: " + date.getDayOfWeek() + "; день года: " + date.getDayOfYear());

        System.out.println("сколько дней в месяце: " + date.lengthOfMonth() + "; дней в году: " + date.lengthOfYear() +
                "; был ли год високосным: " + date.isLeapYear());


        // Преобразование строки в объект даты
        String dateString = "2000-10-25";
        LocalDate date2 = LocalDate.parse(dateString);
        System.out.println("date2: " + date2);

        System.out.println("\n=========== Local Time =================");
        // LocalTime - представляет время (часы, минуты, секунды, наносекунды)
        LocalTime time = LocalTime.now(); // возвращает текущее время
        System.out.println("time: " + time);

        LocalTime time1 = LocalTime.of(21, 33);  // часы + минуты
        time1 = LocalTime.of(21, 33, 44);
        time1 = LocalTime.of(21, 33, 44, 54875);

        System.out.println("time1: " + time1);

        LocalTime time2 = time.plusHours(1); // добавляет 1 час к объекту времени
        System.out.println("now.plusHours(1): " + time2);
        System.out.println("time.plusMinutes(65): " + time.plusMinutes(65));
        System.out.println("time.minusSeconds(30): " + time.minusSeconds(30));

        System.out.println(time.getHour() + " | " + time.getMinute() + " | " + time.getSecond() + " |" + time.getNano());

        String timeString = "12:13:45";
        LocalTime parseTime = LocalTime.parse(timeString);
        System.out.println(parseTime);


        System.out.println("\n ====================== LocalDateTime =================");
        // LocalDateTime - представляет дату и время

        LocalDateTime now = LocalDateTime.now(); // Текущая дата-время
        System.out.println("now: " + now);

        LocalDate localDate = LocalDate.of(2011, Month.AUGUST, 15);
        LocalTime localTime = LocalTime.of(15, 22, 59);
        LocalDateTime dateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("dateTime: " + dateTime);

        dateTime = LocalDateTime.of(2025, 12, 31, 23, 59);
        System.out.println(dateTime.getDayOfWeek());
        System.out.println(dateTime.getDayOfWeek().getValue());
        System.out.println("dateTime.plusHours(1): " + dateTime.plusHours(1));
        System.out.println("dateTime.minusYears(1): " + dateTime.minusYears(1));

        System.out.println("\n ==================== ZonedDateTime ==============");
        // ZonedDateTime - представляет дату и время с часовым поясом

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime + " | " + zonedDateTime.getZone());


        System.out.println("\n ============== isAfter, isBefore, until, equals ==============");
        LocalDate date3 = LocalDate.of(2020, 10, 16);
        LocalDate date4 = LocalDate.of(2020, 6, 25);

        // boolean isAfter - проверяет, что текущий объект после (позже) указанного объекта
        boolean isAfter = date3.isAfter(date4);
        System.out.println("date3.isAfter(date4): " + isAfter);
        System.out.println("date3.isBefore(date4): " + date3.isBefore(date4));
        System.out.println("date3.equals(date4): " + date3.equals(date4));

        // long until - метод измеряет время между текущим и указанным объектом даты/времени

        long between = date3.until(date4, ChronoUnit.CENTURIES);
        System.out.println("between: " + between);

        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = dateTime1.minusDays(15);
        System.out.println("until seconds: " + dateTime2.until(dateTime1, ChronoUnit.SECONDS));
        System.out.println("until minutes: " + dateTime2.until(dateTime1, ChronoUnit.MINUTES));

        LocalDateTime dateTime3 = dateTime1.plus(10, ChronoUnit.DAYS);
        System.out.println("dateTime1.plus(10, ChronoUnit.DAYS): " + dateTime3);
        dateTime3 = dateTime1.minus(10, ChronoUnit.MINUTES);
        System.out.println("dateTime1.minus(10, ChronoUnit.MINUTES): " + dateTime3);

        // метод ChronoUnit - .between() -> long
        long hoursBetween = ChronoUnit.HOURS.between(dateTime1, dateTime2);
        System.out.println("hoursBetween: " + hoursBetween);


        System.out.println("\n ========== Instant, Duration, Period ==============");

        // Instant - представляет собой точку на временной шкале в Григорианском календаре с точностью до наносекунд
        // Unix epoch / Epoch time - Эпоха юникс. Началась с 1 января 1970 года.
        // Момент времени, он основан на количестве секунд и наносекунд, прошедших с 1 января 1970 года.
        Instant nowInstant = Instant.now();

        long millis = nowInstant.toEpochMilli(); // получаем кол-во миллисекунд с 1970-01-01
        System.out.println("nowInstant.toEpochMilli(): " + millis);

        Instant instant = Instant.ofEpochMilli(millis); // получить из миллисекунд объект инстанта
        System.out.println(instant);


        // Duration, Period - представляют собой отрезки времени (временные интервалы), но используются для разных типов временных единиц
        // Duration - хранит продолжительность в секундах и наносекундах
        // Period - разница (продолжительность) в днях, месяцах, годах


        System.out.println("\n =================== DateTimeFormatter =================== ");

        // DateTimeFormatter - форматирование даты и времени
        LocalDateTime nowLDT = LocalDateTime.now();
        System.out.println("nowLDT: " + nowLDT);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedString = nowLDT.format(formatter);
        System.out.println("formattedString: " + formattedString);


        /*
        y - год
        M - месяц
        d - день
        H - час в формате от 0 до 23
        h - час в формате от 0 до 12
        m - минута
        s - секунда

        Количество повторений символа определяет формат отображения значения
        yyyy - 4-x значный год
        yy - двухзначный год, 23 для 2023
        M - месяц в сыром формате -> 2, 12
        MM - месяц в двузначном формате -> 02, 12
        d - сырой номер дня -> 3, 29
        dd - день в двузначном формате ->
        a - в конце, показывает pm / am

         */

        // Есть строка с датой - создать объект LDT соответствующий этой дате
        String dateForParse = "23-10-26 19:15";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm");
        LocalDateTime parseDate = LocalDateTime.parse(dateForParse, formatter1);
        System.out.println("parseDate: " + parseDate);


        System.out.println("=========== Task1 ===============");

        // 15-12-2022 20-46

        String dateForParse2 = "15-12-2022 20-46";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
        LocalDateTime parseDate2 = LocalDateTime.parse(dateForParse2, formatter2);
        System.out.println(parseDate2);
        System.out.println(parseDate2.getDayOfWeek() + " | " + parseDate2.getMonth() + " | " + parseDate2.getHour());

        String dateForParse3 = "13-01-2023 00-47";
        LocalDateTime parseDate3 = LocalDateTime.parse(dateForParse3, formatter2);
        System.out.println(parseDate3);
        System.out.println(parseDate3.getDayOfWeek());
        long between1 = parseDate3.until(parseDate2, ChronoUnit.DAYS);
        System.out.println(between1);

    }


}
