package bester;

/**
 * Created by twer on 08/03/15.
 */
public class Bester {
    public Rectangle bestFrom(Rectangle... rectangles) {
        if(rectangles == null || rectangles.length == 0){
            throw new IllegalArgumentException();
        }
        Rectangle best = rectangles[0];
        for (Rectangle challenger : rectangles){
            if(challenger != null){
                best = challenger.betterThan(best);
            }
        }
        return best;
    }
}
