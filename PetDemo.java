public class PetDemo {
    public static void main(String[] args) {
        Pet dog, cat;
        dog = new Pet("Doggy");
        cat = new Pet("Kitty", 4, 1250, 30);

        dog.setAge(5);
        dog.setHeight(40);
        dog.setWeight(2000);
        System.out.println(dog);
    }
}
