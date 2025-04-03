package homeworks.homework_48;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Task4 {

    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Petr", 18, "IT", 2, 1),
                new Student("Silvia", 16, "Psychology", 1, 2),
                new Student("Stefan", 17, "Languages", 1, 4),
                new Student("Olivia", 20, "Engineering", 3, 5),
                new Student("Sebastian", 25, "Languages", 2, 1),
                new Student("Olivia", 30, "Aviation", 4, 4),
                new Student("Hanna", 23, "Medicine", 2, 2),
                new Student("Silvia", 22, "Management", 2, 3),
                new Student("John", 40, "Marketing", 5, 1),
                new Student("Hanna", 34, "Engineering", 3, 4),
                new Student("Max", 21, "Medicine", 1, 5),
                new Student("Sebastian", 20, "Medicine", 4, 5),
                new Student("Petr", 18, "IT", 1, 4),
                new Student("Stefan", 19, "Engineering", 2, 2),
                new Student("Silvia", 38, "Medicine", 5, 3),
                new Student("Sebastian", 21, "Aviation", 2, 1),
                new Student("Sebastian", 17, "IT", 1, 4),
                new Student("John", 18, "Management", 1, 2),
                new Student("Max", 27, "Languages", 3, 1),
                new Student("Stefan", 31, "Aviation", 4, 3)
        );


        // 1.
        Map<String, List<Student>> groupedByMajors = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor));

        printMap(groupedByMajors);

        // 2.
        Map<Integer, Set<Student>> groupedByYear = students.stream()
                .collect(Collectors.groupingBy(Student::getYear, Collectors.toSet()));

        printMap(groupedByYear);

        // 3.
        Map<String, Long> countStudents = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor, Collectors.counting()));
        printMap(countStudents);

        // 4.
        Map<String, Double> averageGrade = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor, Collectors.averagingDouble(Student::getGrade)));
        printMap(averageGrade);

        // 5.
        Map<String, List<Double>> gradesByMajors = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor,
//                        Collectors.mapping(student -> student.getGrade(), Collectors.toList())));
                        Collectors.mapping(Student::getGrade, Collectors.toList())));
        printMap(gradesByMajors);

        // 6.
        IntSummaryStatistics statistics = students.stream()
                .collect(Collectors.summarizingInt(Student::getAge));

        System.out.println(statistics);
        System.out.println("==================");
        System.out.println("минимальный возраст: " + statistics.getMin());
        System.out.println("максимальный возраст: " + statistics.getMax());
        System.out.println("средний возраст: " + statistics.getAverage());
        System.out.println("общее количество студентов: " + statistics.getCount());
        System.out.println("сумму всех возрастов: " + statistics.getSum());


        System.out.println("\n==================\n");

        // 7.
        Map<Integer, Map<String, List<Student>>> groupedByYearAndMajor = students.stream()
                .collect(Collectors.groupingBy(Student::getYear, Collectors.groupingBy(Student::getMajor)));
        printMap(groupedByYearAndMajor);


    }


    private static <K, V> void printMap(Map<K, V> map) {
        map.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println("\n=================\n");
    }
}
