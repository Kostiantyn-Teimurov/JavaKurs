package homeworks.homework_30.interfaces;

import lessons.lesson_30.interfaces.Book;

public class BooksApp {
    public static void main(String[] args) {

        Book book = new Book("Book1", "NoName");

        book.print();

        book.defaultMethod();

    }
}
