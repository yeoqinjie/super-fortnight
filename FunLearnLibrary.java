import java.util.Scanner;

public class FunLearnLibrary {
    // Book class with data attributes, constructor, and methods
    static class Book {
        String title;
        String author;
        String isbn;
        int copies;

        // Constructor to initialize the attributes
        public Book(String title, String author, String isbn, int copies) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
            this.copies = copies;
        }

        // Method to borrow a book
        public void borrowBook() {
            if (copies > 0) {
                copies--;
                System.out.println("Book borrowed successfully. Copies left: " + copies);
            } else {
                System.out.println("Book not available.");
            }
        }

        // Method to return a book
        public void returnBook() {
            copies++;
            System.out.println("Book returned successfully. Copies available: " + copies);
        }

        // Method to display book details
        public void displayDetails() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
            System.out.println("Copies Available: " + copies);
            System.out.println("----------------------------");
        }
    }

    public static void main(String[] args) {
        // Create 3 Book objects
        Book book1 = new Book("Java Programming", "John Doe", "123-456-789", 3);
        Book book2 = new Book("Data Structures", "Jane Smith", "987-654-321", 5);
        Book book3 = new Book("Algorithms", "Alice Brown", "456-789-123", 2);

        // Scanner to read user input
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display book details
            System.out.println("Welcome to the FunLearn Library. Please choose an option:");
            System.out.println("1. View Book Details");
            System.out.println("2. Borrow a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // View Book Details
                    System.out.println("Select a book to view details:");
                    System.out.println("1. Java Programming");
                    System.out.println("2. Data Structures");
                    System.out.println("3. Algorithms");
                    System.out.print("Enter your choice: ");
                    int bookChoice = scanner.nextInt();

                    switch (bookChoice) {
                        case 1:
                            book1.displayDetails();
                            break;
                        case 2:
                            book2.displayDetails();
                            break;
                        case 3:
                            book3.displayDetails();
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                    break;

                case 2:
                    // Borrow a Book
                    System.out.println("Select a book to borrow:");
                    System.out.println("1. Java Programming");
                    System.out.println("2. Data Structures");
                    System.out.println("3. Algorithms");
                    System.out.print("Enter your choice: ");
                    int borrowChoice = scanner.nextInt();

                    switch (borrowChoice) {
                        case 1:
                            book1.borrowBook();
                            break;
                        case 2:
                            book2.borrowBook();
                            break;
                        case 3:
                            book3.borrowBook();
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                    break;

                case 3:
                    // Return a Book
                    System.out.println("Select a book to return:");
                    System.out.println("1. Java Programming");
                    System.out.println("2. Data Structures");
                    System.out.println("3. Algorithms");
                    System.out.print("Enter your choice: ");
                    int returnChoice = scanner.nextInt();

                    switch (returnChoice) {
                        case 1:
                            book1.returnBook();
                            break;
                        case 2:
                            book2.returnBook();
                            break;
                        case 3:
                            book3.returnBook();
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using FunLearn Library.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        scanner.close();
    }
}