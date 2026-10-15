package assignmentDay3;

class Animals {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dogs extends Animals {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

class Puppy extends Dogs {
    void weep() {
        System.out.println("Puppy is weeping.");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Puppy myPuppy = new Puppy();
        myPuppy.eat();  // Inherited from Animal
        myPuppy.bark(); // Inherited from Dog
        myPuppy.weep(); // Defined in Puppy
    }
}
