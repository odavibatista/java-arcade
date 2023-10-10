public class Main {
    public static void main(String[] args) throws Exception{
        Player player = new Player("John", 100);
        player.createGamingCard(40);
        player.addFunds(20);

        Prize prize = new Prize("Teddy Bear", 100, "plushies");
        prize.getInfo();

        Game game = new Game("Attack of the Duke", 10, 100);
        player.play(game);
    }
}