import java.util.*;

public class ForEachExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Vikas", "Rahul", "Aman");

        names.forEach(name -> System.out.println(name));
    }
}