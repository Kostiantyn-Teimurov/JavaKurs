package lessons.lesson_30.interfaces;

public class Application {
    public static void main(String[] args) {

        Book book = new Book("Мастер и Маргарита", "М.Булгаков");

        book.print();
        book.defaultMethod();

        Journal journal = new Journal("Cosmopolitan", 154);
        journal.print();
        journal.defaultMethod();


        // Тип ссылки типа интерфейс.
        // Набор методов, доступных по ссылке - методы, которые прописаны в интерфейсе.
        // Объект класса, который реализовал данный интерфейс
        Printable printable = journal; // Неявное автоматическое приведение типа ссылки

        Printable printable1 = new Book("Философия Java", "Б.Эккель");

        Printable printable2 = new Book("Джава. Полное руководство", "Kerry.===");
        printable1.print();
        printable2.print();

        Printable.testStatic("Hello");

        System.out.println("\n=================");

        ColorPrintable presentation = new Presentation("Inheritance", "Noname", "Inheritance in OOP");

        presentation.print();
        presentation.defaultMethod();
        presentation.colorPrint();


        Printable presentation2 = new Presentation("sdg", "esat", "dsag");

        presentation2.print();

    }
}
