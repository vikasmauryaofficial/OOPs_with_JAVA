record Student(String name, int age) {}

public class RecordExample {

    public static void main(String[] args) {

        Student s = new Student("Vikas",25);

        System.out.println(s.name());
        System.out.println(s.age());
    }
}