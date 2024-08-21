import java.util.*;

class DoWhileDemo {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int number, count = 1;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        
        do {
            System.out.print(count + ",");
            count++;
        } while (count <= number);

        System.out.println("\nBuckle my shoe.");
    }
}