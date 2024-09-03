public class Pet {
    private String name;
    private int age;
    private double weight;

    public Pet() {

    }

    public Pet(String name, int age, double weight) {

    }

    public Pet(String name) {

    }

    public Pet(double weight) {
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }
}
