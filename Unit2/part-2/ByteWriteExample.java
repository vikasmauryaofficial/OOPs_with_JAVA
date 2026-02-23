
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteWriteExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("bytefile.txt");

            String data = "Hello Java Byte Stream!";
            byte[] byteData = data.getBytes();   

            fos.write(byteData);   
            fos.close();

            System.out.println("Data written successfully!");
        } 
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
