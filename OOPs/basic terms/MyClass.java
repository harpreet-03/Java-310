/*

In this example, staticMethod() cannot access instanceVariable directly, but instanceMethod() can access both staticVariable and instanceVariable. 
 
*/



public class MyClass {
    static int staticVariable = 10;
    int instanceVariable = 20;

    public static void staticMethod() {

        // Static method can access only static variables
        System.out.println("Static variable: " + staticVariable);

        //----------------------------------------------------------

        // the code below: This will cause a compilation error because staticMethod() cannot access instanceVariable directly
        // System.out.println("Instance variable: " + instanceVariable);
    }

    public void instanceMethod() {

        // Instance method can access both static and instance variables
        System.out.println("Static variable: " + staticVariable);
        System.out.println("Instance variable: " + instanceVariable);
    }

    public static void main(String[] args) {
        staticMethod(); // Call static method directly
        
        MyClass myObject = new MyClass();
        myObject.instanceMethod(); // Call instance method using an object
        
    }
}
