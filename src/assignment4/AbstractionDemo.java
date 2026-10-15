package assignment4;

abstract class Vehicle {
    // Abstract method (no body)
    abstract void start();

    // Concrete/Normal method
    void stop() {
        System.out.println("Vehicle stopped safely.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a push button ignition.");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a kick or self-start button.");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        System.out.println("--- Car ---");
        myCar.start();
        myCar.stop();

        System.out.println("\n--- Bike ---");
        myBike.start();
        myBike.stop();
    }
}
