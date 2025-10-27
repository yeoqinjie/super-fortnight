import java.util.*;

public class Species3Demo {
    public static void main(String[] args) {
        Species3 kangaroo, giraffe, kangaroo2; // declaration
        kangaroo = new Species3(); // default constructor
        giraffe = new Species3();
        kangaroo2 = new Species3();
        kangaroo.setSpecies(100, "Kangaroo", 1.2);
        giraffe.setSpecies(200, "Giraffe", 1.5);
        kangaroo2.setSpecies(100, "Kangaroo", 1.2);

        kangaroo.writeOutput();
        kangaroo2.writeOutput();

        System.out.println("Kangaroo == Kangaroo2?: " + (kangaroo==kangaroo2));
        System.out.println("Kangaroo.equals(Kangaroo2)?: " + kangaroo.equals(kangaroo2));
    }
}