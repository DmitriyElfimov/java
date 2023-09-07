package Exception.Homework002;

import java.util.Scanner;

public class OnlineShopUI extends ShopManager{
    public static void main(String[] args) throws ProductNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product ID: ");
        int productId = scanner.nextInt();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        double totalPrice = ShopManager.purchaseProduct(productId, quantity);
        System.out.println("Total price: $" + totalPrice);

        System.out.print("Enter product ID paid: ");
        int productIdPaid = scanner.nextInt();
        System.out.print("Enter quantity paid: ");
        int quantityPaid = scanner.nextInt();
        ShopManager.implementationProduct(productIdPaid, quantityPaid);

        System.out.print("Enter product ID delivery: ");
        int productIdDelivery = scanner.nextInt();
        System.out.print("Enter quantity delivery: ");
        int quantityDelivery = scanner.nextInt();
        ShopManager.deliveryProduct(productIdDelivery, quantityDelivery);
    }
}

