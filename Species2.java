import java.util.*;

public class Species2 {
    private String species;
    private int population;
    private double growthRate;

    // accessors 
    public String getSpecies() {
        return species;
    }

    public int getPopulation() {
        return population;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    // mutators
    public void setSpecies(String species) {
        this.species = species;
    }

    public void setPopulation(int population) {
        if (population < 0) {
            System.out.println("Population cannot be negative. Setting to 0.");
            this.population = 0;
        } else
            this.population = population;
    }

    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }

    public int predictPopulation(int years) {
        return (int) (population + population * growthRate * years / 100);
    }

    public String toString() {
        return "Species: " + species + "\n" +
               "Population: " + population + "\n" +
               "Growth Rate: " + growthRate;
    }

    public boolean equals(Species2 obj) {
        if (species.equals(obj.getSpecies()) &&
            population == obj.getPopulation() &&
            growthRate == obj.getGrowthRate()) {
            return true;
        } 
        
        return false;
    }
}   
