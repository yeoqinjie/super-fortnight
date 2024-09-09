import java.util.*;

public class GotMilk {
    public static void main(String[] args) {
        int donuts = 0, milk = 0;
        double share = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of donuts: ");
        donuts = scanner.nextInt();

        System.out.print("Enter number of glasses of milk: ");
        milk = scanner.nextInt();

        if (milk == 0) {
            System.out.println("No milk!\nGo buy some milk");
        } else {
            share = (double) donuts / milk;
            System.out.println("You have " + share + " donuts per glass of milk");
        }

        System.out.println("End of program");
    }
}