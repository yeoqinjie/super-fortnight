public class Overload {

    public double getAverage(double x, double y) {
        return (x + y) / 2;
    }

    public double getAverage(int x, int y) {
        return (x + y) / 2;
    }

    public char getAverage(char x, char y) {
        return (char) ((x + y) / 2);
    }
}