import java.lang.annotation.*;

@Target(ElementType.TYPE_USE)
@interface MyAnnotation {}

public class TypeAnnotation {

    public static void main(String[] args) {

        // Annotation applied to type
        @MyAnnotation String name = "Vikas";

        System.out.println(name);
    }
}