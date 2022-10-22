public class DemoApp {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Card card = new Card(5, "red");
        System.out.println(card.toString()); // durch to-String schneller bei der Überprüfung

        Card[] array = new Card[8];
        CardStack cardStack = new CardStack(array);

        cardStack.push(new Card(3, "yellow"));
        cardStack.push(card); // weil bereits gespeichert im Code
        cardStack.push(new Card(7, "green"));

        Card c1 = cardStack.pop();
        System.out.println("c1 : " + c1);
    }

}
