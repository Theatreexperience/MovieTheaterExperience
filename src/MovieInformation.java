import java.util.Scanner;
import java.time.LocalDate;

public class MovieInformation {
    public static String selectMovie() {
        int movieChoice;
        String movie;

        System.out.println();

        System.out.println("All movies will be shown on " + java.time.LocalDate.now() + " at 10:00 PM");
        System.out.println();
        while (true) {
            System.out.println("Select a movie: ");
            System.out.println("1 - Thor: Ragnorak");
            System.out.println("2 - Captain America: The Winter Soldier");
            System.out.println("3 - Avengers: Endgame");
            System.out.println("4 - Black Panther");
            System.out.println("5 - Captain America: Civil War");

            Scanner input = new Scanner(System.in);
            movieChoice = input.nextInt();

            switch (movieChoice) {
                case 1:
                    movie = "Thor: Ragnorak";
                    break;

                case 2:
                    movie = "Captain America: The Winter Soldier";
                    break;

                case 3:
                    movie = "Avengers: Endgame";
                    break;

                case 4:
                    movie = "Black Panther";
                    break;

                case 5:
                    movie = "Captain America: Civil War";
                    break;

                default:
                    System.out.println("Sorry, that is not a choice.");
                    System.out.println();
                    continue;
            }
            break;
        }

        return movie;

    }
}
