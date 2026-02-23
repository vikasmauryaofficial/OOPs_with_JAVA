import java.io.*;

public class FileCopyExample {
    public static void main(String[] args) {

        try (
            FileInputStream fis = new FileInputStream("source.txt");
            FileOutputStream fos = new FileOutputStream("destination.txt")
        ) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
