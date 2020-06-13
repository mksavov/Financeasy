import java.util.ArrayList;
import java.util.Scanner;

public class Financeasy {
    public static boolean TryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {

        ArrayList<Product> FantastikoProducts = new ArrayList<>();
        Dairy OlympusMilk = new Dairy("Olympus", 4, 3, false, 1.7f);
        Dairy LacrimaCheese = new Dairy("Lacrima", 10, 0.4, false, 4);
        Drinks CocaCola = new Drinks("Coca-Cola", 3.20, 2, false, true, false);
        Drinks Pirinsko = new Drinks("Pirinsko", 1.19, 0.5, false, true, true);

        FantastikoProducts.add(OlympusMilk);
        FantastikoProducts.add(LacrimaCheese);
        FantastikoProducts.add(CocaCola);
        FantastikoProducts.add(Pirinsko);

        Store Fantastiko = new Store("Fantastiko", FantastikoProducts, 400);

        ArrayList<Product> LidlProducts = new ArrayList<Product>();
        Dairy YellowCheeseMadjarov = new Dairy("Madjarov", 2.6, 0.3, false, 6);
        Meat ChickenGradus = new Meat("Gradus", 10, 1, false, "Chicken");
        Wheat BreadBurgas = new Wheat("burgas", 21, 67, false, true);
        Drinks BeerKamenitza = new Drinks("kamenitza", 84, 35, false, true, true);

        LidlProducts.add(YellowCheeseMadjarov);
        LidlProducts.add(ChickenGradus);
        LidlProducts.add(BreadBurgas);
        LidlProducts.add(BeerKamenitza);

        Store Lidl = new Store("lidl", LidlProducts, 200);

        ArrayList<Product> BillaProducts = new ArrayList<>();
        Meat BeefGradus = new Meat("gradus", 76, 31, true, "Beef");
        Meat PorkGradus = new Meat("gradus", 34, 4, true, "Pork");
        Drinks WaterDevin = new Drinks("devin", 23, 67, false, false, false);
        Dairy CottageCheeseOlympus = new Dairy("olympus", 65, 35, false, 3);

        BillaProducts.add(BeefGradus);
        BillaProducts.add(PorkGradus);
        BillaProducts.add(WaterDevin);
        BillaProducts.add(CottageCheeseOlympus);

        Store Billa = new Store("billa", BillaProducts, 100);

        ArrayList<Store> LocalStores = new ArrayList<>();
        LocalStores.add(Fantastiko);
        LocalStores.add(Lidl);
        LocalStores.add(Billa);
        Area Centre = new Area(LocalStores);

        Scanner myObj = new Scanner(System.in);
        String input;
        int budget;

        while (true) {
            System.out.println("Enter your budget: ");
            input = myObj.nextLine();
            if (TryParseInt(input)) {
                budget = Integer.parseInt(input);
                Budget MonthlyBudget = new Budget(budget);
                MonthlyBudget.Calculate();
                break;
            } else {
                System.out.println("Invalid input, try again.");
            }
        }
            Centre.CheapestStore();
            Centre.NearestStore();
            Centre.CheapestProduct();
        }
    }

