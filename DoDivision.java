import java.util.Scanner;

public class DoDivision {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double numerator = 0, denominator = 0, result = 0;
        System.out.println("Please enter a number for the numerator");
        numerator = kb.nextDouble();

        System.out.println("Please enter a number for the denominator");
        denominator = kb.nextDouble();

        try {
            result = divide(numerator, denominator);
        } catch (ArithmeticException e) {
            result = 9999;
        }

        System.out.println("The result is " + result);
    }

    public static double divide(double numerator, double denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException();
        } 
        
        return numerator / denominator;
    }
}
