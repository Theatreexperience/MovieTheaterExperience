import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Receipt {
    public static void getReceipt() {
        Customer customer = new Customer(CustomerInformation.Name());
        Movie movie = new Movie(MovieInformation.selectMovie());
        Ticket ticket = new Ticket(TicketInformation.selectTickets());
        Popcorn popcorn = new Popcorn(PopcornInformation.selectPopcorn());
        Drink drink = new Drink(DrinkInformation.selectDrinks());

        Seating.getSeating();

        System.out.println();
        System.out.println();

        System.out.println("************************RECEIPT************************");

        System.out.println();

        System.out.println(customer.getName() + ", thank you for choosing the IS 147 Theater!");
        System.out.println();
        System.out.println("Movie: " + movie.getMovieName());
        System.out.println("Date: " + java.time.LocalDate.now());
        System.out.println("Time: 10:00 PM");


        System.out.println();
        System.out.println(ticket.getQuantity() + " Ticket(s)");

        if (popcorn.getQuantity() > 0)
            System.out.println(popcorn.getQuantity() + " Popcorn Bag(s)");
        if (drink.getQuantity() > 0)
            System.out.println(drink.getQuantity() + " Drink(s)");

        double totalCost = ticket.getCost() + popcorn.getCost() + drink.getCost();

        System.out.println();
        System.out.printf("TOTAL: $%.2f", totalCost);
        System.out.println();
        System.out.println();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        System.out.println(dtf.format(now));

        System.out.println("*******************************************************");

    }
}
