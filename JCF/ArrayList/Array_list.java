import java.util.ArrayList;

public class Array_list {
    public static void main(String[] args) {
        // we use ArrayList class to implement the functionality of resizable array.
        // It is found in the java.util package.
        // It provides us with dynamic arrays in Java.
        // Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed.
        


        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        System.out.println(list);

        // Adding elements at a specific index
        list.add(2, "Java");
        System.out.println(list);

        // Removing elements
        list.remove(1);
        System.out.println(list);

        // Getting elements
        System.out.println(list.get(1));  // Output: World

        // setting elements
        list.set(1, "Python");
        System.out.println(list);   // Output: [Hello Python]

        // size()
        System.out.println(list.size());  // Output: 2

        // Checking if an element exists
        System.out.println(list.contains("Hello"));  // Output: true

    }
}