public class Rectangle implements Measureable {
    // Instance Variables or Properties of the Class
    private int height;
    private int width;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    public double getArea() {
        return getWidth() * getHeight();
    }
}
