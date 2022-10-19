public class DemoApp {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Card card = new Card(5, "red");
        System.out.println(card.toString()); // durch to-String schneller bei der Überprüfung
    }
}
