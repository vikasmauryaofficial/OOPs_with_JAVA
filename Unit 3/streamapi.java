import java.util.Arrays;
import java.util.List;


public class streamapi {
    public static void main(String[] args) {
        

        List<Integer> numbers=Arrays.asList(10,20,30,40,50);

        numbers.stream().filter(n->n>25)
        .map(n->n*2)
        .forEach(System.out::println);   
    }
}
Collection->stream->intermediate->t->res  //pipeline

list-stream()->map()->forEach->