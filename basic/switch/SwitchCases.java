
import java.util.*;
public class SwitchCases {

    public static void main(String[] args) {
        // int n = 1;
        // switch(n) {
        //     case 1: System.out.println("Monday");
        //     break;
        //     case 2: System.out.println("Tuesday");
        //     break;
        //     case 3: System.out.println("Wed");
        //     break;
        //     else{
        //         System.out.println("Another day!");
            
        //     }
        // }

        String n = "friday";
        
        switch (n) {
            case "monday":
            case "tuesday":
            case "saturday":
            case "sunday":
                System.out.println("No classes");
                break;
                
            default:
                System.out.println("Classes will be there");
                break;
        }



            // if we donot want to use break statement
            // we can use arrow operator(->)
    }


    
}
