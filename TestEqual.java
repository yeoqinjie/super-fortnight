import java.util.*;

public class TestEqual {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        // System.out.println("array2 index 2: " + array2[2]);
        // array2[0] = 100;
        // for (int i = 0; i < array2.length; i++) {
        //     System.out.println(array2[i]);
        // }

        boolean eq = array1 == array2;

        // System.out.println("Using the == operator: " + eq);
        System.out.println("Using the equals method: " + equals(array1, array2));
    }

    public static boolean equals(int[] arr1, int[] arr2) {
        // check for same length
        if (arr1.length != arr2.length) {
            return false;
        }

        // check every array of the same index is equal
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}
