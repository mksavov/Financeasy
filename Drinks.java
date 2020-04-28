public class Drinks extends Product {
    boolean isCarbonated;
    boolean isAlcoholic;

    Drinks(String name, double price, double weight, boolean expired, boolean isCarbonated, boolean isAlcoholic) {
        super(name, price, weight, expired);
        this.isCarbonated = isCarbonated;
        this.isAlcoholic = isAlcoholic;
    }
    public String toString() {
        return super.toString() + ", carbonated: " + isCarbonated + ", alcoholic: " + isAlcoholic;
    }
}
