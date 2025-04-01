package homeworks.homework_46;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {

    private static List<Book> books = new ArrayList<Book>();

    static {
        books.add(new Book("Book1", "Author1"));
        books.add(new Book("Book2", "Author2"));
        books.add(new Book("Book3", "Author3"));
        books.add(new Book("Book1", "Author11"));
    }


    public static Optional<Book> findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }


    public static void main(String[] args) {

        Optional<Book> book1 = findBookByTitle("Book1");
        System.out.println(book1.get());

        Optional<Book> bookNull = findBookByTitle("Book");
//        System.out.println(bookNull.get()); - ошибка. Надо проверить isPresent()

        System.out.println("=================\n");

        if (bookNull.isPresent()) {
            Book book2 = bookNull.get();
            System.out.println(book2);
        } else {
            System.out.println("Такой книги не найдено");
        }

        System.out.println("====================\n");

        String title = "Book3";

        Optional<Book> books = findBookByTitle(title);
        if (books.isPresent()) {
            Book book = books.get();
            System.out.println(book);
        } else {
            System.out.println("Книга не найдена");
        }

    }

}
