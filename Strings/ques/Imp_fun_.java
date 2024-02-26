import java.util.*;

public class Imp_fun_{
    public static void main(String[] args) {
        String s = "Hello";
        //Substirng: 
        System.out.println(s.substring(0, 3));
        System.out.println(s.substring(3));
        System.out.println(s.substring(0, 3).length());
        System.out.println(s.substring(3).length());


        System.out.println();

        //indexOf
        System.out.println(s.indexOf('l'));
        System.out.println(s.indexOf('l', 3));
        System.out.println(s.indexOf("lo"));
        System.out.println(s.lastIndexOf("e"));
    }
}