public class Drinks extends Product {

    private boolean isCarbonated;
    private boolean isAlcoholic;

    Drinks(String name, double price, double weight, boolean expired, boolean isCarbonated, boolean isAlcoholic) {
        super(name, price, weight, expired);
        this.isCarbonated = isCarbonated;
        this.isAlcoholic = isAlcoholic;
        setLabel("drink");
    }
    Drinks() {
        super();
        setLabel("drink");
    }

    public boolean isCarbonated() {
        return isCarbonated;
    }

    public void setCarbonated(boolean carbonated) {
        isCarbonated = carbonated;
    }

    public boolean isAlcoholic() {
        return isAlcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        isAlcoholic = alcoholic;
    }

    public String toString() {
        return super.toString() + ", carbonated: " + isCarbonated + ", alcoholic: " + isAlcoholic;
    }
}
