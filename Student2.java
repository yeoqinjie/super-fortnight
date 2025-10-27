import java.util.Scanner;

public class Student2 {
    // Data attributes
    private String name;
    private String sid;
    private String contact;
    private double gpa;

    // Constructor
    public Student2(String name, String sid, String contact, double gpa) {
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
}