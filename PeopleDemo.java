import people.*;

public class PeopleDemo {
    public static void main(String[] args) {
        Person[] persons = new Person[4];
        persons[0] = new Student("Aaron", 12345);
        persons[1] = new Undergraduate("Bob", 1235, 2);
        persons[2] = new Admin("Calvin", 5);

        for (int i = 0; i < 2; i++) {
            System.out.println(persons[i]);
            System.out.println("\n");
        }
    }
}
