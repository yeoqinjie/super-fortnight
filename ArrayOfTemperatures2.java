import java.util.*;


public class ArrayOfTemperatures2 {
    public static void main(String[] args) {
        double[] temperature;
        double total = 0, average = 0;
        Scanner scanner = new Scanner(System.in);
        int arraySize = 0;

        System.out.println("How many temperatures do you have? ");
        arraySize = scanner.nextInt();
        temperature = new double[arraySize]; // create the array

        System.out.println("Enter " + arraySize + " temperatures: ");

        for (int i = 0; i < arraySize; i++) {
            temperature[i] = scanner.nextDouble();
            // add up to total
        }

        // calculate average

        System.out.println("The average temperature is " + average);
        System.out.println("The temperatures are: ");

        for (int i = 0; i < arraySize; i++) {
            // if else statement to check if above, below or is the average
        }
    }
}
