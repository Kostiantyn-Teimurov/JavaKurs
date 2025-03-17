package lessons.lesson_34.person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person;
    String startEmail = "john@teat.com";
    String startPassword = "qwerty1Q%S";

    @BeforeEach
    void setUp() {
        person = new Person(startEmail, startPassword);
    }

    /*
    1. Беру валидный правильный email
    2. Устанавливаем его сеттером person
    3. Мы ожидаем: что у person в поле email будет значение, которое мы установили в шаге 2.
    4.
     */
    @ParameterizedTest
    @ValueSource(strings = {"valid@test.com", "test1112@test.com.de"})
    void testValidEmailSet(String validEmail) {

        person.setEmail(validEmail);
        System.out.println(person.getEmail());

        Assertions.assertEquals(validEmail, person.getEmail());

    }

    /*
    1. Берем НЕ валидный email
    2. Устанавливаем его сеттером
    3. Ожидаемый результат: Email не будет установлен
        3.1. поле email у persona != Не валидный email
        3.2. Значение поля email осталось прежним
     */
    // Здесь лучше сделать поток данных (Stream) и в него указывать кучу не валидных email-ов
    @ParameterizedTest
    @ValueSource(strings = {"notValid@@mail.com", "notValid@mail.com.", "notValid@mailco..m", "notVali.d@mailcom", "notValid@@mailcom",
            "1notValid@@mail.com", "not", "notV%alid@@mail.com"})
    void testNotValidEmailSet(String notValidEmail) {

        person.setEmail(notValidEmail);

        Assertions.assertNotEquals(notValidEmail, person.getEmail());
        Assertions.assertEquals(person.getEmail(), startEmail);
    }

    /*
    1. Валидный пароль, сеттер
    2. Этот пароль == валидный пароль
     */
    @ParameterizedTest
    @ValueSource(strings = {"ValidPassword333_", "ValidPassword%333"})
    void testValidPasswordSet(String validPassword) {
        person.setPassword(validPassword);

        assertEquals(validPassword, person.getPassword());
    }

    @ParameterizedTest
    @ValueSource(strings = {"NotValidPassword_", "NotValidPassword333", "NotValidPassword2", "otalidassword333*", "No4_",
            "NTDGSHD33_"})
    void testNotValidPasswordSet(String notValidPassword) {
        person.setPassword(notValidPassword);

        assertNotEquals(notValidPassword, person.getPassword());
        assertEquals(person.getPassword(), startPassword);
    }


    // Не надо смешивать проверки!
//    @ParameterizedTest
//    @MethodSource("testDataValidEmailAndPassword")
//    void testValidEmailAndPassword(String validEmail, String validPassword) {
//        person.setEmail(validEmail);
//        person.setPassword(validPassword);
//        System.out.println(person);
//
//        assertEquals(validEmail, person.getEmail());
//        assertEquals(validPassword, person.getPassword());
//    }
//
//    static Stream<Arguments> testDataValidEmailAndPassword() {
//        return Stream.of(
//                Arguments.of("valid@test.com", "ValidPassword333_"),
//                Arguments.of("test1112@test.com.de", "ValidPassword%333")
//        );
//    }
}