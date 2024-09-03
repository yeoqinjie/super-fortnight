public class Fruit implements Comparable {
    private String name;

    // Need to implement the method compareTo
    public int compareTo(Object o) {
        if ((o != null) && (o instanceof Fruit)) {
            Fruit otherFruit = (Fruit) o;
            if (name.length() > otherFruit.name.length()) {
                return 1;
            } else if (name.length() < otherFruit.name.length()) {
                return -1;
            } else {
                return 0;
            }
        }
        
        return -1;
    }
}
