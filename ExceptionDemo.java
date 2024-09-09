import java.util.*;

public class ExceptionDemo {
    public static void main(String[] args) {
        int donuts = 0, milk = 0;
        double share = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of donuts: ");
        donuts = scanner.nextInt();

        try {
            System.out.print("Enter number of glasses of milk: ");
            milk = scanner.nextInt();
            share = donuts / milk;
            System.out.println("You have " + share + " donuts per glass of milk");
        } catch (ArithmeticException e) {
            System.out.println("No milk!\nGo buy some milk");
        } finally {
            System.out.println("End of program");
        }
    }
}
