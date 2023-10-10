public class Player {
    private final String NAME;
    private double balance;
    GamingCard gamingCard;

    // Player class' constructor
    Player(String name, double balance) {
        this.NAME = name;
        this.balance = balance;

        System.out.println("Player " + this.NAME + " created with balance " + this.balance);
    }

    // Method for creating a gaming card
    public void createGamingCard(double balance){
        // Check if the player already has a gaming card
        if (this.gamingCard != null) {
            System.out.println("Player " + this.NAME + " already has a gaming card!");
            return;
        }

        // Check it the player has enough balance to create a gaming card
        if (balance > this.balance) {
            System.out.println("Insufficient funds!");
            return;
        }

        // Decree the player's balance based on the balance passed
        this.balance -= balance;

        // After the balance is decreed, create a gaming card, passing the decreed balance
        this.gamingCard = new GamingCard(balance);

        System.out.println("Gaming card given to player " + this.NAME);
        System.out.println("Player's actual balance: " + this.balance);
    }

    public void addFunds(double amount) {
        // Check if the player has a gaming card
        if (this.gamingCard == null) {
            System.out.println("Player " + this.NAME + " doesn't have a gaming card!");
            return;
        }

        // Add funds to the player's gaming card
        this.gamingCard.addBalance(amount);

        // Decree the player's balance based on the amount passed
        this.balance -= amount;

        System.out.println("Player's actual balance: " + this.balance);
    }
}
