package assignmentDay3;

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is riding.");
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println("Car Actions:");
        myCar.start();
        myCar.drive();

        Bike myBike = new Bike();
        System.out.println("\nBike Actions:");
        myBike.start();
        myBike.ride();
    }
}
