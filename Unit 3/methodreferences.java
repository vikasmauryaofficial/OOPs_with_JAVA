import java.util.Arrays;
import java.util.List;

public class methodreferences {
    public static void main(String[] args) {
        
        List<String> names=Arrays.asList("vikas","rahul","aman");

        //lambda expressionn

        names.forEach(name->System.out.println(name));

        //method references
//without

//system.out.println(names);
//name(system.out::println);
//name.foreach(system.out::println);
        names.forEach(System.out::println); //classname::methodreference
    
    }
}


