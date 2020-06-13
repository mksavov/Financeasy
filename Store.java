import java.util.ArrayList;

public class Store implements productsFunctions {

    private String name;
    private ArrayList<Product> products;
    private int distance;

    Store(String name, ArrayList<Product> products, int distance) {
        this.name = name;
        this.products = products;
        this.distance = distance;
    }

    Store() {
        name = "Undefined";
        distance = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean ContainsProduct(Product product) {
        boolean flag = false;
        for (Product value : products) {
            if (value.getLabel().equals(product.getLabel())) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public void AddProduct(Product p1) {
        products.add(p1);
    }

    public String toString() {
        return "Name: " + name + ", distance: " + distance + "m " + ", products: " + products;
    }

    public void RemoveProduct(Product p1) {
        products.remove(p1);
    }

    public void RemoveAllProducts() {
        products.clear();
    }


    public double averagePrice() {
        int size = products.size();
        double sum = 0;
        for (Product product : products) {
            sum += product.getPrice();
        }
        return sum / size;
    }


}
