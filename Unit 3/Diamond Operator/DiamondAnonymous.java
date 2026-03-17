import java.util.*;

public class DiamondAnonymous {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>() {

            {
                add("Vikas");
                add("Java");
            }
        };

        System.out.println(list);
    }
}