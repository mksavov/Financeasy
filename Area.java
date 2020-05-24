import java.util.ArrayList;
import java.util.Scanner;

public class Area {
    ArrayList<Store> stores;

    Area(ArrayList<Store> stores) {
        this.stores = stores;
    }


    void AddStore(Store s1) {
        stores.add(s1);
    }

    public String toString() {
        return "All stores in the area: " + stores;
    }

    void RemoveStore(Store s1) {
        stores.remove(s1);
    }

    void RemoveAllStores() {
        stores.clear();
    }

    void CheapestStore() {
        int size = stores.size();
        int cnt = 0;
        double sum1 = stores.get(0).SumAllProducts();
        double sum2;
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size; j++) {
                sum2 = stores.get(j).SumAllProducts();
                if (sum1 > sum2) {
                    cnt = j;
                    sum1 = stores.get(i).SumAllProducts();
                }
            }
        }
        System.out.println("The cheapest store is:" + stores.get(cnt).toString());
    }

    void NearestStore() {
        int size = stores.size();
        int temp = 0;
        for (int i = 0; i < size; i++) {
            if (stores.get(temp).distance > stores.get(i).distance) {
                temp = i;
            }
        }
        System.out.println("The nearest store is: " + stores.get(temp).toString());
    }

    void CheapestProduct() {
        int size = stores.size();
        int selection;
        String product = "";
        int cnt = 0;
        int cnt1 = 0;
        Dairy d1;
        Scanner myObj = new Scanner(System.in);
        String input;
        do {
            System.out.println("Choose which product you want to check, type '0' to exit: 1 - dairy, 2 - drinks, 3 - meat, 4 - wheat");
            input = myObj.nextLine();
            selection = Integer.parseInt(input);
            if (selection == 1) {
                product = "dairy";
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < stores.get(i).products.size(); j++) {
                        if (stores.get(i).products.get(j) instanceof Dairy && stores.get(i).products.get(j).price < stores.get(cnt1).products.get(cnt).price) {
                            cnt = j;
                            cnt1 = i;
                        }
                    }
                }
            } else if (selection == 2) {
                product = "drink";
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < stores.get(i).products.size(); j++) {
                        if (stores.get(i).products.get(j) instanceof Drinks && stores.get(i).products.get(j).price < stores.get(cnt1).products.get(cnt).price) {
                            cnt = j;
                            cnt1 = i;
                        }
                    }
                }
            } else if (selection == 3) {
                product = "meat";
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < stores.get(i).products.size(); j++) {
                        if (stores.get(i).products.get(j) instanceof Meat && stores.get(i).products.get(j).price < stores.get(cnt1).products.get(cnt).price) {
                            cnt = j;
                            cnt1 = i;
                        }
                    }
                }
            } else if (selection == 4) {
                product = "wheat";
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < stores.get(i).products.size(); j++) {
                        if (stores.get(i).products.get(j) instanceof Wheat && stores.get(i).products.get(j).price < stores.get(cnt1).products.get(cnt).price) {
                            cnt = j;
                            cnt1 = i;
                        }
                    }
                }
            } else {
                System.out.println("Invalid input");
            }
            System.out.println("The cheapest " + product + " can be found in: " + stores.get(cnt1).toString());
        } while(selection != 0);
    }
}
