import java.util.ArrayList;
import java.util.Scanner;

public class Financeasy {
    public static void main(String[] args) {
        ArrayList<Product> asd = new ArrayList<Product>();
        Dairy milk = new Dairy("Olympus", 4, 3, false, 1.7f);
        Dairy cheese = new Dairy("Lacrima", 3.5, 0.4, false, 4);
        Drinks coke = new Drinks("Coca-Cola", 3.20, 2, false, true, false);
        Drinks beer = new Drinks("Pirinsko", 1.19, 0.5, false, true, true);

        asd.add(milk);
        asd.add(cheese);
        asd.add(coke);
        asd.add(beer);

        Store s1 = new Store("Fantastiko", asd, 400);

        ArrayList<Product> asd1 = new ArrayList<Product>();
        Dairy yellowcheese = new Dairy("Madjarov", 2.6, 0.3, false, 6);
        Meat chicken = new Meat("Gradus", 10, 1, false, "Chicken");
        Wheat bread = new Wheat("burgas", 21, 67, false, true);
        Drinks beer1 = new Drinks("kamenitza", 84, 35, false, true, true);

        asd1.add(yellowcheese);
        asd1.add(chicken);
        asd1.add(bread);
        asd1.add(beer1);

        Store s2 = new Store("lidl", asd1, 200);

        ArrayList<Product> asd2 = new ArrayList<Product>();
        Meat beef = new Meat("gradus", 76, 31, true, "Beef");
        Meat pork = new Meat("gradus", 34, 4, true, "Pork");
        Drinks water = new Drinks("devin", 23, 67, false, false, false);
        Dairy cottage = new Dairy("olympus", 65, 35, false, 3);

        asd2.add(beef);
        asd2.add(pork);
        asd2.add(water);
        asd2.add(cottage);

        Store s3 = new Store("billa", asd2, 100);

        ArrayList<Store> st = new ArrayList<Store>();
        st.add(s1);
        st.add(s2);
        st.add(s3);
        Area a1 = new Area(st);

        Scanner myObj = new Scanner(System.in);
        String input;

        System.out.println("Enter your budget: ");
        input = myObj.nextLine();
        Budget b = new Budget(Integer.parseInt(input));
        b.Calculate();
        a1.CheapestStore();
        a1.NearestStore();
        a1.CheapestProduct();
    }
}
