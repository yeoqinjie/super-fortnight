public class StringEquality {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "hello";

        int int1 = 1;
        int int2 = 1;

        boolean compareInt = int1 == int2;
        boolean compareString = string1.equalsIgnoreCase(string2);

        System.out.println("Compare Integers: " + compareInt);
        System.out.println("Compare Strings: " + compareString);
    }
}
