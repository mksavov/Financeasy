public abstract class Product {
    private String name;
    private double price;
    private double weight;
    private boolean expired;
    private String label;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String toString() {
        return "Name: " + name + " price: " + price + "lv, weight: " + weight + "kg \n";
    }
}
