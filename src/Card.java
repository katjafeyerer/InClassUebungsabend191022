public class Card {
    private int value;
    private String colour;

    //Getter-Methoden
    public int getValue() {
        return value;
    }

    public String getColour() {
        return colour;
    }

    // toString-Methode
    public String toString() {
        return "Card{" +
                "value=" + value +
                ", colour='" + colour + '\'' +
                '}';
    }

    // Constructor
    public Card(int value, String colour) {
        if(value < 1 || value >9) {
            System.out.println("Nicht erlaubter Wert" + value);
            return;
        }
        if(colour.equals("blue") || colour.equals("green") || colour.equals("red") || colour.equals("yellow")) {
            // bei Strings immer equals-Methode anwenden
            this.value = value;
            this.colour = colour;
        } else {
            System.out.println("Nicht erlaubte Farbe: " + colour);
        }

    }
}
