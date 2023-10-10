public class Main {
    public static void main(String[] args) throws Exception{
        Prize teddyBear = new Prize("Teddy Bear", 1000, "plushies");
        Prize fuzzyDices = new Prize("Fuzzy Dices", 50000, "accessories");
        Prize chefKnife = new Prize("Chef Knife", 20000, "tools");
        Prize funnyRobot = new Prize("Funny Robot", 15000, "toys");
        Prize gamingChair = new Prize("Gaming Chair", 100000, "furniture");

        Player player = new Player("John", 100);
        player.createGamingCard(40);
        player.addPointsToGamingCard(40000);


        Game game = new Game("Attack of the Duke", 10, 100);
        player.play(game);

        player.buyPrize(chefKnife);
    }
}