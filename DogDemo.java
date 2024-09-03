public class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.age = 1;
        dog.breed = "Husky";
        dog.name = "Doggy";

        dog.writeOutput();

        Dog dog2 = new Dog();
        dog2.age = 5;
        dog2.breed = "Golden Retriever";
        dog2.name = "Diggy";

        dog2.writeOutput();
    }
}
