package consultations.consult_13;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MagicDemo {
    public static void main(String[] args) throws Exception {

        // Рефлексия    !!!!!!!!!!!!!!!!!!!!!!

        Person person = new Person("Alex");

        // Нахожу приватное поле name
        Field nameField = Person.class.getDeclaredField("name");

        // Открываю доступ к приватному полю
        nameField.setAccessible(true);

        // Меняю значение в поле
        nameField.set(person, "Maria");

        // Проверяю, сработало ли
        System.out.println("Значение в поле name: " + nameField.get(person));

        // закрываю поле
        nameField.setAccessible(false);

        System.out.println(person);

        // Нахожу метод по имени
        Method sayHelloMethod = Person.class.getDeclaredMethod("sayHello");

        // Снимает приватность
        sayHelloMethod.setAccessible(true);

        // Вызов метода
        sayHelloMethod.invoke(person); // Привет, меня зовут Мария

        // Восстанавливаем приватность метода
        sayHelloMethod.setAccessible(false);


        System.out.println("==========================");

        // Получаем класс
        Class<?> personClass = Class.forName("consultations.consult_13.Person");

        // Получаем конструктор класса
        Constructor<?> constructor = personClass.getConstructor(String.class);

        Object object = (Person) constructor.newInstance("Сергей");

        System.out.println(object);

        sayHelloMethod.setAccessible(true);

        // Вызов метода
        sayHelloMethod.invoke(object);

        sayHelloMethod.setAccessible(false);

    }

}
