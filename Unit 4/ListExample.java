import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++"); 
        list.add("Java");
        System.out.println("List: " + list);
        System.out.println("Element at index 1: " + list.get(1));
        list.set(2, "JavaScript");
        System.out.println("Updated List: " + list);
        list.remove(0);
        System.out.println("After removal: " + list);
    }
}