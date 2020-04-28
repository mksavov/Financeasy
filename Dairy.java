public class Dairy extends Product {
    float fat;
    Dairy (String name, double price, double weight, boolean expired, float fat) {
        super(name, price, weight, expired);
        this.fat = fat;
    }
    public String toString() {
        return super.toString() + ", fat %: " + fat + "%";
    }
}
