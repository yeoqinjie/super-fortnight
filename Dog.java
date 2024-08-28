public class Dog {
    String name;
    String breed;
    int age;

    public Dog(String name, String breed, int age) {

    }

    public int getAgeInHumanYears() {
        if (age <= 2)
            return age * 11;
        else
            return 22 + (age - 2) * 5;
    }

    public void writeOutput() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Age in calendar years: " + age);
        System.out.println("Age in human years: " + 	getAgeInHumanYears());
    }
    
}
