public class Main {
    public static void main(String[] args) {
        Player player = new Player("John", 100);
        player.createGamingCard(40);
        player.addFunds(20);

        Prize prize = new Prize("Teddy Bear", 100, "plushies");
        prize.getInfo();
    }
}