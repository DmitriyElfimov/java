package Exception.Homework002;

public class ProductDatabase {
    public static Product getProduct(int productId) throws ProductNotFoundException {
        // Подразумевается обращение к базе данных или хранилищу товаров
        // и получение информации о товаре по его ID
        // В данном примере мы используем заглушку
        if (productId == 1) {
            return new Product(1,"Product 1", 10, 5.99);
        }
        throw new ProductNotFoundException("Товар не найден.");
    }
}
