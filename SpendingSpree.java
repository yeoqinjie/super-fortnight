import java.util.*;

class SpendingSpree {

    public static final int MAX_ITEM = 3;
    public static final double MAX_AMOUNT = 100;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double spend = 0, currentItemAmount = 0;

        System.out.println("You may buy up to " + MAX_ITEM + " items");
        System.out.println("costing no more than $" + MAX_AMOUNT);

        while (count < MAX_ITEM && spend < MAX_AMOUNT) {
            System.out.print("Enter cost of item #" + (count+1) + ": ");
            currentItemAmount = scanner.nextDouble();

            if (currentItemAmount <= MAX_AMOUNT - spend) {
                spend += currentItemAmount;
                count++;
                System.out.println("You may buy this item.");
                System.out.println("You spent $" + spend + " so far");

                if (count <= MAX_ITEM - 1 && spend < MAX_AMOUNT) {
                    System.out.println("You may buy up to " + (MAX_ITEM - count) + " items");
                } else if (count >= MAX_ITEM) {
                    System.out.println("You have bought " + MAX_ITEM + " items. You may not buy any more items.");
                } else if (spend >= MAX_AMOUNT) {
                    System.out.println("You are out of money");
                }
            } else {
                System.out.println("You may not buy this item, please choose another item.");
            }
        }

        System.out.println("You spent $" + spend + ", you are done shopping");

       
    }
}