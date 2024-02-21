
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

class Tiger extends Animal{
    void roar() {
        System.out.println("I can Roar");
    }
}



public class Hierarchial {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();


        Tiger t1 = new Tiger();
        t1.eat();

        
    }
}
