import java.util.*;

class BugTrouble {

    public static final double GROWTH_RATE = 0.95;
    public static final double ONE_BUG_VOLUME = 0.002;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double houseVolume = 0, totalBugVolume = 0, newBugVolume = 0;
        int startPopulation = 0, countWeeks = 0, population = 0, newBugs = 0;

        System.out.print("Enter the total volume of your house in cubic feet: ");
        houseVolume = scanner.nextDouble();
        System.out.print("Enter the estimated number of roaches in your house: ");
        startPopulation = scanner.nextInt();

        population = startPopulation;
        totalBugVolume = startPopulation * ONE_BUG_VOLUME;

        while (totalBugVolume < houseVolume) {
            newBugs = (int) (population * GROWTH_RATE);
            population += newBugs;
            newBugVolume = newBugs * ONE_BUG_VOLUME;
            totalBugVolume += newBugVolume;
            countWeeks++;
        }

        System.out.println("Starting with a roach population of " + startPopulation);
        System.out.println("and a house with a volume of " + houseVolume + " cubic feet,");
        System.out.println("after " + countWeeks + " weeks,");
        System.out.println("the house will be filled with " + population + " roaches.");
        System.out.println("They will fill a volume of " + totalBugVolume + " cubic feet.");
        System.out.println("Better call Debugging Experts Inc.");
    }
}