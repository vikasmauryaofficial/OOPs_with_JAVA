import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("ArrayList: " + numbers);
        System.out.println("Element at index 1: " + numbers.get(1));
        numbers.set(1, 100);
        System.out.println("After update: " + numbers);
        numbers.remove(0);
        System.out.println("After remove: " + numbers);
        System.out.println("Size: " + numbers.size());
    }
}