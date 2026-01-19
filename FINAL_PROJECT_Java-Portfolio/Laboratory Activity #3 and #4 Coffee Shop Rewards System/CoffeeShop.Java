public class CoffeeShop {

    public static void main(String[] args) {

        // 1. Create customers
        Customer c1 = new Customer("Joseph", 200);
        Customer c2 = new Customer("Peter");
        Customer c3 = new Customer();

        // 2. Peter’s transactions
        c2.addPoints(200); // pastries and beverages
        c2.addPoints(20);  // water

        // 3. Redeem rewards
        c1.redeemReward();
        c2.redeemReward();
        c3.redeemReward();

        // 4. Display customer info
        c1.displayCustomerInfo();
        c2.displayCustomerInfo();
        c3.displayCustomerInfo();

        Customer.displayTotalCustomers();

        // 5. Fourth customer
        Customer c4 = new Customer("Diane");
        c4.addPoints(50);

        Customer.displayTotalCustomers();

        // 6. Allowed rewards redemption
        Customer.getAllowedRewardsRedemption(c1);
        Customer.getAllowedRewardsRedemption(c2);
        Customer.getAllowedRewardsRedemption(c3);
        Customer.getAllowedRewardsRedemption(c4);
    }
}
