import java.util.*;

class BooleanDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0, total = 0;
        boolean isPositive = true;

        System.out.println("Enter non-negative numbers");
        System.out.println("Place a negative number at the end to serve as an end marker");
        number = scanner.nextInt();
        isPositive = number >= 0;

        while (isPositive) {
            total += number;
            number = scanner.nextInt();
            isPositive = number >= 0;
        }

        System.out.println("The sum of the numbers is " + total);
    }
}