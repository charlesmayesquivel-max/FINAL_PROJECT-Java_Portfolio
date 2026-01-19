public class Customer {

    // Instance variables
    private String name;
    private int points;

    // Static variable
    private static int totalCustomers = 0;

    // Default constructor
    public Customer() {
        this.name = "Guest";
        this.points = 0;
        totalCustomers++;
    }

    // Parameterized constructor (name only)
    public Customer(String name) {
        this.name = name;
        this.points = 0;
        totalCustomers++;
    }

    // Parameterized constructor (name and points)
    public Customer(String name, int points) {
        this.name = name;
        this.points = points;
        totalCustomers++;
    }

    // Instance method
    public void addPoints(int points) {
        this.points += points;
    }

    // Instance method
    public void redeemReward() {
        if (points >= 100) {
            points -= 100;
            System.out.println(name + " redeemed a free drink!");
        } else {
            System.out.println(name + " does not have enough points to redeem.");
        }
    }

    // Instance method
    public void displayCustomerInfo() {
        System.out.println("Name: " + name + ", Points: " + points);
    }

    // Static method
    public static void displayTotalCustomers() {
        System.out.println("Total Customers: " + totalCustomers);
    }

    // Static method (Requirement #6)
    public static void getAllowedRewardsRedemption(Customer c) {
        int times = c.points / 100;
        System.out.println(c.name + " can redeem " + times + " free reward(s).");
    }
}
