public class Player {
    private final String NAME;
    private double balance;
    GamingCard gamingCard;

    Player(String name, double balance) {
        this.NAME = name;
        this.balance = balance;

        System.out.println("Player " + this.NAME + " created with balance " + this.balance);
    }

    public void createGamingCard(double balance){
        // check if the player already has a gaming card
        if (this.gamingCard != null) {
            System.out.println("Player " + this.NAME + " already has a gaming card!");
            return;
        }

        // check it the player has enough balance to create a gaming card
        if (balance > this.balance) {
            System.out.println("Insufficient funds!");
            return;
        }

        // decree the player's balance based on the balance passed
        this.balance -= balance;
        this.gamingCard = new GamingCard(balance);

        System.out.println("Gaming card given to player " + this.NAME);
        System.out.println("Player's actual balance: " + this.balance);
    }
}
