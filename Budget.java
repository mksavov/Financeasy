import java.util.Scanner;
public class Budget {
    float money;

    Budget (float money) {
        this.money = money;
    }
    Budget () {
        money = 0;
    }
    void Calculate() {
        Scanner myObj = new Scanner(System.in);
        String input;

        do {
            System.out.println("Choose model: minimum, average, maximum, write 'exit' to exit the program: ");
            input = myObj.nextLine();
            if (input.equals("minimum")) {
                System.out.println("needs: " + money*(30.0f/100.0f)+ ", wants: " + money*(10.0f/100.0f) + ", savings/taxes: " + money*(60.0f/100.0f) + "\n");
            } else if (input.equals("average")) {
                System.out.println("needs: " + money*(50.0f/100.0f) + ", wants: " + money*(30.0f/100.0f) + ", savings/taxes: " + money*(20.0f/100.0f) + "\n");
            } else if (input.equals("maximum")) {
                System.out.println("needs: " + money*(30.0f/100.0f) + ", wants: " + money*(50.0f/100.0f) + ", savings/taxes: " + money*(20.0f/100.0f)+ "\n");
            }
        } while (!input.equals("exit"));
    }
        public String toString() {
        return "budget: " + money;
        }
}
