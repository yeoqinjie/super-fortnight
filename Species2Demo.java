import java.util.*;


public class Species2Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name, name2;
        int population, population2, years;
        double growthRate, growthRate2;

        Species2 species = new Species2();
        System.out.print("Enter species 1 name: ");
        name = scanner.nextLine();
        System.out.print("Enter species 1 population: ");
        population = scanner.nextInt();
        System.out.print("Enter species 1 growth rate: ");
        growthRate = scanner.nextDouble();

        species.setSpecies(name);
        species.setPopulation(population);
        species.setGrowthRate(growthRate);

        Species2 species2 = new Species2();
        System.out.print("Enter species 2 name: ");
        name2 = scanner.next();
        System.out.print("Enter species 2 population: ");
        population2 = scanner.nextInt();
        System.out.print("Enter species 2 growth rate: ");
        growthRate2 = scanner.nextDouble();

        species2.setSpecies(name2);
        species2.setPopulation(population2);
        species2.setGrowthRate(growthRate2);

        System.out.println(species);
        System.out.println(species2);

        boolean sameSpecies = species.equals(species2);
        System.out.println("Are the two species the same? " + sameSpecies);
    }
}
