import java.util.Scanner;

public class DrinkInformation {
    public static int selectDrinks() {
        int drinkQuantity;

        System.out.println();
        System.out.println("All drinks cost $1.00");
        while (true) {
            System.out.println("Enter the number of drinks:");
            Scanner input = new Scanner(System.in);
            drinkQuantity = input.nextInt();

            if (drinkQuantity == 0 || drinkQuantity > 0)
                break;
            else {
                System.out.println("Please enter a number greater than or equal to 0!");
                continue;
            }
        }

        return drinkQuantity;
    }
}
