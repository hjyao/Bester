package bester;

public class Cookie {

    private int numberOfChocolateChips;

    public Cookie(int numberOfChocolateChips) {
        this.numberOfChocolateChips = numberOfChocolateChips;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cookie cookie = (Cookie) o;

        return numberOfChocolateChips == cookie.numberOfChocolateChips;

    }

}
