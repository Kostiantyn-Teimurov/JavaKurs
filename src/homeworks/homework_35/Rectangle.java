package homeworks.homework_35;

import lists.MyArrayList;
import lists.MyList;

import java.util.Iterator;
import java.util.Objects;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public static void removeDuplicates(MyList<Rectangle> listRectangles, Rectangle rectangleToRemove) {
//        for (int i = 0; i < listRectangles.size(); i++) {
        for (int i = listRectangles.size() - 1; i >= 0; i--) {
            if (listRectangles.get(i).equals(rectangleToRemove)) {
                listRectangles.remove(rectangleToRemove);
//                i--;
            }
        }
    }

//    public static void removeDuplicates1(MyList<Rectangle> listRectangles, Rectangle rectangleToRemove) {
//        while (listRectangles.remove(rectangleToRemove))
//        while (listRectangles.contains(rectangleToRemove)) {
//            listRectangles.remove(rectangleToRemove);
//        }
//    }





//    public static void removeDuplicates(MyList<Rectangle> listRectangles, Rectangle rectangleToRemove) {
//        Iterator<Rectangle> iterator = listRectangles.iterator();
//        while (iterator.hasNext()) {
//            Rectangle rect = iterator.next();
//            if (rect.equals(rectangleToRemove)) {
//                iterator.remove();
//            }
//        }
//    }

//    public static void removeDuplicates(MyList<Rectangle> listRectangles, Rectangle rectangleToRemove) {
//        for (Rectangle currentRectangle : listRectangles) {
//            if (currentRectangle.equals(rectangleToRemove)) {
//                listRectangles.remove(currentRectangle);
//            }
//        }
//    }


    @Override
    public String toString() {
        return "Rectangle {" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Rectangle)) return false;

        Rectangle rectangle = (Rectangle) o;
        return Double.compare(length, rectangle.length) == 0 && Double.compare(width, rectangle.width) == 0;
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(length);
        result = 31 * result + Double.hashCode(width);
        return result;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle1Clone = new Rectangle();
        Rectangle rectangle2 = new Rectangle(5, 4);
        Rectangle rectangle2Clone = new Rectangle(5, 4);
        Rectangle rectangle3 = new Rectangle(0, 0);

        System.out.println(rectangle1.toString());
        System.out.println(rectangle2);
        System.out.println(rectangle3);

        System.out.println(rectangle1.equals(rectangle1Clone));
        System.out.println(rectangle2.equals(rectangle2Clone));

        System.out.println(rectangle1.equals(rectangle2));


        MyList<Rectangle> rectangles = new MyArrayList<>();

        rectangles.add(new Rectangle(5.0, 3.0));
        rectangles.add(new Rectangle(5.0, 3.0));
        rectangles.add(new Rectangle(4.0, 2.0));
        rectangles.add(new Rectangle(5.0, 3.0));
        rectangles.add(new Rectangle(6.0, 4.0));
        rectangles.add(new Rectangle(5.0, 3.0));
        rectangles.add(new Rectangle(6.0, 3.0));
        rectangles.add(new Rectangle(6.0, 4.0));
        rectangles.add(new Rectangle(5.0, 3.0));
        rectangles.add(new Rectangle(6.0, 4.0));
        rectangles.add(new Rectangle(6.0, 3.0));

        System.out.println("Список до удаления: ");
        for (Rectangle rect : rectangles) {
            System.out.println(rect);
        }
        removeDuplicates(rectangles, new Rectangle(5, 3));

        System.out.println("Список после удаления1: ");
        for (Rectangle rect : rectangles) {
            System.out.println(rect);
        }

        removeDuplicates(rectangles, new Rectangle(6, 4));
        System.out.println(rectangles.toString());

        System.out.println("Список после удаления2: ");
        for (Rectangle rect : rectangles) {
            System.out.println(rect);
        }

        removeDuplicates(rectangles, new Rectangle(6, 4));

        System.out.println("Список после удаления3: ");
        for (Rectangle rect : rectangles) {
            System.out.println(rect);
        }

    }
}
