package lessons.lesson_43;

public class LinkedApp {
    public static void main(String[] args) {

        MyKinkedList<Integer> list = new MyKinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(90);
        list.add(30);
        list.add(80);
        list.add(70);
        list.add(10);
        list.add(50);
        System.out.println(list);
        System.out.println(list.size());

        int value = list.get(6);
        System.out.println(value);
        System.out.println(list.get(9));

    }
}
