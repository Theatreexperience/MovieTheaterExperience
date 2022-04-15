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
        System.out.println("SEATING IS ON A FIRST-COME, FIRST-SERVE BASIS");
        System.out.println("O means seat WORKS. X means seat IS BROKEN.");
        System.out.println();

        System.out.println("    | SCREEN |   ");

        for (int i = 0; i < movieSeating.length; i++) {
            for (int j = 0; j < movieSeating[i].length; j++) {
                System.out.print(movieSeating[i][j] + " ");
            }
            System.out.println();
        }
    }
}
