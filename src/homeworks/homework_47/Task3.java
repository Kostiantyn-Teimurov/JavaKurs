package homeworks.homework_47;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>(List.of(
                new Person("Person1", 30, "Berlin"),
                new Person("Person2", 45, "Hamburg"),
                new Person("Person3", 20, "Berlin"),
                new Person("Person4", 18, "Dortmund"),
                new Person("Person5", 26, "Dusseldorf"),
                new Person("Person6", 23, "Dortmund"),
                new Person("Person7", 35, "Dortmund"),
                new Person("Person8", 57, "Berlin"),
                new Person("Person9", 75, "Dusseldorf"),
                new Person("Person10", 33, "Berlin"),
                new Person("Person11", 10, "Dusseldorf"),
                new Person("Person12", 25, "Dortmund"),
                new Person("Person13", 26, "Dortmund"),
                new Person("Person11", 10, "Dusseldorf")
        ));

        List<Person> filteredPeople = people.stream()
                .filter(p -> p.getAge() > 25)
                .filter(p -> p.getCity().equals("Dortmund"))
                .collect(Collectors.toList());

        System.out.println(filteredPeople);
    }


}
