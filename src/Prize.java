public class Prize {
    private final String NAME;

    private final int PRICE;

    private final String CATEGORY;

    public Prize(String name, int price, String category) {
        this.NAME = name;
        this.PRICE = price;
        this.CATEGORY = category;
    }

    public String getInfo() {
        return "Prize: " + this.NAME + " | Price: " + this.PRICE + " | Category: " + this.CATEGORY;
    }

    public String getName() {
        return this.NAME;
    }


    public int getPRICE() {
        return this.PRICE;
    }

    public String getNAME() {
        return this.NAME;
    }
}
