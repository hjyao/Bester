package bester;

/**
 * Created by twer on 08/03/15.
 */
public class Bester {
    public Rectangle bestFrom(Rectangle... rectangles) {
        Rectangle best = rectangles[0];
        for (Rectangle challenger : rectangles){
            best = challenger.betterThan(best);
        }
        return best;
    }
}
