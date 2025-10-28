import people.*;

public class PeopleDemo {
    public static void main(String[] args) {
        Person[] persons = new Person[4]; // Creation of Array

        persons[0] = new Admin("Aaron", 5);
        persons[1] = new Student("Bob", 12345);
        persons[2] = new Undergraduate("Charlie", 23456, 2);
        persons[3] = new Graduate("Daniel", 34567, "Software Development");

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
            System.out.println("");
        }
    }
}
