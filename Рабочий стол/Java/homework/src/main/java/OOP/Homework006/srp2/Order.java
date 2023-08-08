package OOP.Homework006.srp2;

public class Order extends SaveData implements InputFromConsole {



    static String clientName;
    static String product;
    static int qnt;
    static double price;


    public Order(String clientName, String product, int qnt, double price) {
        this.clientName = InputFromConsole.clientName;
        this.product = InputFromConsole.product;
        this.qnt = InputFromConsole.qnt;
        this.price = InputFromConsole.price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "clientName='" + clientName + '\'' +
                ", product='" + product + '\'' +
                ", qnt=" + qnt +
                ", price=" + price +
                '}';
    }


    @Override
    public void inputData(String clientName, String product, int qnt, double price) {

    }


}
