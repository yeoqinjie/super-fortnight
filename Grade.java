import java.util.*;

class Grade {
    public static void main(String[] args) {
        // Objects and variables that are used in the program
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        String grade = "";

        // Prompt user to key in their score
        System.out.println("Enter a score between 0 and 100: ");
        score = scanner.nextInt();

        // Evaluate the score and assign a grade
        if (score > 90) {
            grade = "A";
        } else if (score > 80) {
            grade = "B";
        } else if (score > 70) {
            grade = "C";
        } else if (score > 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Your grade is " + grade + ".");
    }
}
