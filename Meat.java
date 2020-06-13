public class Meat extends Product {
    private String type;

    Meat(String name, double price, double weight, boolean expired, String type) {
        super(name, price, weight, expired);
        this.type = type;
        setLabel("meat");
    }
    Meat () {
        super();
        setLabel("meat");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return super.toString() + ", type of meat: " + type;
    }
}
