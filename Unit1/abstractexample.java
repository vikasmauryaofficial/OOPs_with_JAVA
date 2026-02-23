abstract class vehicle{

    abstract void start();  // no body
    void fuel(){
System.out.println("fuel");
        }
}
class car extends vehicle{
    void start(){
System.out.println("car start hai");
    }
}
class bike extends vehicle{
    void start(){
        System.out.println("bike  start hai");
    }
}
public class abstractexample {
    public static void main(String[] args) {
        

        vehicle v1=new car();
        v1.start();
        v1.fuel();

        vehicle v2=new bike();
        v2.start();
    }
    
}
 