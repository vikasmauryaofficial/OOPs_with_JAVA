@FunctionalInterface
interface MyInterface {

    void display();
}

public class FunctionalInterfaceE {

    public static void main(String[] args) {

        MyInterface obj = () -> {
            System.out.println("Hello from Lambda");
        };

        obj.display();
    }
}