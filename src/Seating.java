import java.util.Scanner;

public class Seating {
    public static void getSeating() {
        final int NUM_ROW = 6;
        final int NUM_COLUMN = 10;
        int row;
        int column;
        int randomRow;
        int randomColumn;


        char[][] movieSeating = new char[NUM_ROW][NUM_COLUMN];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < movieSeating.length; i++)
            for (int j = 0; j < movieSeating[i].length; j++)
                movieSeating[i][j] = 'O';

        randomRow = (int)(Math.random() * 6);
        randomColumn = (int)(Math.random() * 10);

        movieSeating[randomRow][randomColumn] = 'X';

        System.out.println();
        System.out.println("Here are the available seats.");
        System.out.println("O means available. X means taken.");
        System.out.println();







        System.out.println("    | SCREEN |   ");

        for (int i = 0; i < movieSeating.length; i++) {
            for (int j = 0; j < movieSeating[i].length; j++) {
                System.out.print(movieSeating[i][j] + " ");
            }
            System.out.println();
        }


        // For Loop based on number of tickets

        do {

             System.out.println();
             System.out.print("What row would you like? (Enter a number 1-6) ");
             row = input.nextInt();

             while (row < 1 || row > 6) {
                System.out.println("Sorry, that is not a valid row.");
                System.out.println("Please enter a row number 1-6");
                row = input.nextInt();
             }

             System.out.print("What column would you like? (Enter a number 1-10) ");
             column = input.nextInt();

             while (column < 1 || column > 10) {
                 System.out.println("Sorry, that is not a valid column.");
                 System.out.println("Please enter a column number 1-10");
                 column = input.nextInt();
             }
            if (movieSeating[row - 1][column - 1] == 'O')
                break;

            System.out.println("Sorry, that seat is taken");
        }   while (true);



        movieSeating[row - 1][column - 1] = 'X';

        System.out.println("    | SCREEN |   ");

        for (int i = 0; i < movieSeating.length; i++) {
            for (int j = 0; j < movieSeating[i].length; j++) {
                System.out.print(movieSeating[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Your seat is row " + row + " and column " + column);
    }
}
