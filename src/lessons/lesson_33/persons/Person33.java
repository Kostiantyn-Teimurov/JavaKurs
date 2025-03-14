package lessons.lesson_33.persons;

public class Person33 {

    private String email;
    private String password;

    public Person33(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)) {
            this.email = email;
        }
    }

    /*
    test@mail.net
    1. Должна присутствовать @ и только одна
    2. Точка после собаки
    3. после последней точки есть два или более символов
    4. Допустимые символы: Алфавит, цифры, '-', '_', '@', '.'
    5. До собаки должен быть хотя бы один символ
    6. Первый символ - должна быть буква
     */
    public boolean isEmailValid(String email) {
        if (email == null) return false;
        // 1.
        int indexAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != lastAt) return false;

        // 2.
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) return false;

        // 3.
        int lastDotIndex = email.lastIndexOf('.');
//        if (lastDotIndex + 2 >= email.length()) return false
        if (lastDotIndex >= email.length() - 2) return false;

        // 4. Перебираю все символы в строке. Проверяю текущий символ.
        // Если нахожу хоть один не правильный - сразу возвращаю false
//        char ch = email.charAt(i); - хрень
        // string.toCharArray() -> char[]
        for (char ch : email.toCharArray()) {

            // проверка символа на правильность
            boolean isPass = Character.isAlphabetic(ch) || Character.isDigit(ch) || ch == '-' || ch == '_' || ch == '.' || ch == '@';

            // Если символ не подходит (isPass = false) возвращаем false
//            if (isPass == true) return true; - хрень
            if (!isPass) return false;
        }

        // 5.
        if (indexAt == 0) return false;

        // 6.
        if (!Character.isLetter(email.charAt(0))) return false;


        // Все проверки пройдены. Email подходит
        return true;
    }

    public String getPassword() {
        return password;
    }

    /*
    1. Длина пароля >= 8
    2. Должна быть минимум одна цифра
    3. Должна быть минимум одна маленькая бука
    4. Должна быть минимум одна большая бука
    5. Должен быть минимум один спец символ: "!%$@&*()[],.-"

    Пароль должен удовлетворять ВСЕМ требованиям СРАЗУ
    5 boolean переменных. Каждая отвечает за свой пункт.
    Пароль подходит, только если все 5 имеют true.
     */

    public boolean isPasswordValid(String password) {
        if (password == null || password.length() < 8) return false;

        // 2, 3, 4, 5
        boolean isDigit = false;
        boolean isLowerCase = false;
        boolean isUpperCase = false;
        boolean isSpecSymbol = false;

        // альтернативный способ объявления переменных
        boolean[] result = new boolean[4]; // false, false, false, false

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) isDigit = true;
            if (Character.isLowerCase(ch)) isLowerCase = true;
            if (Character.isUpperCase(ch)) isUpperCase = true;
            if ("!%$@&*()[],.-_".indexOf(ch) != -1) isSpecSymbol = true;

//            if("!%$@&*()[],.-_".contains("" + ch)) isSpecSymbol = true;
//            if("!%$@&*()[],.-_".contains(String.valueOf(ch))) isSpecSymbol = true;

//            if (ch == '!' || ch == '%' || ch == '$' || ch == '@' || ch == '&' || ch == '*' || ch == '('
//                    || ch == ')' || ch == '[' || ch == ']' || ch == ',' || ch == '.' || ch == '_' || ch == '-') {
//                isSpecSymbol = true;
//            }
        }
        return isDigit && isLowerCase && isUpperCase && isSpecSymbol;
    }


    public void setPassword(String password) {
        if (isPasswordValid(password)) {
            this.password = password;
        }
    }

    @Override
    public String toString() {
        return "Person {" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
