package lessons.lesson_49.validator;

// extends RuntimeException - для НЕ проверяемых исключений
// extends Exception - проверяемых исключений
public class EmailValidateException extends Exception {

    /*
    getMessage() - возвращает строку с коротким описанием исключения
    getCause() - возвращает исключение, которые вызвало текущее исключение
    toString() - строковое представление исключение
    printStackTrace() - выводит трассировку исключений
     */

    public EmailValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Email validate exception | " + super.getMessage();
    }
}
