package OOP.Homework006.srp2;

import static OOP.Homework006.srp2.InputFromConsole.*;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Введите заказ:");
        Order order = new Order(clientName,product,qnt,price);
        order.inputData(clientName,product,qnt,price);
//        System.out.println(order);
        order.saveData(clientName,product,qnt,price);



    }
}
