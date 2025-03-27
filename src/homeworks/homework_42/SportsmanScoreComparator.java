package homeworks.homework_42;

import java.util.Comparator;

public class SportsmanScoreComparator implements Comparator<Sportsman> {
    @Override
    public int compare(Sportsman s1, Sportsman s2) {
        return Double.compare(s1.getScore(), s2.getScore());

        // Так не работает - отбрасывает
//        return (int) (s1.getScore() - s2.getScore());
    }
}
