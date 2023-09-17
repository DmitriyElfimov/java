package controlwork;

import java.util.Scanner;

public class ToyStore extends DataBaseProduct{
    public static void main(String[] args) {
        DataBaseProduct.addDataBaseProduct(new Product(1,"Конструктор", 2));
        DataBaseProduct.addDataBaseProduct(new Product(2, "Робот", 2));
        DataBaseProduct.addDataBaseProduct(new Product(3, "Кукла", 6));

//        System.out.println(dataBaseProduct);
//        System.out.println(dataBaseProductFrequencyOfLoss);
//        System.out.println(frequencyOfLoss);
        DataBaseProduct.generateFrequencyOfLoss();
//        System.out.println(frequencyOfLoss);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество розыгрышей: ");
        int numberOfDraws = scanner.nextInt();
        DataBaseProduct.drawingProduct(numberOfDraws);
        SaveData.saveData();


    }
}
