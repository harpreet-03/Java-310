
/*
 * 
 In Java, the instanceof operator is used to test whether an object is an instance of a particular class or interface. It returns true if the object is an instance of the specified class or interface, or one of its subclasses/interfaces; otherwise, it returns false.

 instanceof Operator is used to check whether an object is an instance of a particular class or not

 Syntax : 
    object instanceof class/interface

 Example:

    class Animal {}
    class Dog extends Animal {}
    class Cat extends Animal {}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();
        
        System.out.println(a instanceof Animal); // true
        System.out.println(d instanceof Dog);     // true
        System.out.println(c instanceof Cat);     // true
        
        System.out.println(a instanceof Dog);     // false
        System.out.println(d instanceof Animal); // true
    }
}



 * 
 */

class Animal {

}

class Dog extends Animal {

}

public class Basic {
    public static void main(String[] args) {
        // String name = "Hello";

        // boolean a = name instanceof String;
        // System.out.println(a);

        // Basic obj = new Basic();
        // boolean b = obj instanceof Basic;
        // System.out.println(b);

        Dog d1 = new Dog();
        System.out.println(d1 instanceof Dog); // true
        System.out.println(d1 instanceof Animal); // true
    }
}
