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

        double totalCost = 0.0;

        Seating.getSeating();

        System.out.println();
        System.out.println();

        System.out.println("************************RECEIPT************************");

        System.out.println();

        String thankYou = "thank you for choosing the ";
        String IS147Theater = "IS 147 Theater!";

        System.out.println(customer.getName() + ", " + thankYou.concat(IS147Theater));

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

        if (popcorn.getCost() > 0 && drink.getCost() > 0)
            totalCost = sum(ticket.getCost(), popcorn.getCost(), drink.getCost());
        if (popcorn.getCost() > 0 && drink.getCost() == 0.0)
            totalCost = sum(ticket.getCost(), popcorn.getCost());
        if (popcorn.getCost() == 0.0 && drink.getCost() > 0)
            totalCost = sum(ticket.getCost(), drink.getCost());
        if (popcorn.getCost() == 0.0 && drink.getCost() == 0.0)
            totalCost = ticket.getCost();

        System.out.println();
        System.out.printf("TOTAL: $%.2f", totalCost);
        System.out.println();
        System.out.println();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        System.out.println(dtf.format(now));

        System.out.println("*******************************************************");

    }

    public static double sum(double x, double y, double z) {
        return x + y + z;
    }

    public static double sum(double x, double y) {
        return x + y;
    }

}

