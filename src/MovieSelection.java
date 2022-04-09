import java.util.Scanner;

public class MovieSelection {
    public static String chooseMovie() {
        int movieChoice;
        String movie;

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
                    System.out.println("You chose Thor: Ragnorak");
                    movie = "Thor: Ragnorak";
                    break;

                case 2:
                    System.out.println("You chose Captain America: The Winter Soldier");
                    movie = "Captain America: The Winter Soldier";
                    break;

                case 3:
                    System.out.println("You chose Avengers: Endgame");
                    movie = "Avengers: Endgame";
                    break;

                case 4:
                    System.out.println("You chose Black Panther");
                    movie = "Black Panther";
                    break;

                case 5:
                    System.out.println("You chose Captain America: Civil War");
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
