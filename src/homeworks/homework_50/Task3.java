package homeworks.homework_50;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    public static void main(String[] args) {

        List<LocalDate> localDateList = new ArrayList<>();

        localDateList.add(LocalDate.now());
        localDateList.add(LocalDate.of(1950, 12, 23));
        localDateList.add(LocalDate.of(1950, 10, 23));
        localDateList.add(LocalDate.of(1950, 10, 20));
        localDateList.add(LocalDate.of(2023, 5, 17));
        localDateList.add(LocalDate.of(2000, 3, 4));
        localDateList.add(LocalDate.of(2050, 7, 30));
        localDateList.add(LocalDate.of(2012, 10, 25));

        // 1. Variant
        try {
            System.out.println(getDifferenceInDays(localDateList));
        } catch (RuntimeException e) {
            System.out.println("Добавьте элементы в список");
        }

        // 2. Variant
//        System.out.println(getDifferenceInDays(localDateList));

    }

    // TODO как лучше?
    public static long getDifferenceInDays(List<LocalDate> list) throws RuntimeException {
        // 1. Variant
        if (list.size() < 2) throw new RuntimeException();

        // 2. Variant
//        if (list.size() < 2) return 0;

        List<LocalDate> list1 = new ArrayList<>(list);
        list1.sort(Comparator.naturalOrder());
        System.out.println(list1);

        LocalDate dateMin = list1.get(0);
        LocalDate dateMax = list1.get(list1.size() - 1);

        return dateMin.until(dateMax, ChronoUnit.DAYS);
    }

}
