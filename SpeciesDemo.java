public class SpeciesDemo {
    public static void main(String[] args) {
        Species klingonSpecies = new Species();
        Species earthSpecies = new Species();

        klingonSpecies.setSpecies("Klingon Ox", 10, 15);
        earthSpecies.setSpecies("Elephant", 14, 200);

        klingonSpecies.writeOutput();
        earthSpecies.writeOutput();

        System.out.println("\n\n");
        earthSpecies = klingonSpecies;
        earthSpecies.writeOutput();

        if (klingonSpecies == earthSpecies) {
            System.out.println("They are Equal when using ==");
        } else {
            System.out.println("They are not Equal when using ==");
        }

        if (klingonSpecies.equals(earthSpecies)) {
            System.out.println("They are Equal when using .equals");
        } else {
            System.out.println("They are not Equal when using .equals");
        }
    }
}
