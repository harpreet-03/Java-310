
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


class babyDog extends Dog {
    void weep() {
        System.out.println("I can weep");
    }
}

public class Multi_level {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        babyDog d2 = new babyDog();

        d1.bark(); // Dog class object cannot access weep() bcz a parent cannot be able to access its child methods.

        
        d2.weep();
        
    }
}
