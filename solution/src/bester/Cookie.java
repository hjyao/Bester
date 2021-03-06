package bester;

public class Cookie implements Bestable {

    private int numberOfChocolateChips;

    public Cookie(int numberOfChocolateChips) {
        this.numberOfChocolateChips = numberOfChocolateChips;
    }

    @Override
    public Bestable betterThan(Bestable challenger) {
        if (this.numberOfChocolateChips > ((Cookie) challenger).numberOfChocolateChips) {
            return this;
        }

        return challenger;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cookie cookie = (Cookie) o;

        return numberOfChocolateChips == cookie.numberOfChocolateChips;

    }

    @Override
    public int hashCode() {
        return numberOfChocolateChips;
    }

    @Override
    public String toString() {
        return "cookie with " + numberOfChocolateChips + " chocolate chips";
    }
}
