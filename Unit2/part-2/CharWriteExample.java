import java.io.FileWriter;
import java.io.IOException;

public class CharWriteExample {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("charfile.txt");

            fw.write("Hello Java Character Stream!");
            fw.close();

            System.out.println("Data written successfully!");
        } 
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
