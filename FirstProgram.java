import java.util.*;

public class FirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello World");

        System.out.println("I will add two numbers.");
        System.out.println("Enter two whole numbers on a line: ");

        int n1 = 0, n2 = 0;

        Scanner keyboard = new Scanner(System.in);
        n1 = keyboard.nextInt();
        n2 = keyboard.nextInt();

        System.out.println("The sum of " + n1 + " and " + n2 + " is " + (n1 + n2));
    }
}
