import java.util.*;

public class Species {
    private int population;
    private String species;
    private double growthRate;

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
    }

    public void writeOutput() {
        System.out.println("Species " + species + " has a population of " + population + " and its growth rate is " + growthRate);
    }

    public int predictPopulation(int years) {
        return (int) (population * growthRate * years);
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setSpecies(String species, int population, double growthRate) {
        this.species = species;
        this.population = population;
        this.growthRate = growthRate;
    }

    /**
     * @param growthRate
     * set growthRate to the value of growthRate
     */
    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }

    public int getPopulation() {
        return population;
    }

    public String getSpecies() {
        return species;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public boolean equals(Species otherObject) {
        if (otherObject.population == population &&
            otherObject.growthRate == growthRate &&
            otherObject.species.equalsIgnoreCase(species))
            return true;
        return false;
    }
}
