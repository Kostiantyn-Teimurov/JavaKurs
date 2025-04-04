package lessons.lesson_49.validator;

import java.util.List;

public class PersonValidator {

    public static void validateEmail(String email) throws EmailValidateException {

        // throw - Ключевое слово используется для явного выброса исключения (создание объекта исключения)

        if (email == null) throw new EmailValidateException("email should be not null");
        // 1.
        int indexAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != lastAt) throw new EmailValidateException("@ error");

        // 2.
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) throw new EmailValidateException(". after @ error");

        // 3.
        int lastDotIndex = email.lastIndexOf('.');
//        if (lastDotIndex + 2 >= email.length()) return false
        if (lastDotIndex >= email.length() - 2) throw new EmailValidateException("last . error");

        // 4. Перебираю все символы в строке. Проверяю текущий символ.
        // Если нахожу хоть один не правильный - сразу возвращаю false
//        char ch = email.charAt(i); - хрень
        // string.toCharArray() -> char[]
        for (char ch : email.toCharArray()) {

            // проверка символа на правильность
            boolean isPass = Character.isAlphabetic(ch) || Character.isDigit(ch) || ch == '-' || ch == '_' || ch == '.' || ch == '@';

            // Если символ не подходит (isPass = false) возвращаем false
//            if (isPass == true) return true; - хрень
            if (!isPass) throw new EmailValidateException("Illegal symbol");
        }

        // 5.
        if (indexAt == 0) throw new EmailValidateException("@ should be not first");

        // 6.
        if (!Character.isLetter(email.charAt(0))) throw new EmailValidateException("first symbol should be letter");

        // Все проверки пройдены. Email подходит
    }


    public static void validatePassword(String password) throws PasswordValidateException {
        if (password == null || password.length() < 8) throw new PasswordValidateException("password should be > 8");

        boolean isDigit = false;
        boolean isLowerCase = false;
        boolean isUpperCase = false;
        boolean isSpecSymbol = false;

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) isDigit = true;
            if (Character.isLowerCase(ch)) isLowerCase = true;
            if (Character.isUpperCase(ch)) isUpperCase = true;
            if ("!%$@&*()[],.-_".indexOf(ch) != -1) isSpecSymbol = true;
        }

        if (!isDigit) throw new PasswordValidateException("should contains digit");
        if (!isLowerCase) throw new PasswordValidateException("should contains lower symbol");
        if (!isUpperCase) throw new PasswordValidateException("should contains upper symbol");
        if (!isSpecSymbol) throw new PasswordValidateException("should contains special symbol");
    }
}
