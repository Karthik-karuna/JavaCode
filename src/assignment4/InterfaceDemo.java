package assignment4;

interface Animal {
    void sound();
    void eat();
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks: Woof Woof");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats bones");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows: Meow Meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat drinks milk");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        System.out.println("--- Dog Behavior ---");
        myDog.sound();
        myDog.eat();

        System.out.println("\n--- Cat Behavior ---");
        myCat.sound();
        myCat.eat();
    }
}
