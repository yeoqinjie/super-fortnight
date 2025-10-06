import java.util.Scanner;

public class Student {
    // Data attributes
    private String name;
    private String sid;
    private String contact;
    private double gpa;

    // Constructor
    public Student(String name, String sid, String contact, double gpa) {
        this.name = name;
        this.sid = sid;
        this.contact = contact;
        this.gpa = gpa;
    }

    // Update contact
    public void updateContact(String newContact) {
        this.contact = newContact;
    }

    // Check GPA eligibility
    public boolean isEligible() {
        return gpa >= 3.0;
    }

    // Display student info
    public void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + sid);
        System.out.println("Contact: " + contact);
        System.out.println("GPA: " + gpa);
        System.out.println("Eligibility: " + (isEligible() ? "Eligible" : "Not Eligible"));
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get student details from user
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student ID: ");
        String sid = scanner.nextLine();

        System.out.print("Enter contact number: ");
        String contact = scanner.nextLine();

        System.out.print("Enter GPA (0.0 - 4.0): ");
        double gpa = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        // Create Student object
        Student student = new Student(name, sid, contact, gpa);

        // Show initial info
        student.displayDetails();

        // Ask to update contact
        System.out.print("\nEnter new contact number to update: ");
        String newContact = scanner.nextLine();
        student.updateContact(newContact);

        // Show updated info
        student.displayDetails();

        scanner.close();
    }
}