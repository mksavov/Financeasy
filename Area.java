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
        int cnt = 0;
        int cnt1 = 0;
        for (int i = 0; i < stores.size(); i++) {
            for (int j = 0; j < stores.get(i).products.size(); j++) {
                if (stores.get(i).products.get(j).price < stores.get(cnt1).products.get(cnt).price) {
                    cnt = j;
                    cnt1 = i;
                }
            }
        }
        System.out.println("The cheapest store is:" + stores.get(cnt1).toString());
    }

    void NearestStore() {
        int temp = 0;
        for (int i = 0; i < stores.size(); i++) {
            if (stores.get(temp).distance > stores.get(i).distance) {
                temp = i;
            }
        }
        System.out.println("The nearest store is: " + stores.get(temp).toString());
    }

    void CheapestProduct() {
        int cnt = 0;
        int cnt1 = 0;
        Dairy d1;
        Scanner myObj = new Scanner(System.in);
        String input;

        System.out.println("Choose which product you want to check: dairy, drinks, meat, wheat");
        input = myObj.nextLine();
        if (input.equals("dairy")) {
            for (int i = 0; i < stores.size(); i++) {
                for (int j = 0; j < stores.get(i).products.size(); j++) {
                    if (stores.get(i).products.get(j)instanceof Dairy && stores.get(i).products.get(j).price < stores.get(cnt1).products.get(cnt).price) {
                        cnt = j;
                        cnt1 = i;
                    }
                }
            }
        }
        else if (input.equals("drinks")) {
            for (int i = 0; i < stores.size(); i++) {
                for (int j = 0; j < stores.get(i).products.size(); j++) {
                    if (stores.get(i).products.get(j)instanceof Drinks && stores.get(i).products.get(j).price < stores.get(cnt1).products.get(cnt).price) {
                        cnt = j;
                        cnt1 = i;
                    }
                }
            }
        }
        if (input.equals("meat")) {
            for (int i = 0; i < stores.size(); i++) {
                for (int j = 0; j < stores.get(i).products.size(); j++) {
                    if (stores.get(i).products.get(j)instanceof Meat && stores.get(i).products.get(j).price < stores.get(cnt1).products.get(cnt).price) {
                        cnt = j;
                        cnt1 = i;
                    }
                }
            }
        }
        if (input.equals("wheat")) {
            for (int i = 0; i < stores.size(); i++) {
                for (int j = 0; j < stores.get(i).products.size(); j++) {
                    if (stores.get(i).products.get(j)instanceof Wheat && stores.get(i).products.get(j).price < stores.get(cnt1).products.get(cnt).price) {
                        cnt = j;
                        cnt1 = i;
                    }
                }
            }
        }
        System.out.println("The cheapest " + input + " can be found in: " + stores.get(cnt1).toString());
    }
}
