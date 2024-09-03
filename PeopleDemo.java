import people.*;

public class PeopleDemo {
    public static void main(String[] args) {
        Person[] persons = new Person[4];
        persons[0] = new Student("Aaron", 1234);
        persons[1] = new Undergraduate("Bob", 1235, 2);

        for (int i = 0; i < 2; i++) {
            System.out.println(persons[i]);
            System.out.println("\n");
        }
    }
}
