import shape.*;
import shape.Rectangle;

public class ShapeDemo {
    public static void main(String[] args) {
        ShapeBase sb = new Rectangle(2, 3, 5);
        sb.drawHere();
    }
}
