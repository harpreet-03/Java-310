//upcasting - 


class A{
    void show() {
        System.out.println("B");
    }
}

class B extends A{
    
    
}
public class poly {
    public static void main(String[] args) {
        // Compiler time / early binding
        // Run time / late binding
        

        A obj1 = new B(); // upcasting
    //if the refernece variable of parent class refers to object of child class , then it is called Upcasting.

        obj1.show(); // B
    }
}
