package lessons.lesson_28.animals;

public class TestToString {

    private String title;

    private TestToString(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "TestClass " + title;
    }

    public static void main(String[] args) {

        TestToString test = new TestToString("test");

        // У всех классов есть родитель Object
        // У объекта любого класса есть метод toString (полученный от Object)
        // Когда мы передаем ссылку на объект в место, где она должна    (sout или конкатенация String + ссылка)
        // У объекта будет вызван метод . toString()

        System.out.println(test.toString());
        System.out.println(test);

        String resul = "Hello, " + test;

        System.out.println(resul);


    }

}
