import java.util.*;

public class MoneyDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Money money;
        double amount = 0;
        System.out.print("Enter your current savings: $");
        amount = scanner.nextDouble();

        money = new Money(amount);

        System.out.println("\nIf you double that, you will have $" + money.doubleMoney());
        System.out.println("If you triple that, you will have $" + money.tripleMoney());
    }
    
}
