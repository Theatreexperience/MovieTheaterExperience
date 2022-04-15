import java.util.Scanner;

public class TicketInformation {
    public static int selectTickets() {
        int tickets;

        System.out.println();
        System.out.println("All movie tickets cost $5.00");

        while (true) {
            System.out.println("Enter the number of tickets: ");
            Scanner input = new Scanner(System.in);
            tickets = input.nextInt();

            if (tickets > 0)
                break;
            else {
                System.out.println("Please enter at least one ticket!");
                continue;
            }
        }

        return tickets;
    }
}
