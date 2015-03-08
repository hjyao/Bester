package bester;

public class Rectangle implements Bestable {
    private double length;
    private double breadth;

    public Rectangle(double breadth, double length) {
        this.breadth = breadth;
        this.length = length;
    }

    public double area() {
        return length * breadth;
    }

    @Override
    public Bestable betterThan(Bestable challenger) {
        if (area() > ((Rectangle) challenger).area()) {
            return this;
        }

        return challenger;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        return Double.compare(rectangle.area(), area()) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(length);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(breadth);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return length + " by " + breadth + " rectangle";
    }
}
