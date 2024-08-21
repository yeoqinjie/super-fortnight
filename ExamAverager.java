import java.util.*;

class ExamAverager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        double score = 0, total = 0;
        int count = 0;

        System.out.println("Want to average another exam?");
        System.out.print("Enter yes or no: ");
        answer = scanner.next();

        while (answer.equals("yes")) {
            System.out.println("Enter all the scores to be averaged.");
            System.out.println("Enter a negative number after you have entered all the scores.");

            score = scanner.nextDouble();
            while (score >= 0) {
                total += score;
                score = scanner.nextDouble();
                count++;
            }

            System.out.println("The average is " + total / count);

            total = 0;
            count = 0;
            System.out.println("Want to average another exam?");
            System.out.print("Enter yes or no: ");
            answer = scanner.next();
        }
    }
}