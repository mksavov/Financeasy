public class Wheat extends Product {
    boolean isWholegrain;

    Wheat(String name, double price, double weight, boolean expired, boolean isWholegrain) {
        super(name, price, weight, expired);
        this.isWholegrain = isWholegrain;
    }

    public String toString() {
        return super.toString() + ", whole grain: " + isWholegrain;
    }
}
