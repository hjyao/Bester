package bester;

/**
 * Created by twer on 08/03/15.
 */
public class Bester {
    public Bestable bestFrom(Bestable... bestables) {
        if(bestables == null || bestables.length == 0){
            throw new IllegalArgumentException();
        }
        Bestable best = bestables[0];
        for (Bestable challenger : bestables){
            if(challenger != null){
                best = challenger.betterThan(best);
            }
        }
        return best;
    }
}
