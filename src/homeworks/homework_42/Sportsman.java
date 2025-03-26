package homeworks.homework_42;

import java.util.Arrays;
import java.util.Comparator;

public class Sportsman implements Comparable<Sportsman> {
    private String name;
    private int age;
    private int score;

    public Sportsman(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Sportsman{" + "name='" + name + '\'' + ", age=" + age + ", score=" + score + "}\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Sportsman sportsman) {
        return this.name.compareTo(sportsman.name);
    }

    public static void main(String[] args) {
        Sportsman[] sportsmen = new Sportsman[5];

        sportsmen[0] = new Sportsman("Name1", 20, 100);
        sportsmen[1] = new Sportsman("Name3", 30, 200);
        sportsmen[2] = new Sportsman("Name1", 27, 150);
        sportsmen[3] = new Sportsman("Name2", 35, 140);
        sportsmen[4] = new Sportsman("Name4", 20, 200);

        Arrays.sort(sportsmen);
        System.out.println(Arrays.toString(sportsmen));

        Arrays.sort(sportsmen, new SportsmanScoreComparator());
        System.out.println(Arrays.toString(sportsmen));

        Arrays.sort(sportsmen, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman s1, Sportsman s2) {
                return s1.getAge() - s2.getAge();
            }
        });
        System.out.println(Arrays.toString(sportsmen));

    }

}
