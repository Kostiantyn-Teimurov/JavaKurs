package lessons.lesson_49.validator;

public class PasswordValidateException extends Exception {

    public PasswordValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "My PasswordValidateException | " + super.getMessage();
    }
}
