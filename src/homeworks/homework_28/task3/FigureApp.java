package homeworks.homework_28.task3;

public class FigureApp {
    public static void main(String[] args) {
        Figure figure1 = new Circle(4);
        Figure figure2 = new Square(6);
        Figure figure3 = new Triangle(4, 6);

        Figure[] figures = new Figure[3];

        figures[0] = figure1;
        figures[1] = figure2;
        figures[2] = figure3;

        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].calculateArea());
        }
    }
}
