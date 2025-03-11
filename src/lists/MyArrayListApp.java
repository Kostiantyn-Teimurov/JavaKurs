package lists;

import java.util.Arrays;

public class MyArrayListApp {
    public static void main(String[] args) {

        MyArrayList<Integer> myArrayInts = new MyArrayList<>();

        System.out.println(myArrayInts.isEmpty());

        myArrayInts.add(1);
        myArrayInts.add(0);
        myArrayInts.add(3426);
        myArrayInts.add(-3426);

        System.out.println(Arrays.toString(myArrayInts.toArray()));

        System.out.println(myArrayInts.get(3));
        System.out.println(myArrayInts.indexOf(3));
        System.out.println(myArrayInts.indexOf(0));

        myArrayInts.test();

        myArrayInts.remove(6);
//        myArrayInts.remove(3);

        System.out.println(myArrayInts.size());

        System.out.println(myArrayInts.contains(1));

        myArrayInts.set(3, 19);
        myArrayInts.set(32, 19);

        System.out.println(myArrayInts.toString());

        System.out.println("==============================");

        MyArrayList<String> myArrayStrings = new MyArrayList<>(new String[]{"12", "Hello", "0", null});

        myArrayStrings.test();

        myArrayStrings.add("Java");

        System.out.println(myArrayStrings.toString());

        System.out.println(myArrayStrings.get(4));

    }
}
