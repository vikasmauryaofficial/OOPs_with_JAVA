//super class
class Person{
    String name;
    int age;
    void displayPerson(){
        System.out.println("name"+name);
        System.out.println("age"+age);
    }
}
//sub class
class Student extends Person{
    int rollno;
    void displaystudent(){
        System.out.println("rollno"+rollno);
        
    }

}

public class main {
    public static void main(String[] args) {
        Student s=new Student();
        s.name="abc";
        s.age=27;

        s.rollno=101;

        s.displayPerson();
        s.displaystudent();
        
    }
    
}
