package homeworks.homework_42;

import java.util.Comparator;

public class SportsmanScoreComparator implements Comparator<Sportsman> {
    @Override
    public int compare(Sportsman s1, Sportsman s2) {
        return s1.getScore() - s2.getScore();
    }
}
