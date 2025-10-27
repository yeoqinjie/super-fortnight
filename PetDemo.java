public class PetDemo {
    public static void main(String[] args) {
        Pet dog, cat;
        dog = new Pet("Doggy");
        cat = new Pet("Kitty", 4, 30);

        Pet[] pets = new Pet[5];
        pets[0] = new Pet("Dog", 1, 10);
        pets[1] = new Pet("Cat", 2, 20);

        for (int i = 0; i < pets.length; i++) {
            System.out.println(pets[i]);
        }

        System.out.println(cat);
    }
}
