package homeworks.homework_23;

public class Employee {

    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public void setAge(int age) {
        if (!(age < 0 || age > 125)) {
            this.age = age;
        }
    }

    public void setSalary(int salary) {
        if (!(salary < 100)) {
            this.salary = salary;
        }
    }

    public void info() {
        System.out.println("Name: " + name + ". Age: " + age + ". Salary: " + salary);
    }

}
