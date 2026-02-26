interface  myinterface{
    void show();

    default void display(){

        System.out.println("default");
    }
}

class demo implements myinterface{

    public void show(){

        System.out.println("hello ");
    }
}
public class default1{
    public static void main(String[] args) {
        demo obj=new demo();
        obj.show();
        obj.display(); 
    }
    
}
