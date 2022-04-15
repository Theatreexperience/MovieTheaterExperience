import java.util.Scanner;

public class PopcornInformation {
    public static int selectPopcorn() {
        int popcornQuantity;

        System.out.println();
        System.out.println("All popcorn bags cost $2.00");
        while (true) {
            System.out.println("Enter the number of popcorn bags:");
            Scanner input = new Scanner(System.in);
            popcornQuantity = input.nextInt();

            if (popcornQuantity >= 0)
                break;
            else {
                System.out.println("Please enter a number greater than or equal to 0!");
                continue;
            }
        }

        return popcornQuantity;
    }
}
