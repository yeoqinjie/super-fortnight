import java.util.*;

/*
 * Species3 is about the population and prediction of future population of different species.
 */
public class Species3 {
    private int population;
    private String speciesName;
    private double growthRate;

    /*
     * To predict the population after a certain number of years
     * Precondition: years need to be non-negative integer
     * Postcondition: the population after a certain number of years
     */
    public int predictPopulation(int years) {
        // int newPopulation = 0;
        // newPopulation = (int) (population * growthRate * 10);
        // return newPopulation;
        return (int) (population * growthRate * years);
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population > 0)
            this.population = population;
        else 
            this.population = 1;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }

    public void setSpecies(int population, String speciesName, double growthRate) {
        setGrowthRate(growthRate);
        setPopulation(population);
        setSpeciesName(speciesName);
    }

    public boolean equals(Species3 obj) {
        if (this.growthRate == obj.getGrowthRate() &&
            this.population == obj.getPopulation() &&
            this.speciesName.equalsIgnoreCase(obj.getSpeciesName())
        )
            return true;
        return false;
    }

    // This is not the official method 
    public void writeOutput() {
        System.out.println("Species " + getSpeciesName() + " has a population of " + 
            getPopulation() + " and its growth rate is " + getGrowthRate() + 
            " and the predicted population in 10 years will be " + predictPopulation(10));
    }
}
