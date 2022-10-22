// Uebungsblatt OOP -> Uebungsbeispiel 2

public class OrderLine {

    //Attribute
    private String name;
    private double price;
    private int amount;

    // Constructor
    public OrderLine(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    // Getter Methode
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    //To-String
    public double getCosts() {
        return price * amount;

    }
    @Override
    public String toString() {
        return "OrderLine{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
