
class Animal{
    void eat() {
        System.out.println("I can Eat");
    }
}

class Dog extends Animal{
    void bark() {
        System.out.println("I can Bark");
    }
}

public class Inheritance_first {
    public static void main(String[] args) {
        Dog dog = new Dog();
        // Dog class is extending the Animal class so it can also access the member func of Animal Class

        dog.eat();
        dog.bark();
    }
}
