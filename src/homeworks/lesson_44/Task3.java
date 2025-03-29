package homeworks.lesson_44;

import java.util.*;

public class Task3 {

    public static void main(String[] args) {
        String string = "abcdefj mhhca ab,cdf,";
        System.out.println(getFirstUniqueChar(string));

    }

    private static String getFirstUniqueChar(String str) {
        String newString = str.replaceAll("[^a-zA-Zа-яА-Я0-9]", "");

        // TODO здесь лучше использовать интерфейс Set?
        HashSet<String> setStrings1 = new LinkedHashSet<>();
        Set<String> setStrings2 = new HashSet<>();

        for (String s : newString.split("")) {
            if (!setStrings1.add(s)) {
                setStrings2.add(s);
            }
        }
        System.out.println(setStrings1);
        System.out.println(setStrings2);

        setStrings1.removeAll(setStrings2);
        System.out.println(setStrings1);

        // TODO разница есть(1,2,3)?

        // 1.
//        for (String s : setStrings1) {
//            return s;
//        }
//        return null;

        // 2.
//        return new ArrayList<>(setStrings1).get(0);

        // 3.
        Iterator<String> iterator = setStrings1.iterator();
        return iterator.next();
    }

}
