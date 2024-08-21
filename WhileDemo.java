import java.util.*;

class WhileDemo {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int number, count = 1;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        
        while (count <= number) {
            System.out.print(count + ",");
            count++;
        }

        System.out.println("\nBuckle my shoe.");
    }
}