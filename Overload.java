public class Overload {

    public static double getAverage(double x, double y) {
        return (x + y) / 2;
    }

    public static double getAverage(int x, int y, int z) {
        return (x + y) / 3;
    }

    public static char getAverage(char x, char y) {
        return (char) ((x + y) / 2);
    }
}