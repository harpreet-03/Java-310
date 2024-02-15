
/*Random Quote: 
We should forget about small efficiencies, say about 97% of the
time: premature optimization is the root of all evil. Yet we should
not pass up our opportunities in that critical 3%. "

- Donald Knuth
 */

import java.util.*;

public class StringBufferrr {

    public static void main(String[] args) {
        // String builder or String buffer
        // default capacity: 16

        StringBuffer obj1 = new StringBuffer("Hello");
        System.out.println(obj1);
        System.out.println(obj1.length()); // 5
        System.out.println(obj1.capacity()); // 21 [16+5 = 21]

        obj1.append(" World");
        System.out.println(obj1.capacity()); // still : 21

        /*
         * Note: The capacity of a `StringBuffer` doesn't automatically increase to
         * accommodate appended characters. Instead, it increases dynamically as needed.
         * In this case, the capacity remains 21 after appending " World" because the
         * length of the resulting string ("Hello World") is still within the initial
         * capacity.
         * 
         * However, if you keep appending more characters beyond the current capacity,
         * the capacity will increase automatically. For instance, if you were to append
         * a longer string, the capacity would increase to accommodate it. This dynamic
         * resizing ensures that the `StringBuffer` can hold arbitrarily long sequences
         * of characters efficiently.
         */

        System.out.println(obj1); // Hello World
        System.out.println();
        System.out.println();

        // insert
        obj1.insert(5, "Java");
        System.out.println(obj1); // HelloJava World

        // delete
        obj1.delete(5, 9);
        System.out.println(obj1); // Hello World

        // replace
        obj1.replace(6, 11, "Java");
        System.out.println(obj1); // HelloJava World

        // replace

        obj1.reverse();
        System.out.println(obj1); // dlroW avaJolleH

    }
}
