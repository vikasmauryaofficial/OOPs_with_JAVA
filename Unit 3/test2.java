interface add{
    int sum(int a, int b);
}
public class test2 {
    public static void main(String[] args) {
        
    add obj=(a,b)->a+b;
    System.out.println(obj.sum(5,3));
}
}
