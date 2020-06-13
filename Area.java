import java.util.ArrayList;
import java.util.Scanner;

public class Area implements storeFunctions{

    ArrayList<Store> stores;

    Area(ArrayList<Store> stores) {
        this.stores = stores;
    }


    void AddStore(Store store) {
        stores.add(store);
    }

    public String toString() {
        return "All stores in the area: " + stores;
    }

    void RemoveStore(Store store) {
        stores.remove(store);
    }

    void RemoveAllStores() {
        stores.clear();
    }

    public void CheapestStore() {
        int StoresSize = stores.size();
        int CheapestStoreIndex = 0;
        double AveragePricesFirstStore = stores.get(0).averagePrice();
        double AveragePricesSecondStore;
        for (int i = 0; i < StoresSize; i++) {
            AveragePricesSecondStore = stores.get(i).averagePrice();
            if (AveragePricesFirstStore > AveragePricesSecondStore) {
                CheapestStoreIndex = i;
            }
        }
        System.out.println("The cheapest store is:" + stores.get(CheapestStoreIndex).toString());
    }

    public void NearestStore() {
        int StoresSize = stores.size();
        int FirstNearestStoreIndex = 1;
        int SecondNearestStoreIndex = 1;
        int FirstStoreDistance = stores.get(FirstNearestStoreIndex).getDistance();
        int SecondStoreDistance = stores.get(SecondNearestStoreIndex).getDistance();
        for (SecondNearestStoreIndex = 0; SecondNearestStoreIndex < StoresSize; SecondNearestStoreIndex++) {
            if (FirstStoreDistance > SecondStoreDistance) {
                FirstNearestStoreIndex = SecondNearestStoreIndex;
            }
        }
        System.out.println("The nearest store is: " + stores.get(FirstNearestStoreIndex).toString());
    }

    public int findCheapestProductIndex(String productName) {
        int StoresSize = stores.size();
        double FirstStoreProductsPrice;
        double SecondStoreProductsPrice;
        int i = 0;
        int j;
        int ProductsPriceIndex = 0;
        int StoresIndex = 0;
        int ProductsSize = stores.get(i).getProducts().size();
        for (i = 0; i < StoresSize; i++) {
            for (j = 0; j < ProductsSize; j++) {
                if (stores.get(i).getProducts().get(j).getLabel().equals(productName) && stores.get(StoresIndex).getProducts().get(ProductsPriceIndex).getLabel().equals(productName)) {
                    FirstStoreProductsPrice = stores.get(i).getProducts().get(j).getPrice();
                    SecondStoreProductsPrice = stores.get(StoresIndex).getProducts().get(ProductsPriceIndex).getPrice();
                    if (FirstStoreProductsPrice < SecondStoreProductsPrice) {
                        StoresIndex = i;
                        ProductsPriceIndex = j;
                    }
                }
            }
        }
        return StoresIndex;
    }

    public void CheapestProduct() {
        int selection = 0;
        int storeIndex = 0;
        String CheapestProduct = "";

        Scanner myObj = new Scanner(System.in);
        String input;

        do {
            System.out.println("Choose which product you want to check, type '0' to exit: 1 - dairy, 2 - drink, 3 - meat, 4 - wheat");
            input = myObj.nextLine();
            if (Financeasy.TryParseInt(input)) {
                selection = Integer.parseInt(input);
                if (selection == 1) {
                    CheapestProduct = "dairy";
                    storeIndex = findCheapestProductIndex(CheapestProduct);
                } else if (selection == 2) {
                    CheapestProduct = "drink";
                    storeIndex = findCheapestProductIndex(CheapestProduct);
                } else if (selection == 3) {
                    CheapestProduct = "meat";
                    storeIndex = findCheapestProductIndex(CheapestProduct);
                } else if (selection == 4) {
                    CheapestProduct = "wheat";
                    storeIndex = findCheapestProductIndex(CheapestProduct);
                }
                else {
                    System.out.println("Invalid input");
                }
                System.out.println("The cheapest " + CheapestProduct + " can be found in: " + stores.get(storeIndex).toString());
            }
        } while (selection != 0);
    }
}