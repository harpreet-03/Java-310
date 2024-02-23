package Java.OOPs.Anonymous_Obj;
/*
 * n Java, anonymous objects are objects that are instantiated without assigning them to a variable. They are typically used for short-lived objects that are used only once and don't need to be referenced elsewhere in the code.
 * 
 * When dealing with anonymous objects in Java, here are some important points to remember:

1. **No Reference:** Anonymous objects are created without assigning them to a reference variable. This means you cannot refer to them elsewhere in the code.

2. **One-time Use:** They are typically used for one-time operations where creating a named object would be unnecessary or cumbersome.

3. **Short-lived:** Anonymous objects are short-lived and are eligible for garbage collection as soon as they are no longer in use.

4. **Conciseness:** They can help in writing more concise code, especially for small tasks or method chaining.

5. **Readability:** While they can make code more concise, excessive use of anonymous objects might reduce code readability, so use them judiciously.

6. **Method Chaining:** They are often used in method chaining, where multiple method calls are chained together in a single line.

7. **Parameter Passing:** They can be passed as arguments to methods or constructors.

8. **Initialization Blocks:** They can be used in initialization blocks for setting up objects without the need for a named variable.

Remembering these points will help you use anonymous objects effectively in your Java code.
 */


class Calculate{
    int a;

    public Calculate(int a){
        this.a = a;
    }

    void area() {
        int area = a * a;
        System.out.println("Area: " + area);
    }

    void paramter(int b) {
        int paramter = 4 * b;
        System.out.println("Paramter: " + paramter);
    
    }
    
}

public class intro {
    public static void main(String[] args) {
        // Anonymous Object - object created in heap memeory and donot have any refernce to that object


        // new Calculate(5) ;
        new Calculate(10).area();
        new Calculate(10).paramter(5);

       
    }    
}
