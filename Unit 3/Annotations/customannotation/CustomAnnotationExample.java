import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String value();
}
class TestClass {

    @MyAnnotation(value = "Hello Annotation")
    public void show() {
        System.out.println("Method executed");
    }
}
public class CustomAnnotationExample {
    public static void main(String[] args) {
        TestClass obj = new TestClass();
        obj.show();
    }
}