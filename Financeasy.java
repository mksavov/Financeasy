import java.util.ArrayList;
import java.util.Scanner;

public class Financeasy {
    public static  void main (String[] args) {
        ArrayList<Product> asd = new ArrayList<Product>();
        Dairy milk = new Dairy("Olympus", 4, 3, false, 1.7f);
        Dairy cheese = new Dairy("Lacrima", 3.5, 0.4, false, 4);
        Drinks coke = new Drinks("Coca-Cola", 3.20, 2, false, true, false);
        Drinks beer = new Drinks("Pirinsko", 1.19, 0.5, false,true,true);

        asd.add(milk);
        asd.add(cheese);
        asd.add(coke);
        asd.add(beer);

        Store s1 = new Store("Fantastiko", asd, 400);

        ArrayList<Product> asd1 = new ArrayList<Product>();
        Dairy yellowcheese = new Dairy("Madjarov", 2.6, 0.3, false, 6);
        Meat chicken = new Meat("Gradus", 10, 1, false, "Chicken");
        Product pp3 = new Product("name22", 21, 67, false);
        Product pp4 = new Product("name23", 84, 35, false);

        asd1.add(pp1);
        asd1.add(pp2);
        asd1.add(pp3);
        asd1.add(pp4);

        Store s2 = new Store("lidl", asd1,200);

        ArrayList<Product> asd2 = new ArrayList<Product>();
        Product ppp1 = new Product("name32", 76, 31, true);
        Product ppp2 = new Product("name321", 34, 4, true);
        Product ppp3 = new Product("name322", 23, 67, false);
        Product ppp4 = new Product("name323", 65, 35, false);

        asd2.add(ppp1);
        asd2.add(ppp2);
        asd2.add(ppp3);
        asd2.add(ppp4);

        Store s3 = new Store("billa", asd2,100);

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





    }
}
