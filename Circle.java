public class Circle implements Measureable {
    private int radius;

    public double getArea() {
        return radius * radius * 3.1412;
    }

    public double getPerimeter() {
        return 2 * 3.1412 * radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
