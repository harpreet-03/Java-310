
/*
 * Abstraction: Abstraction is a process of hiding the implementation and showing only functionality to the user.
 * 
 * An abstract class can have abstract and non-abstract(Concrete)  methods.
 * 
 * It cannot be instantiated
 * 
 * If subclass is extended from abstarct class, it must define the abstract methods of parent class.
 * 
 * abstarct modifier is not applicable for the variables.
 * eg: abstract int = 8; [ this is not applicable]
 * 
 * I cannot make abstract method private.
 * 
 * we can create constructors in abstract class
 * 
 */

// user is only shown the functionality and doesn't shown how things are working behind the scene.
// Tv remote : 67    we're pressing a volume button and volume is basially increased but we donot know how it works behind the scene.
//means, a user is not shown the implementation.

abstract class Car {
    // abstract method can only be defined inside an abstract class.
    // It's not compulsory to have abstract methods inside the abstract class.

    abstract void acceleration();

    void playMusic() {
    } // Concrete methods
    /*
     * In Java, concrete methods refer to methods that have a complete
     * implementation and are not declared as abstract. Concrete methods provide the
     * actual code that performs a specific action within a class. They contrast
     * with abstract methods, which are declared without an implementation and must
     * be implemented by subclasses.
     */

}

class Ford extends Car {
    /*
     * if parent class is an abstract class then a child class must define their
     * mehtods.
     * it is compulsory to define the abstract mehtod of parent class int the the
     * child class
     * 
     */
    void acceleration() {
        System.out.println("Ford is accelerating");
    }

}

class Tata extends Car {
    void acceleration() {
        System.out.println("Tata is accelerating");
    }

}

public class abstarct_classes {
    public static void main(String[] args) {

        // we cannot create Objects of Abstract Class

        // In Java, upcasting refers to the process of casting an object to one of its
        // supertypes.This means converting an object of a subclass type to an object of
        // a superclass type.

        Car obj = new Ford();
        obj.acceleration();
        obj.playMusic();

        Car obj1 = new Tata();
        obj1.acceleration();

    }
}
