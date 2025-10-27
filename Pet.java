public class Pet {
    private String name;
    private int age;
    private double weight;

    public Pet(String name, int age, double weight) {
        setName(name);
        setAge(age);
        setWeight(weight);
    }

    public Pet(String name) {
        setName(name);
        setAge(1);
        setWeight(0.1);
    }

    public Pet(int age) {
        setName("Unknown Name");
        setAge(age);
        setWeight(0.1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0)
            this.age = 1;
        else
            this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0)
            this.weight = 0.1;
        else
            this.weight = weight;
    }

    // toString is the default output method
    public String toString() {
        return "Name: " + getName() + "\nAge: " + getAge() + "\nWeight: " + getWeight() + "\n\n";
    }

    public void writeOutput() {
        System.out.println("Name: " + getName() + "\nAge: " + getAge() + "\nWeight: " + getWeight() + "\n\n");
    }
}
