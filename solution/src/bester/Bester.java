package bester;

public class Bester {

    public static Bestable bestFrom(Bestable... bestables) {
        if (bestables == null || bestables.length == 0) {
            throw new IllegalArgumentException("Cannot accept null or empty Bestables");
        }

        Bestable best = bestables[0];
        for (Bestable challenger : bestables) {
            if (challenger != null) {
                if (best.getClass() != challenger.getClass()) {
                    throw new IllegalArgumentException("All Bestables must be of the same type");
                }

                best = best.betterThan(challenger);
            }
        }

        return best;
    }
}
