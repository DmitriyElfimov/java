package controlwork;

import Exception.Homework002.ProductDatabase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class DataBaseProduct{
    public static List<Product> dataBaseProduct = new ArrayList<>();

    public static List<Integer> dataBaseProductId = new ArrayList<>();
    public static List<String> dataBaseProductName = new ArrayList<>();
    public static List<Integer> dataBaseProductFrequencyOfLoss = new ArrayList<>();


    public static List<Integer> frequencyOfLoss = new ArrayList<>(Collections.nCopies(100,0));
    static int sum = 0;
    static int m = 0;



    public static void addDataBaseProduct (Product product) {
        dataBaseProduct.add(product);
        dataBaseProductId.add(product.getProductId());
        dataBaseProductName.add(product.getName());
        dataBaseProductFrequencyOfLoss.add(product.getFrequencyOfLoss());
    }

    public static void generateFrequencyOfLoss(){
        for (int k = 0; k < dataBaseProductFrequencyOfLoss.size(); k++) {
            sum += dataBaseProductFrequencyOfLoss.get(k);
        }
        for (int j = 0; j<dataBaseProductFrequencyOfLoss.size(); j++){
            if (j>0) m = m + dataBaseProductFrequencyOfLoss.get(j-1)*100/sum;
            for (int i = 0; i < dataBaseProductFrequencyOfLoss.get(j) * 100 / sum; i++){
                frequencyOfLoss.set(m+i, dataBaseProductId.get(j));
            }
        }

    }
    public static List draws = new ArrayList<>();

public static void drawingProduct (int numberOfDraws){
        for (int i = 1; i<=numberOfDraws; i++){
            int numb = new Random().nextInt(0,100);
            System.out.println("Приз № " + i + " : " + dataBaseProductName.get(frequencyOfLoss.get(numb)-1));
            draws.add(i-1,"Приз № " + i + " : " +dataBaseProductName.get(frequencyOfLoss.get(numb)-1));

        }
}

}
