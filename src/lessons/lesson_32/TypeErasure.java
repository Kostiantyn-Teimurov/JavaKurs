package lessons.lesson_32;

import lists.MyArrayList;

public class TypeErasure<E> {

    private Object value;

    public TypeErasure(Object value) {
        this.value = value;
    }

    public Integer getValue() {
        return (Integer) value;
    }

    public void setValue(Object value) {
        this.value = value;
    }


    // Нельзя создавать перегруженный метод, отличающийся только типами параметров
    public void method(TypeErasure<Integer> typeErasure) {
        System.out.println(typeErasure);
    }

//    public void method(TypeErasure<String> tErasure) {
//        System.out.println(tErasure);
//    }


    public static void main(String[] args) {

        TypeErasure<Integer> t = new TypeErasure<>(5);


        MyArrayList<Integer> myArrayInts = new MyArrayList<>();
        System.out.println(myArrayInts);

        System.out.println(myArrayInts.isEmpty());

//        myArrayInts.add("1"); // Обеспечивается безопасность типов на этапе компиляции.
        myArrayInts.add(0);
        myArrayInts.add(3426);
        myArrayInts.add(-3426);

        Integer[] array = myArrayInts.toArray();

        // Стирание типов при работе с дженериками
        // Type Erasure
        /*
        Во время компиляции:
        1. Проверка типов.
        2. Стирание типов - удаление информации о параметрах типов
        3. Добавление приведения типов, где это необходимо
         */


    }

}
