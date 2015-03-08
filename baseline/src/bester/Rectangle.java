package bester;

public class Rectangle {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        return Double.compare(rectangle.area(), area()) == 0;
    }
}
