public class OverloadDemo {
    public static void main(String[] args) {
        int x = 1, y = 2, z = 3;
        char a = 'a', b = 'B';
        double p = 123.45, q = 67.89;

        p("" + Overload.getAverage(a, b));
    }

    public static void p(String x) {
        System.out.println(x);
    }
}
