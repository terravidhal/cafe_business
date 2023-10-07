import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {
       // Make an instance of CafeUtil to access all its methods.
        CafeUtil cafeJava = new CafeUtil();

        //methods
        int testGetStreakGoal = cafeJava.getStreakGoal(10);
        double testGetOrderTotal = cafeJava.getOrderTotal();
        
        
        
        //show methods
        System.out.println("\n============== testGetStreakGoal ================");
        System.out.println("Purchases needed by week 10: " + testGetStreakGoal);
        //=========================================================================
        System.out.println("\n============== testGetOrderTotal ================");
        System.out.println("Order Total : " + testGetOrderTotal);
        //=========================================================================
        System.out.println("\n============== testDisplayMenu ================");
        cafeJava.displayMenu();
        //=========================================================================
        System.out.println("\n============== testAddCustomer ================");
        // --- Test 4 times ---
        for (int i = 0; i < 1; i++) {
            cafeJava.addCustomer();
            System.out.println("\n");
        }
        //=============================================================================================
        System.out.println("\n============== testPrintPriceChart ================");
        cafeJava.printPriceChart("Columbian Coffee Grounds", 15.0, 3);
        //=============================================================================================
        System.out.println("\n============== testPrintPriceChartDiscount ================");
        cafeJava.printPriceChartDiscount("Columbian Coffee Grounds", 2.00, 4);
        //==============================================================================================
        //==============================================================================================
        System.out.println("\n============== testdisplayMenu ================");
        //
        ArrayList<String> menuItemss = new ArrayList<String>();
        ArrayList<Double> prixx = new ArrayList<Double>();
        menuItemss.add("drip coffee");
        menuItemss.add("cappucino");
        menuItemss.add("latte");
        menuItemss.add("mocha");
        prixx.add(1.50);
        prixx.add(3.50);
        prixx.add(4.50);
        prixx.add(3.50);
        System.out.println(cafeJava.displayMenu(menuItemss, prixx));
        //==============================================================================================
        System.out.println("\n============== testAddCustomers ================");
        cafeJava.addCustomers();
    }
}
