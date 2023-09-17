package controlwork;

import java.io.*;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDraw extends DataBaseProduct{
    static Queue<String> test = new PriorityQueue<>();
    static void testDraws(){
        String fileName = "drawingProductQueue.txt";
        try {
            OutputStream f = new FileOutputStream(fileName, true);
            OutputStreamWriter writer = new OutputStreamWriter(f);
            BufferedWriter out = new BufferedWriter(writer);
        for (int i = 0; i<dataBaseProduct.size(); i++){
            for(int j = 0; j <dataBaseProduct.get(i).getFrequencyOfLoss(); j++){
                test.add(dataBaseProduct.get(i).getName());
                out.write((String) dataBaseProduct.get(i).getName() + "\n");
                out.flush();
            }
        }



            }

            catch (IOException ex) {
                System.out.println(ex.getMessage());
            }



    }

}
