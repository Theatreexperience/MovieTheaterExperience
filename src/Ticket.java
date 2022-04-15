public class Ticket {
    private int quantity;
    private final double TICKET_COST = 5.00;

    Ticket(int quantity) {
        this.quantity = quantity;
    }

    public void setQuantity (int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return quantity * TICKET_COST;
    }
}
