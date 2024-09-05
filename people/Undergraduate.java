package people;

public class Undergraduate extends Student {
    private int level;

    public Undergraduate(String name, int studentNumber, int level) {
        super(name, studentNumber);
        setLevel(level);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String toString() {
        return super.toString() + "\nLevel: " + getLevel();
    }
}
