public class CardStack {
    private Card[] cards;
    private int counter;

    public CardStack(Card[] cards) {
        this.cards = cards;
        this.counter = -1;
        // this, wenn eine Namensgleichheit vorhanden (sonst kann ich das weglassen (Variable und Attribut gleich
        // --> deshalb schreiben)

    }
    public void push(Card newCard) {
        // cards.length == 2
        if(cards.length > counter + 1) {
            counter++;
            cards[counter] = newCard;
        } else {
            System.out.println("Stack ist voll." + newCard);
        }



    }
    public Card pop(){
        Card result = cards[counter];
        counter--;
        return result;
    }
}

