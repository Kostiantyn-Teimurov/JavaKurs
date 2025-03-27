package homeworks.homework_43;

import java.util.*;

public class Task2 {
    final static int COUNT_ELEMENTS = 50000;
    static Random random = new Random();


    private static long getAllValues(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long setNewValues(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 2000; i++) {
            list.set(random.nextInt(COUNT_ELEMENTS), random.nextInt(1001));
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long deleteValuesByIndex(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            int randomIdx = random.nextInt(COUNT_ELEMENTS + 1);
            if (list.size() - 1 < randomIdx) {
                continue;
            }
            list.remove(randomIdx);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long deleteValues(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            int randomValue = random.nextInt(10001);
            list.remove(Integer.valueOf(randomValue));
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }


    public static void main(String[] args) {

//        Random random = new Random();

        List<Integer> integersArray = new ArrayList<>(1000);
        List<Integer> integersLinked = new LinkedList<>();

        for (int i = 0; i < COUNT_ELEMENTS; i++) {
            int randomValue = random.nextInt(1001);
            integersArray.add(randomValue);
            integersLinked.add(randomValue);
        }


        long duration = getAllValues(integersArray);
        System.out.println(duration);

        long duration2 = getAllValues(integersLinked);
        System.out.println(duration2);

        System.out.println("====================");

        System.out.println(setNewValues(integersArray));
        System.out.println(setNewValues(integersLinked));
        System.out.println("===================");

        System.out.println(deleteValuesByIndex(integersArray));
        System.out.println(deleteValuesByIndex(integersLinked));
        System.out.println("===================");


//        System.out.println(integersArray);
//        System.out.println(integersLinked);

        System.out.println(deleteValues(integersArray));
        System.out.println(deleteValues(integersLinked));


//        System.out.println(integersArray);
//        System.out.println(integersLinked);
    }

}
