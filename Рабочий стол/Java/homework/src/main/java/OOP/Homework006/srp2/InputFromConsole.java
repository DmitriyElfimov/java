package OOP.Homework006.srp2;

import java.util.Scanner;

public interface InputFromConsole {

    static Scanner scanner = new Scanner(System.in);
    static String clientName = processInput("Имя клиента: ");
    static String product = processInput("Продукт: ");
    static int qnt = Integer.parseInt(processInput("Кол-во: "));
    static double price = Double.parseDouble(processInput("Цена: "));




    public static String processInput(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }


    void inputData(String clientName, String product, int qnt, double price);
}
