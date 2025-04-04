package lessons.lesson_32;

import lists.MyArrayList;
import lists.MyList;

public class MyListTest {
    public static void main(String[] args) {

        MyList<Integer> integerList = new MyArrayList<>();

        integerList.add(10);
        System.out.println(integerList);
        integerList.addAll(120, 250, 1000, -100, 0, -200);

        System.out.println(integerList);

        Integer value = integerList.get(0);
        System.out.println(value);

        System.out.println("size: " + integerList.size());

        int index = integerList.indexOf(120);
        System.out.println("integerList.indexOf(120): " + index);

        index = integerList.indexOf(250);
        System.out.println("integerList.indexOf(250): " + index);


        System.out.println("=======================");
        System.out.println(integerList);
        // Хочу удалить элемент со значением 0
        System.out.println(integerList.remove(Integer.valueOf(0)));
        System.out.println(integerList);


        // NPE из-за добавления null в качестве значения
        integerList.add(null);
        System.out.println(integerList);

        System.out.println(integerList.lastIndexOf(1000));
        System.out.println(integerList.lastIndexOf(null));


    }
}
