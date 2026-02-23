import java.io.*;
public class thmain {
       static void readFile() throws IOException{
        FileReader fr=new FileReader("text.txt");
        System.out.println("file open ");
   }
    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Exception handled:"+e.getMessage());
        }
    }
    
}
