import java.util.*;

public class MultipleBirths {
    public static void main(String[] args) {
        int numberOfBabies = 0;
        Scanner kb = new Scanner(System.in);
        String msg = "";

        System.out.println("Please enter number of babies: ");
        numberOfBabies = kb.nextInt();

        if (numberOfBabies < 1) {
            System.out.println("Please enter a number 1 or above.");
            System.exit(0);
        } 

        switch (numberOfBabies) {
            case 1, 2:
                msg = "Congratulations";
                break;
            case 3:
                msg = "Wow. Triplets";
                break;
            case 4, 5:
                msg = "Unbelievable";
                break;
            default:
                msg = "I don't believe you";
        }

        System.out.println(msg);
    }
}
