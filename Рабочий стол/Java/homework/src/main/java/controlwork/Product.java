package controlwork;

public class Product {

    private int productId;
    private String name;
    private int frequencyOfLoss;

    public Product(int productId, String name, int frequencyOfLoss) {
        this.productId = productId;

        this.name = name;
        this.frequencyOfLoss = frequencyOfLoss;

    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFrequencyOfLoss() {
        return frequencyOfLoss;
    }

    public void setFrequencyOfLoss(int frequencyOfLoss) {
        this.frequencyOfLoss = frequencyOfLoss;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", frequencyOfLoss=" + frequencyOfLoss +
                '}';
    }
}
