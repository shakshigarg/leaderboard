package compartor;

import models.User;

import java.util.Comparator;

public class ScoreComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        if(o1.getScore()> o2.getScore()){
            return -1;
        }
        return 1;
    }
}
