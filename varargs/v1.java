/*
 * 
 In Java, varargs (variable arguments) allow methods to accept a variable number of arguments of a specified type. This is particularly useful when you want a method to be able to handle an arbitrary number of arguments without having to explicitly define an array parameter.
 * 
 */



 /*
In this example, the add() method accepts an arbitrary number of integer arguments. You can pass any number of integers to this method, and it will print them out along with the total count of arguments.

IMP:
------> 
Varargs is particularly handy when you're working with methods that can accept a variable number of parameters, like printf method in System.out. It allows for cleaner and more flexible method invocation. 

*/
class Test {
    public int add(int... n) {

        int sum = 0;
        for (int i : n) {
            sum += i;
        }
        return sum;
    }

}

public class v1 {
    public static void main(String[] args) {
        Test obj1 = new Test();
        // System.out.println(obj1.add(10, 20)); //30
        System.out.println(obj1.add(2, 3, 4, 5, 6, 7)); // 27

    }
}
