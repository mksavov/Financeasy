public abstract class Product {
    String name;
    double price;
    double weight;
    boolean expired;

    Product(String name, double price, double weight, boolean expired) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.expired = expired;
    }

    Product() {
        name = "Undefined";
        price = 0;
        weight = 0;
        expired = true;
    }

    public String toString() {
        return "Name: " + name + " price: " + price + "lv, weight: " + weight + "kg \n";
    }
}
