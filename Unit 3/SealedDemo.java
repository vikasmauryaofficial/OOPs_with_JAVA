
sealed class Shape permits circle, Rectangle {}

final class circle extends Shape{}
final class Rectangle extends Shape{}

public class SealedDemo{
    public static void main(String[] args) {
        Shape s=new circle();

        System.out.println("sealed class demo running");
    }
}