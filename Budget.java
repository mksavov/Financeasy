import java.util.Scanner;

public class Budget {
    float money;

    Budget(float money) {
        this.money = money;
    }

    Budget() {
        money = 0;
    }

    void Calculate() {
        Scanner myObj = new Scanner(System.in);
        String input;
        int selection;

        do {
            System.out.println("Choose model: 1 - minimum, 2 - average, 3 - maximum, write '0' to exit the program: ");
            input = myObj.nextLine();
            selection = Integer.parseInt(input);
            if (selection == 1) {
                System.out.println("needs: " + money * (30.0f / 100.0f) + ", wants: " + money * (10.0f / 100.0f) + ", savings/taxes: " + money * (60.0f / 100.0f) + "\n");
            } else if (selection == 2) {
                System.out.println("needs: " + money * (50.0f / 100.0f) + ", wants: " + money * (30.0f / 100.0f) + ", savings/taxes: " + money * (20.0f / 100.0f) + "\n");
            } else if (selection == 3) {
                System.out.println("needs: " + money * (30.0f / 100.0f) + ", wants: " + money * (50.0f / 100.0f) + ", savings/taxes: " + money * (20.0f / 100.0f) + "\n");
            }
        } while (selection != 0);
    }

    public String toString() {
        return "budget: " + money;
    }
}
