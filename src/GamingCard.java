public class GamingCard {
    private double balance;
    private int points;

    public GamingCard(double balance, int points) {
        this.balance = balance;
        this.points = points | 10;
    }

    // create a constructor where point is not passed
    public GamingCard(double balance) {
        this.balance = balance;
        this.points = 10;
    }

    public void decreeMoney(double amount) {
        // check if amount is greater than balance
        if (amount > this.balance) {
            System.out.println("Insufficient funds!");
            return;
        }
        // amount is less than balance
        this.balance -= amount;
        // success message
        System.out.println("Balance decreed: " + amount);
    }

    public void addBalance(double amount) {
        // add funds to the card's balance
        this.balance += amount;
        // success message
        System.out.println("Balance added: " + amount);
    }

    public void addPoints(double moneySpent) {
        decreeMoney(moneySpent);
        // convert moneySpent to integer
        int points = (int) moneySpent;
        // add points to this.points
        this.points += (int) moneySpent;
        // success message
        System.out.println("Points added: " + moneySpent);
    }

    public void decreePoints(double points) {
        // check if points is greater than this.points
        if (points > this.points) {
            System.out.println("Insufficient points!");
            return;
        }
        // points is less than this.points
        this.points -= (int) points;
        // success message
        System.out.println("Points decreed: " + points);
    }
}
