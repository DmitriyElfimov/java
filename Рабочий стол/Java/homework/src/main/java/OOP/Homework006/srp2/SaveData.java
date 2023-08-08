package OOP.Homework006.srp2;

import java.io.FileWriter;
import java.io.IOException;

public class SaveData {
    String clientName = Order.clientName;
    String product = Order.product;
    int qnt = Order.qnt;
    double price = Order.price;

    public void saveData(String clientName, String product, int qnt, double price) {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ clientName + "\",\n");
            writer.write("\"product\":\""+ product +"\",\n");
            writer.write("\"qnt\":"+ qnt +",\n");
            writer.write("\"price\":"+ price +"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
