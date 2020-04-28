import java.util.ArrayList;

public class Store{
    String name;
    ArrayList<Product> products;
    int distance;

    Store (String name, ArrayList<Product> products, int distance) {
        this.name = name;
        this.products = products;
        this.distance = distance;
    }
    Store() {
        name = "Undefined";
        products.clear();
        distance = 0;
    }

    void AddProduct(Product p1) {
        products.add(p1);
    }
    public String toString() {
        return "Name: " + name + ", distance: " + distance + "m " + ", products: " + products;
    }
    void RemoveProduct (Product p1) {
        products.remove(p1);
    }
    void RemoveAllProducts() {
        products.clear();
    }

}
