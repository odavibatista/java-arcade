public class Game {
    private final String NAME;

    private final int PRICE;

    private final int REWARD;

    public Game(String name, int price, int reward) {
        this.NAME = name;
        this.PRICE = price;
        this.REWARD = reward;
    }

    public String getInfo() {
        return "Game: " + this.NAME + " | Price: " + this.PRICE + " | Reward: " + this.REWARD;
    }

    public String getNAME() {
        return this.NAME;
    }

    public int getPRICE() {
        return this.PRICE;
    }

    public int getREWARD() {
        return this.REWARD;
    }
}
