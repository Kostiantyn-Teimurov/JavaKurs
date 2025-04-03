package homeworks.homework_48;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String major; // специальность
    private int year;     // курс
    private double grade; // средняя оценка

    public Student(String name, int age, String major, int year, double grade) {
        this.name = name;
        this.age = age;
        this.major = major;
        this.year = year;
        this.grade = grade;
    }


    @Override
    public String toString() {
        return String.format("{%s: %d, %s, %d, %.2f}", name, age, major, year, grade);
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;
        return age == student.age && year == student.year && Double.compare(grade, student.grade) == 0 && Objects.equals(name, student.name) && Objects.equals(major, student.major);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + age;
        result = 31 * result + Objects.hashCode(major);
        result = 31 * result + year;
        result = 31 * result + Double.hashCode(grade);
        return result;
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
