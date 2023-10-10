public class Prize {
    private final String NAME;

    private final int PRICE;

    private final String CATEGORY;

    public Prize(String name, int price, String cathegory) {
        this.NAME = name;
        this.PRICE = price;
        this.CATEGORY = cathegory;
    }

    public String getInfo() {
        return "Prize: " + this.NAME + " | Price: " + this.PRICE + " | Category: " + this.CATEGORY;
    }
}
