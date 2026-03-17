import java.io.*;

public class TryWithResourceExample {
    public static void main(String[] args) {

        try(FileReader fr = new FileReader("test.txt")) {

            int ch;
            while((ch = fr.read()) != -1) {
                System.out.print((char)ch);
            }

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}