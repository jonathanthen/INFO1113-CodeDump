public class CardGame {
    private String name;
    private int players;
    private boolean fun;
    private int cardDecks;
    public int cardsRemaining;
    private String instructions;

    public CardGame(String name, int players, boolean fun, int cardDecks, String instructions) {
        this.name = name;
        this.players = players;
        this.fun = fun;
        this.cardDecks = cardDecks;
        this.cardsRemaining = 52 * cardDecks;
        this.instructions = instructions;
    }

    public String getName() {
        return name;
    }
    public int getPlayers() {
        return players;
    }
    public boolean isFun() {
        return fun;
    }
    public int getCardDecks() {
        return cardDecks;
    }
    public int getCardsRemaining() {
        return cardsRemaining;
    }
    public String getInstructions() {
        return instructions;
    }

    public boolean canDrawCard(int nCards) {
        int c = cardsRemaining = nCards;
        if (c < 0) {
            return false;
        }
        return true;
    }


}