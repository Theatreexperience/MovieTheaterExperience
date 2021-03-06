public class Drink extends Consumable {
    public Drink() {
        super();
    }

    private final double DRINK_COST = 1.00;

    Drink(int quantity) {
        this.quantity = quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return quantity * DRINK_COST;
    }
}
