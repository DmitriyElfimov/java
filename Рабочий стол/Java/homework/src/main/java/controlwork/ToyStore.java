package controlwork;

import java.util.Scanner;

public class ToyStore extends QueueDraw{
    public static void main(String[] args) {
        DataBaseProduct.addDataBaseProduct(new Product(1,"Конструктор", 2));
        DataBaseProduct.addDataBaseProduct(new Product(2, "Робот", 2));
        DataBaseProduct.addDataBaseProduct(new Product(3, "Кукла", 6));


        DataBaseProduct.generateFrequencyOfLoss();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество розыгрышей: ");
        int numberOfDraws = scanner.nextInt();
        DataBaseProduct.drawingProduct(numberOfDraws);// здесь без очереди с помощью генератора случайных чисел в %
        SaveData.saveData();
        QueueDraw.testDraws();// очередь и запись в другой файл
        while (!test.isEmpty()){
            System.out.println(test.poll());
        }




    }
}
