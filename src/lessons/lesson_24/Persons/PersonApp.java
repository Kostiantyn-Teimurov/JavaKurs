package lessons.lesson_24.Persons;

/*
Массив объектов (массив ссылочных типов данных)
 */


public class PersonApp {
    public static void main(String[] args) {

        Person garry = new Person("Garry", 31, "Photo");
        System.out.println(garry.toString());


        Person john = new Person("John", 75, "Music");
        System.out.println(john.toString());


        Person[] people = new Person[5]; // Создаю массив для 5 ссылок на объекты типа Person

        // Значение по умолчанию для типа данных - null

        people[0] = garry;
        people[3] = john;
        people[1] = new Person("Tom", 5, "crying");


        System.out.println("=================");
        System.out.println("people[0]: " + people[0].toString());
        System.out.println(people[0].getName());

        people[0].setName("Peter");
        System.out.println(people[0].toString());
        System.out.println(garry.toString());

        System.out.println("\n ================== for ===================");

        for (int i = 0; i < people.length; i++) {
            if (people[i] != null) {
                System.out.println(people[i].toString());
                System.out.println(people[i].getName());
            } else {
                System.out.println("NULL!");
            }
        }


        System.out.println("==========================");
        Person test = new Person("Test", 50, "coding");
        people[2] = test;

        people[2].setName("Test1");
        test.setAge(52);

        System.out.println(test.toString());


        test = null;
        System.out.println(people[2].getHobby());

        test = people[1];

        Person deleteMe = new Person("DeleteMe", 0, "crashing");

        deleteMe = null;


    }
}
