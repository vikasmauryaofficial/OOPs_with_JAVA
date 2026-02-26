
import java.util.Base64;


 
public class base64encode {
public static void main(String[] args) {
    
String original="vikas123";

String encoded=Base64.getEncoder().encodeToString(original.getBytes());
System.out.println("encoded"+encoded);

byte[] decodebyte=Base64.getDecoder().decode(encoded);

String decoded=new String(decodebyte);

System.out.println("decoded"+decoded);

}

    
}
