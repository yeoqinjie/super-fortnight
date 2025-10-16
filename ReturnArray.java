import java.util.*;

public class ReturnArray {
    public static void main(String[] args) {
        int[] array = new int[7];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter " + array.length + " number: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        array = multiply(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Index " + i + ": " + array[i]);
        }        
    }

    public static int[] multiply(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
        return array;
    }
}
