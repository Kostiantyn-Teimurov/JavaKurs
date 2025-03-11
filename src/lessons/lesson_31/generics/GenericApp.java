package lessons.lesson_31.generics;

import lessons.lesson_28.animals.Cat;

public class GenericApp {
    public static void main(String[] args) {

        GenericBox<String> box = new GenericBox<>("Hello");

        String value = box.getValue();
        System.out.println(value.toUpperCase());
        System.out.println(box.getValue().length());

        box.setValue("box1");
        System.out.println(box);

        System.out.println("======================");

        GenericBox<Cat> catBox = new GenericBox<>(new Cat());

        System.out.println(catBox.getValue());


        // Нельзя поместить другой тип данных!
//        catBox.setValue("String");
        catBox.setValue(null);


        // Дженерики не работают с примитивными типами
//        GenericBox<int> intBox = new GenericBox<int>(5);


        // Классы обертки, для хранения примитивов

        GenericBox<Integer> intBox = new GenericBox<>(125);
        GenericBox<Integer> intBox2 = new GenericBox<>(200);
        System.out.println(intBox.toString());

        int sum = intBox.getValue() + intBox2.getValue();
        System.out.println(sum);

        // За счёт автоупаковки / распаковки я практически не беспокоюсь о необходимости приведения типов
        int val = intBox.getValue();
        Integer integerVal = intBox.getValue();

        System.out.println("\n========================");

    }
}
