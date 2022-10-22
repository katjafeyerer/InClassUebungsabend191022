public class DemoOrderApp {
    public static void main(String[] args) {
        
        OrderLine mobilePhone = new OrderLine("Mobile Phone X7", 100, 1);
        OrderLine displaySaver = new OrderLine("Display Saver", 15, 2);
        OrderLine mobileCase = new OrderLine("Case", 20, 1);
        
        OrderLine[] arrayOrderLines = {mobilePhone, displaySaver, mobileCase};
        System.out.println("arrayOrderLines.length = " + arrayOrderLines.length);
        
        Order order4711 = new Order("AT0004711", arrayOrderLines);
        
        order4711.printBestellung();
        System.out.println("order4711.getTotalCosts() = " + order4711.getTotalCosts());
    }
}
