
/*
 * In Java, multiple inheritance, where a class can inherit from more than one class, is not directly supported. This was a design choice made to avoid the complexities and ambiguities that can arise from multiple inheritance, such as the diamond problem.

However, Java provides a mechanism for achieving similar functionality using interfaces. An interface in Java is like a contract that defines a set of methods that a class implementing the interface must provide. By implementing multiple interfaces, a class can effectively achieve what's known as "multiple inheritance of type" or "interface inheritance."
 * 
 */

interface A {
    void methodA();
}

interface B {
    void methodB();
}

class MyClass implements A, B {
    public void methodA() {
        System.out.println("Method A");
    }

    public void methodB() {
        System.out.println("Method B");
    }
}

public class Multiple_Inh {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodA();
        obj.methodB();
    }
}

/*
 * 
 * n this example, MyClass implements both interfaces A and B, effectively
 * inheriting from both "types." This allows MyClass to provide implementations
 * for both methodA() and methodB().
 * 
 * So, while Java doesn't support multiple inheritance of state (i.e.,
 * inheriting fields and implementation details from multiple classes), it does
 * support multiple inheritance of type through interfaces.
 */