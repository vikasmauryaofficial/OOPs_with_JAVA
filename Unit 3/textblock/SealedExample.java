sealed class Vehicle permits Car, Bike {

}

final class Car extends Vehicle {

}

final class Bike extends Vehicle {

}

public class SealedExample {

    public static void main(String[] args) {

        System.out.println("Sealed Class Example");
    }
}