import java.util.Scanner;

public class Information {
    public static void getInformation() {
        char choice;
        double cost = 0.0;

        int smallPopcornQuantity;
        int mediumPopcornQuantity;
        int largePopcornQuantity;

        int smallDrinkQuantity;
        int mediumDrinkQuantity;
        int largeDrinkQuantity;

        int totalSmallPopcornQuantity = 0;
        int totalMediumPopcornQuantity = 0;
        int totalLargePopcornQuantity = 0;

        int totalSmallDrinkQuantity = 0;
        int totalMediumDrinkQuantity = 0;
        int totalLargeDrinkQuantity = 0;

        final double SMALL_POPCORN = 4.00;
        final double MEDIUM_POPCORN = 4.50;
        final double LARGE_POPCORN = 5.00;

        final double SMALL_DRINK = 1.00;
        final double MEDIUM_DRINK = 1.50;
        final double LARGE_DRINK = 2.00;

        double totalSmallPopcornCost;
        double totalMediumPopcornCost;
        double totalLargePopcornCost;

        double totalSmallDrinkCost;
        double totalMediumDrinkCost;
        double totalLargeDrinkCost;

        Scanner input = new Scanner(System.in);

       //                                           POPCORN

        System.out.println("Would you like any popcorn? (Y/N) ");
        choice = input.next().charAt(0);

        while (choice == 'Y' || choice == 'y') {
            System.out.println();
            System.out.println("Enter a number to select your choice.");
            System.out.println("1 - Small Popcorn ($4.00)");
            System.out.println("2 - Medium Popcorn ($4.50)");
            System.out.println("3 - Large Popcorn ($5.00)");
            System.out.println("4 - Quit");

            int selection = input.nextInt();

            switch (selection) {
                case 1:
                    System.out.println("How many Small Popcorn? ");
                    smallPopcornQuantity = input.nextInt();

                    while (smallPopcornQuantity < 0) {
                        System.out.println("Quantity must be greater than or equal to 0");
                        System.out.println();
                        System.out.println("How many Small Popcorn? ");
                        smallPopcornQuantity = input.nextInt();
                    }

                    cost += SMALL_POPCORN * smallPopcornQuantity;
                    totalSmallPopcornQuantity += smallPopcornQuantity;

                    System.out.println("Would you like more popcorn? (Y/N)" );
                    choice = input.next().charAt(0);
                    break;

                case 2:

                    System.out.println("How many Medium Popcorn? ");
                    mediumPopcornQuantity = input.nextInt();

                    while (mediumPopcornQuantity < 0) {
                        System.out.println("Quantity must be greater than or equal to 0");
                        System.out.println();
                        System.out.println("How many Medium Popcorn? ");
                        mediumPopcornQuantity = input.nextInt();
                    }

                    cost += MEDIUM_POPCORN * mediumPopcornQuantity;
                    totalMediumPopcornQuantity += mediumPopcornQuantity;

                    System.out.println("Would you like more popcorn? (Y/N)" );
                    choice = input.next().charAt(0);
                    break;

                case 3:
                    System.out.println("How many Large Popcorn? ");
                    largePopcornQuantity = input.nextInt();

                    while (largePopcornQuantity < 0) {
                        System.out.println("Quantity must be greater than or equal to 0");
                        System.out.println();
                        System.out.println("How many Large Popcorn? ");
                        largePopcornQuantity = input.nextInt();
                    }

                    cost += LARGE_POPCORN * largePopcornQuantity;
                    totalLargePopcornQuantity += largePopcornQuantity;

                    System.out.println("Would you like more popcorn? (Y/N)" );
                    choice = input.next().charAt(0);
                    break;

                case 4:
                    choice = 'N';
                    break;

                default:
                    System.out.println("Please choose an option 1-4");
            }


        }

        totalSmallPopcornCost = totalSmallPopcornQuantity * SMALL_POPCORN;
        totalMediumPopcornCost = totalMediumPopcornQuantity * MEDIUM_POPCORN;
        totalLargePopcornCost = totalLargePopcornQuantity * LARGE_POPCORN;

      //                                     DRINKS

        System.out.println("Would you like any drinks? (Y/N) ");
        choice = input.next().charAt(0);

        while (choice == 'Y' || choice == 'y') {
            System.out.println();
            System.out.println("Enter a number to select your choice.");
            System.out.println("1 - Small Drink ($1.00)");
            System.out.println("2 - Medium Drink ($1.50)");
            System.out.println("3 - Large Drink ($2.00)");
            System.out.println("4 - Quit");

            int selection = input.nextInt();

            switch (selection) {
                case 1:
                    System.out.println("How many Small Drinks? ");
                    smallDrinkQuantity = input.nextInt();

                    while (smallDrinkQuantity < 0) {
                        System.out.println("Quantity must be greater than or equal to 0");
                        System.out.println();
                        System.out.println("How many Small Drinks? ");
                        smallDrinkQuantity = input.nextInt();
                    }

                    cost += SMALL_DRINK * smallDrinkQuantity;
                    totalSmallDrinkQuantity += smallDrinkQuantity;

                    System.out.println("Would you like more drinks? (Y/N)" );
                    choice = input.next().charAt(0);
                    break;

                case 2:

                    System.out.println("How many Medium Drinks? ");
                    mediumDrinkQuantity = input.nextInt();

                    while (mediumDrinkQuantity < 0) {
                        System.out.println("Quantity must be greater than or equal to 0");
                        System.out.println();
                        System.out.println("How many Medium Drinks? ");
                        mediumDrinkQuantity = input.nextInt();
                    }

                    cost += MEDIUM_DRINK * mediumDrinkQuantity;
                    totalMediumDrinkQuantity += mediumDrinkQuantity;

                    System.out.println("Would you like more drinks? (Y/N)" );
                    choice = input.next().charAt(0);
                    break;

                case 3:
                    System.out.println("How many Large Drinks? ");
                    largeDrinkQuantity = input.nextInt();

                    while (largeDrinkQuantity < 0) {
                        System.out.println("Quantity must be greater than or equal to 0");
                        System.out.println();
                        System.out.println("Quantity of Large Popcorn? ");
                        largeDrinkQuantity = input.nextInt();
                    }

                    cost += LARGE_DRINK * largeDrinkQuantity;
                    totalLargeDrinkQuantity += largeDrinkQuantity;

                    System.out.println("Would you like more drinks? (Y/N)" );
                    choice = input.next().charAt(0);
                    break;

                case 4:
                    choice = 'N';
                    break;

                default:
                    System.out.println("Please choose an option 1-4");
            }


        }

        totalSmallDrinkCost = totalSmallDrinkQuantity * SMALL_DRINK;
        totalMediumDrinkCost = totalMediumDrinkQuantity * MEDIUM_DRINK;
        totalLargeDrinkCost = totalLargeDrinkQuantity * LARGE_DRINK;





















        System.out.println("************* RECEIPT ************* ");
        if (totalSmallPopcornQuantity > 0)
            System.out.println(totalSmallPopcornQuantity + " Small Popcorn - $"
                    + String.format("%.2f", totalSmallPopcornCost));

        if (totalMediumPopcornQuantity > 0)
            System.out.println(totalMediumPopcornQuantity + " Medium Popcorn - $"
                    + String.format("%.2f", totalMediumPopcornCost));

        if (totalLargePopcornQuantity > 0)
            System.out.println(totalLargePopcornQuantity + " Large Popcorn - $"
                    + String.format("%.2f", totalLargePopcornCost));

        //                              DRINKS

        if (totalSmallDrinkQuantity > 0)
            System.out.println(totalSmallDrinkQuantity + " Small Drink(s) - $"
                    + String.format("%.2f", totalSmallDrinkCost));

        if (totalMediumDrinkQuantity > 0)
            System.out.println(totalMediumPopcornQuantity + " Medium Drink(s) - $"
                    + String.format("%.2f", totalMediumDrinkCost));

        if (totalLargeDrinkQuantity > 0)
            System.out.println(totalLargeDrinkQuantity + " Large Drink(s) - $"
                    + String.format("%.2f", totalLargeDrinkCost));


















        System.out.println();
        System.out.println("TOTAL COST: " + "$" + String.format("%.2f", cost));
        System.out.println("-----------------------------------");

    }


}


