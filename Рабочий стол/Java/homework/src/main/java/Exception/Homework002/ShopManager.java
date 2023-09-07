package Exception.Homework002;

import static Exception.Homework002.PaidProduct.paidProducts;

public class ShopManager {
    public static double purchaseProduct(int productId, int quantity) throws ProductNotFoundException {
        Product product = ProductDatabase.getProduct(productId);
        double totalPrice = product.getPrice() * quantity;
        return totalPrice;
    }
    public static void implementationProduct(int productId, int quantityPaid){
        try {
            Product product = ProductDatabase.getProduct(productId);
            if (product.getQuantity() > quantityPaid) {
                product.setQuantity(product.getQuantity() - quantityPaid);
                PaidProduct paidProduct = new PaidProduct(productId, ProductDatabase.getProduct(productId).getName(), quantityPaid, ProductDatabase.getProduct(productId).getPrice());
                paidProducts.add(paidProduct);
                System.out.println("Продукт: " + ProductDatabase.getProduct(productId).getName() + " в количестве: " + quantityPaid + " реализован.");
            }
            else {
                throw new ProductNotQuantityException("Товара нет в нужном количестве");
            }
        }
        catch (ProductNotFoundException exception){
            System.out.println("ProductNotFoundException: " + exception.getMessage());
        }
        catch (ProductNotQuantityException exception){
            System.out.println("ProductNotQuantityException: " + exception.getMessage());
        }
        }

    public static void deliveryProduct(int productId, int quantityDelivery) {
        try {


            for (int i = 0; i < paidProducts.size(); i++) {
                if (paidProducts.get(i).getProductId() == productId) {
                    DeliveredProduct deliveredProduct = new DeliveredProduct(productId, paidProducts.get(i).getName(), quantityDelivery, paidProducts.get(i).getPrice());
                    if (paidProducts.get(i).getQuantity() > quantityDelivery) {
                        paidProducts.get(i).setQuantity(paidProducts.get(i).getQuantity() - quantityDelivery);
                        System.out.println("Продукт: " + paidProducts.get(i).getName() + " в количестве: " + quantityDelivery + " доставлен.");
                    }
                    else {
                        throw new ProductNotQuantityException("Товар не реализован в нужном количестве");
                    }
                }

            }
        }
catch (ProductNotQuantityException exception){
    System.out.println("ProductNotQuantityException: " + exception.getMessage());
}
    }
}
