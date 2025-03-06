package lessons.lesson_23;

public class Cat {
    private String name;
    private int age;
    private int weight;
    protected boolean isProtected;
    boolean isDefault;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Геттеры и сеттеры - спец публичные методы, дающие возможность получать и изменять значения поля

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (!(age < 0 || age > 30)) {
            this.age = age;
        }
    }

    public void setWeight(int weight) {
        if (weight < 0) {
            this.weight = 0;
            return;
        }
        if (!(weight > 50)) {
            this.weight = weight;
        }
    }

    // Я не хочу давать возможность изменять имя коту после создания метода
//    public void setName(String name) {
//        if (name != null) {
//            this.name = name;
//        }
//    }


    public void sayMeow() {
        System.out.println("Meow! " + name);
        testMethod(); // внутри кода класса есть доступ
    }

    private void testMethod() {
        System.out.println("Test!");
    }

    public String toString() {
        // System.out.printf("Cat %s, age: %d, weight: %d\n", name, age, weight);
        // String resConcat = "Cat" + name + ", age: " + age + " weight: " + weight;
        String result = String.format("Cat %s, age: %d, weight: %d", name, age, weight);
        return result;
    }
}
