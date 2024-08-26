import java.util.*;


public class ArrayDemo {
    public static void main(String[] args) {
        double[] temperature = new double[7];
        double total = 0, average = 0;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter 7 temperatures: ");

        for (int i = 0; i < 7; i++) {
            temperature[i] = scanner.nextDouble();
            // add up to total
        }

        // calculate average

        System.out.println("The average temperature is " + average);
        System.out.println("The temperatures are: ");

        for (int i = 0; i < 7; i++) {
            // if else statement to check if above, below or is the average
        }
    }
}
