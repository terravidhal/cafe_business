import java.util.ArrayList;

public class CafeUtil {

    // Ninja Bonus: Add a parameter, numWeeks
    public int getStreakGoal(int numWeeks) {
        int sum = 0;

        for (int i = 0; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal() {
        double sumPrice = 0;
        double[] arrayPrice = { 65.5, 5.4, 15.6, 2.3 };

        for (int i = 0; i < arrayPrice.length; i++) {
            sumPrice += arrayPrice[i];
        }
        return sumPrice;
    }

    public void displayMenu() {
        ArrayList<String> menuItems = new ArrayList<String>();

        menuItems.add("drip coffee");
        menuItems.add("cappuccino");
        menuItems.add("latte");
        menuItems.add("mocha");

        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    ArrayList<String> customers = new ArrayList<String>();

    public void addCustomer() {
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.println("Hello " + username + " !");
        System.out.println("There are " + customers.size() + " people(s) in front of you");
        customers.add(username);
        System.out.println("Lists of Customers :" + customers);
    }

    // Ninja Bonuses!
    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println("\n" + product + "\n");
        for (int i = 1; i <= maxQuantity; i++) {
            System.out.println(i + " - " + "$" + (price * i));
            // Ninja bonus 2:
            System.out.format("%d - $%.2f\n", i, (price * i)); // integer variable is %d, float variable is %f (2f =>
                                                                     // two decimales)
        }
    }

    // Ninja bonus 3:
    public void printPriceChartDiscount(String product, double price, int maxQuantity) {
        System.out.println("\n" + product + "\n");
        for (int i = 1; i <= maxQuantity; i++) {
            System.out.format("%d - $%.2f\n", i, ((price * i) - (0.50 * (i - 1))));
        }
    }

    public boolean displayMenu(ArrayList<String> menuItemss, ArrayList<Double> prixx) {
        if (menuItemss.size() != (prixx.size())) {
            return false;
        }
        else{
            for (int i = 0; i < menuItemss.size(); i++) {
                System.out.format("%d %s -- $%.2f\n", i, menuItemss.get(i), prixx.get(i));
            }
        }
        return true;
    }


    //Ninja Bonus 4!
    ArrayList<String> customerss = new ArrayList<String>();
    public void addCustomers() {
        while (true) {
            System.out.println("Please enter a name (q to quit):");
            String name = System.console().readLine();  

            if (name.equals("q")) {
                break;
            }

            customerss.add(name);
        }
        System.out.println("Lists of Customers :" + customerss);
    }
   
}

