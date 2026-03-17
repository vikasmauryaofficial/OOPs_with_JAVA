class Test {

    @Deprecated
    void oldMethod() {
        System.out.println("This method is deprecated");
    }

    void newMethod() {
        System.out.println("This is new method");
    }
}

public class DeprecatedE {

    public static void main(String[] args) {

        Test t = new Test();

        t.oldMethod();
        t.newMethod();
    }
}