import java.util.ArrayList;
import java.util.Collection;

public class collectioninterface {
    public static void main(String[] args) {
        Collection<String> fruits=new ArrayList<>();

        fruits.add("a");
        fruits.add("b");
        fruits.add("c");
        fruits.add("d");

        System.out.println("fruits"+fruits);

        System.out.println(fruits.size());
         

    }

}
