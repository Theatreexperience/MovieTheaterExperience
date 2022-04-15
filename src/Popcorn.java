public class Popcorn {
    private int quantity;
    private final double POPCORN_COST = 2.00;

    Popcorn(int quantity) {
        this.quantity = quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return quantity * POPCORN_COST;
    }
}
