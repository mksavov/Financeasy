public class Dairy extends Product {
    private float fat;


    Dairy(String name, double price, double weight, boolean expired, float fat) {
        super(name, price, weight, expired);
        this.fat = fat;
        setLabel("dairy");
    }
    Dairy () {
        super();
        setLabel("dairy");
    }

    public float getFat() {
        return fat;
    }

    public void setFat(float fat) {
        this.fat = fat;
    }

    public String toString() {
        return super.toString() + ", fat %: " + fat + "%";
    }
}
