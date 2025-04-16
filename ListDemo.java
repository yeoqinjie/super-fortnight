import java.util.*;

public class ListDemo {
    public static final int SIZE = 3;

    public static void main(String[] args) {
        String[] list;
        list = new String[SIZE];
        Scanner scanner = new Scanner(System.in);
        int pointer = 0;
        boolean addItemSuccess = false;

        // Ask user to enter item one by one
        while (pointer < SIZE) {
            System.out.print("Enter next item: ");
            String item = scanner.nextLine();
            addItemSuccess = addList(list, item, pointer);
            if (addItemSuccess) {
                pointer++;
            }
        }

        System.out.println("You have reached the maximum number of items.");
        System.out.println("You have entered the following items:");

        for (int i = 0; i < list.length; i++) {
            System.out.println("Item " + (i + 1) + ": " + list[i]);
        }
    }

    public static boolean addList(String[] list, String item, int pointer) {
        for (int i = 0; i < list.length; i++) {
            if (item.equalsIgnoreCase(list[i])) {
                return false;
            }
        }
       
        list[pointer] = item;
        return true;
    }
}
