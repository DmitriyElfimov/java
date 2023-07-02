import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class testFiles {
    public static void main(String[] args) {
        char[] chars = null;
        try {
            File student;
            student = new File("student");
            if (!student.exists()) {
                String s = "Empty";
                FileWriter writer = new FileWriter(student);
                writer.write(s);
                writer.close();
            } else {
                FileReader reader = new FileReader(student);
                chars = new char[(int) student.length()];
                reader.read(chars);
            }
        } catch (IOException e) {
        System.out.println("There is an exception!)");
        }

        System.out.println(chars);

        String srt = new String(chars);
        String[] split = srt.split(" ");

        StringBuilder builder = new StringBuilder();
        builder.append("Студент ");
        builder.append(split[1]);
        builder.append(" получил ");
        builder.append(split[3]);
        builder.append(" по предмету ");
        builder.append(split[5]);
        builder.append(".");
        System.out.println(builder);

        StringBuilder builder2 = new StringBuilder();
        builder2.append("Студент ");
        builder2.append(split[7]);
        builder2.append(" получил ");
        builder2.append(split[9]);
        builder2.append(" по предмету ");
        builder2.append(split[11]);
        builder2.append(".");
        System.out.println(builder2);

        StringBuilder builder3 = new StringBuilder();
        builder3.append("Студент ");
        builder3.append(split[13]);
        builder3.append(" получил ");
        builder3.append(split[15]);
        builder3.append(" по предмету ");
        builder3.append(split[17]);
        builder3.append(".");
        System.out.println(builder3);
    }
}
