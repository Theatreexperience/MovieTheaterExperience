import java.util.Scanner;

public class Drinks {
    public static void getDrinks() {
        char drinkChoice;
        double drinksCost = 0.0;

        int smallDrinkQuantity;
        int mediumDrinkQuantity;
        int largeDrinkQuantity;

        int totalSmallDrinkQuantity = 0;
        int totalMediumDrinkQuantity = 0;
        int totalLargeDrinkQuantity = 0;

        final double SMALL_DRINK = 1.00;
        final double MEDIUM_DRINK = 1.50;
        final double LARGE_DRINK = 2.00;

        Scanner input = new Scanner(System.in);

        System.out.println("Would you like any drinks (Y/N) ");
        drinkChoice = input.next().charAt(0);

        while (drinkChoice == 'Y' || drinkChoice == 'y') {
            System.out.println();
            System.out.println("Enter a number to select your choice.");
            System.out.println("1 - Small Drink ($1.00)");
            System.out.println("2 - Medium Drink ($1.50)");
            System.out.println("3 - Small Drink ($2.00)");
            System.out.println("4 - Quit");

            int drinkSelection = input.nextInt();


        }

    }
}
