import java.util.*;

public class ForEachExample2 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10,20,30,40);

        numbers.forEach(System.out::println);
    }
}