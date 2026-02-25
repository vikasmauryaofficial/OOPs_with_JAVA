@FunctionalInterface 
interface MyfunctionInterface{
    void sayhello();// abstract method 
}
public  class test{
    public static void main(String[] args) {
        MyfunctionInterface obj=()->{// lambda expression //(parameter)->{body}
            System.out.println("hello ");

        };
        obj.sayhello();
    }
}

