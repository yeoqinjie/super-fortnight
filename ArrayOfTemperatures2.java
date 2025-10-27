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

        for (int i = 0; i < temperature.length; i++) {
            temperature[i] = scanner.nextDouble();
            // add up to total
            total += temperature[i];
        }

        // calculate average
        average = total / arraySize;

        System.out.println("The average temperature is " + average);
        System.out.println("The temperatures are: ");

        for (int i = 0; i < temperature.length; i++) {
            // if else statement to check if above, below or is the average
            // System.out.print(temperature[i]);
            // if (temperature[i] > average) {
            //     System.out.print(" above ");
            // } else {
            //     System.out.print(" below ");
            // }
            // System.out.println("average");

            System.out.println(temperature[i] + temperature[i]>average ? " above " : " below " + " average");
        }
    }
}
