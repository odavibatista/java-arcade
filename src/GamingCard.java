public class GamingCard {
    private double balance;
    private int points;

    public GamingCard(double balance, int points) {
        this.balance = balance;
        this.points = points | 10;
    }

    public GamingCard(double balance) {
        this.balance = balance;
        this.points = 10;
    }

    public void decreeMoney(double amount) {
        // Check if amount is greater than balance
        if (amount > this.balance) {
            System.out.println("Insufficient funds!");
            return;
        }
        // Amount is less than balance
        this.balance -= amount;
        // Success message
        System.out.println("Balance decreed: " + amount);
    }

    // Method for adding funds to the card's balance
    public void addBalance(double amount) {
        // Add funds to the card's balance
        this.balance += amount;
        // Success message
        System.out.println("Balance added: " + amount);
    }

    public void addPoints(double moneySpent) {
        decreeMoney(moneySpent);
        // Add points to this.points
        this.points += (int) moneySpent;
        // Success message
        System.out.println("Points added: " + moneySpent);
    }

    public void decreePoints(double points) {
        // Check if points is greater than this.points
        if (points > this.points) {
            System.out.println("Insufficient points!");
            return;
        }
        // Success if points is less than this.points
        this.points -= (int) points;
        // Success message
        System.out.println("Points decreed: " + points);
    }
}
