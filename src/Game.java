public class Game {
    private final String NAME;

    private final int PRICE;

    private final double REWARD;

    public Game(String name, int price, double reward) {
        this.NAME = name;
        this.PRICE = price;
        this.REWARD = reward;
    }

    public String getInfo() {
        return "Game: " + this.NAME + " | Price: " + this.PRICE + " | Reward: " + this.REWARD;
    }
}
