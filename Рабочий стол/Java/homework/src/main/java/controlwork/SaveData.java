package controlwork;



import java.io.*;

public class SaveData extends ToyStore{


    public static void saveData() {
        String fileName = "drawingProduct.txt";
        try {
            OutputStream f = new FileOutputStream(fileName, true);
            OutputStreamWriter writer = new OutputStreamWriter(f);
            BufferedWriter out = new BufferedWriter(writer);
            for (int i = 0; i < draws.size(); i++) {
                out.write((String) draws.get(i)+ "\n");
                out.flush();
            }
        }

        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
