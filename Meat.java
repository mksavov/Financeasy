public class Meat extends Product {
    String type;

    Meat(String name, double price, double weight, boolean expired, String type) {
        super(name, price, weight, expired);
        this.type = type;
    }
    public String toString() {
        return super.toString() + ", type of meat: " + type;
    }
}
