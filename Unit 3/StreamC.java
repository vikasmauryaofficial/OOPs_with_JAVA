import java.util.*;
import java.util.stream.*;

public class StreamC {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 20, 30);

        System.out.println("Original List:");
        numbers.forEach(System.out::println);

        System.out.println("\nFilter > 20:");
        numbers.stream()
                .filter(n -> n > 20)
                .forEach(System.out::println);

        System.out.println("\nMap (Multiply by 2):");
        numbers.stream()
                .map(n -> n * 2)
                .forEach(System.out::println);

        System.out.println("\nDistinct Values:");
        numbers.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("\nSorted Descending:");
        numbers.stream()
                .sorted((a, b) -> b - a)
                .forEach(System.out::println);

        System.out.println("\nCount > 20:");
        long count = numbers.stream()
                .filter(n -> n > 20)
                .count();
        System.out.println(count);

        System.out.println("\nSum using Reduce:");
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        System.out.println("\nMax Value:");
        int max = numbers.stream()
                .max(Integer::compare)
                .get();
        System.out.println(max);

        System.out.println("\nCollect to List:");
        List<Integer> collected = numbers.stream()
                .filter(n -> n > 20)
                .collect(Collectors.toList());
        System.out.println(collected);
    }
}