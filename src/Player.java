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

    /* Void methods */

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

    /* Returning methods */

    public String getInfo() {
        // Check if the player has a gaming card
        if (this.gamingCard == null) {
            return "Player: " + this.NAME + " | Balance: " + this.balance + " | NO GAMING CARD";
        }
        // Return the player's info and print the gaming card's info
        return "Player: " + this.NAME + " | Balance: " + this.balance + " | Gaming Card's Balance: " + this.gamingCard.getBalance() + " | Gaming Card's points: " + this.gamingCard.getPoints();
    }

    public void play(Game game)  throws Exception{
        // Check if the player has a gaming card
        if (this.gamingCard == null) {
            System.out.println("Player " + this.NAME + " doesn't have a gaming card!");
            return;
        }

        // Get variables from the game instance
        String name = game.getNAME();
        int price = game.getPRICE();
        int reward = game.getREWARD();

        // Check if the player has enough points to play
        if (this.gamingCard.getPoints() < price) {
            System.out.println("Insufficient points!");
            return;
        }

        // Default playing message
        System.out.println("Player " + this.NAME + " played " + name + "...");

        // Decree the player's points
        this.gamingCard.decreeBalance(price);

        Thread.sleep(1500);

        // Run a coin flip to check if the player won or not
        int coinFlip = (int) Math.round(Math.random());

        // Add the reward to the player's gaming card if the coin flip is 1
        if (coinFlip == 1) {
            this.gamingCard.addPoints(reward);
            System.out.println("You won!");
            System.out.println("Liquid profits: " + (reward - price));
        }
        else {
            System.out.println("You lost!");
            System.out.println("Losses: " + price);
        }
    }
}
