package homeworks.homework_21;

public class Developer {

    String name;
    String language;
    int age;
    int howLongInIT;
    String lvl;

    public Developer(String name, String language, int age, int howLongInIT) {
        this.name = name;
        this.language = language;
        this.age = age;
        this.howLongInIT = howLongInIT;
    }

    public void info() {
        if (howLongInIT <= 0) {
            System.out.println("You are not Developer! Go Learn!");
            return;
        } else if (howLongInIT <= 2) {
            lvl = "Junior";
        } else if (howLongInIT <= 5) {
            lvl = "Middle";
        } else {
            lvl = "Senior";
        }

        System.out.println("Name: " + name + ", language: " + language + ", age: " + age + ", lvl: " + lvl);

    }

}
