public class Pet {
    private String name;
    private int age;
    private double weight;
    private double height;

    public Pet(String name, int age, double weight, double height) {
        setName(name);
        setAge(age);
        setHeight(height);
        setWeight(weight);
    }

    public Pet(String name) {
        setName(name);
        setAge(1);
        setWeight(0);
        setHeight(0);
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
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String toString() {
        return "Name: " + getName() + "\nAge: " + getAge() + "\nWeight: " + getWeight() + "\nHeight: " + getHeight() + "\n\n";
    }

    public void writeOutput() {
        System.out.println("Name: " + getName() + "\nAge: " + getAge() + "\nWeight: " + getWeight() + "\nHeight: " + getHeight() + "\n\n");
    }
}
