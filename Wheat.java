public class Wheat extends Product {
    private boolean isWholegrain;

    Wheat(String name, double price, double weight, boolean expired, boolean isWholegrain) {
        super(name, price, weight, expired);
        this.isWholegrain = isWholegrain;
        setLabel("wheat");
    }
    Wheat () {
        super();
        setLabel("wheat");
    }

    public boolean isWholegrain() {
        return isWholegrain;
    }

    public void setWholegrain(boolean wholegrain) {
        isWholegrain = wholegrain;
    }

    public String toString() {
        return super.toString() + ", whole grain: " + isWholegrain;
    }
}
