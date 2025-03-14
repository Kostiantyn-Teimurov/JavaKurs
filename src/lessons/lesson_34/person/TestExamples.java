package lessons.lesson_34.person;

import homeworks.homework_24.Calculator;
import lessons.lesson_27.Autobus;
import lessons.lesson_27.BusDriver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TestExamples {

    // Метод, который выполняется перед КАЖДЫМ тестовым методом
    @BeforeEach
    void setUp() {
        System.out.println("Метод @BeforeEach");
    }
    /*
    @BeforeAll - метод выполняется один раз, перед выполнением первого тестового метода. ДОЛЖЕН БЫТЬ СТАТИЧЕСКИМ
    @AfterEach - после КАЖДОГО
    @AfterAll - один раз, После всех. Статик
    @disabled - отключен и выполнятся не будет
     */

    // @Test указывает, что метод является тестовым
    // Таким образом JUnit знает, что этот метод нужно запустить во время выполнения тестов
    @Test
    public void testAddition() {
        System.out.println("Test addition");
        // Протестировать, правильно ли работает метод sum класса Calculator
        double result = Calculator.sum(2, 3);

        // Реальное (фактическое) значение в переменной result
        // Ожидаемое значение - 5

        // Методы проверки утверждений - спец методы из фреймворка.
        // assertEquals(expected, result)
        Assertions.assertEquals(5, result); // Проверяет равны ли два значения. Тест будет пройден, если 2 значения равны
        Assertions.assertNotEquals(0, result); // Пройден, если НЕ совпадают
        Assertions.assertTrue(result >= 4); // проверяет, что условие верно
        assertEquals(10, 5 + 5); // статический импорт позволяет использовать методы, без обращения к классу.
        assertFalse(result > 10); // пройден, если false
        assertNull(null); // пройден, если объект равен null
        assertNotNull("String"); // пройден, если объект НЕ null
    }

    @Disabled
    @Test
    public void emptyTest() {
        System.out.println("Test empty");
        // Если в методе нет ложного утверждения - он считается пройденным. В том числе ПУСТОЙ
    }


    // Параметризованные тесты - выполнить один и тот же метод с различными значениями

    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "kiwi", "cherry"})
    public void testFruits(String fruit) {
        System.out.println("current value" + fruit);
        assertNotNull(fruit);
        assertTrue(fruit.length() > 4);
    }


    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 6})
    void testStatic(int value) {
        System.out.println("static value run: " + value);
        Autobus bus = new Autobus(new BusDriver("Test", "111111"), 10);
        System.out.println(bus);
    }

    // Источник данных в формате CSV -
    // Источник данных файл в формате CSV

    // Источник данных - метод
    @ParameterizedTest
    @MethodSource("testDataFruits")
    void testMethodSourceFruits(String fruit) {
        System.out.println("Current value: " + fruit);
        assertNotNull(fruit);
    }

    // Этот метод возвращает Стрим - поток данных. Здесь я могу впихнуть null !
    static Stream<String> testDataFruits() {
        return Stream.of("apple", null, "banana", "kiwi", "cherry");
    }


    @ParameterizedTest
    @MethodSource("testDataInt")
    void testMethodSourceInt(int value) {
        System.out.println("Current value: " + value);
        assertNotEquals(100, value);
    }

    static Stream<Integer> testDataInt() {
        return Stream.of(1, 2, -10, 0, 15);
    }


    @ParameterizedTest
    @MethodSource("testDataArguments")
    void testMethodSourceArguments(int value, int expected, boolean isEquals) {
        System.out.println(value + " | " + expected + " | " + isEquals);
        int result = value * value;
        assertEquals(expected, result);
    }

    // <Arguments> - могу запихнуть любое количество любых типов
    static Stream<Arguments> testDataArguments() {
        return Stream.of(
                Arguments.of(2, 4, true),
                Arguments.of(3, 9, true),
                Arguments.of(4, 15, false)
        );
    }

    @ParameterizedTest
    @MethodSource("testPersonData")
    void testMethodSourcePerson(Person person, String newEmail) {
        System.out.println("Current value: " + person);
        System.out.println("New email: " + newEmail);
    }

    static Stream<Arguments> testPersonData() {
        Person person = new Person("test@mail.com", "pasWerpg2*");
        return Stream.of(
                Arguments.of(person, "new1234#mail.com"),
                Arguments.of(new Person("invalid.mail.com", "passwod"), "pass.com")
        );
    }


}