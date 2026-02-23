import java.io.FileReader;
import java.io.IOException;

public class CharReadExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("charfile.txt");

            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }

            fr.close();
        } 
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
