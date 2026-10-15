package assignment4;

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Runtime Polymorphism (Upcasting)
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        shape1.draw(); // Calls Circle's draw()
        shape2.draw(); // Calls Rectangle's draw()
    }
}
