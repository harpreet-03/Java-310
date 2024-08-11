/*
Exception: An Exception is an event that occurs when a program is executed disrupting the normal flow of instructions.

Try-Catch Block: 
-------------------

- The try block is used to enclose the code that might throw an exception. The catch block is used to handle the exception. The try block must be followed by either catch or finally block or both.


*/

public class tryCatch {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        try{

            int c = a / b;
            System.out.println("The result is: " + c);
        }
        catch(Exception e) {
            System.out.println("We failed to divide!");
            System.out.println("Reason " + e);
        }

        System.out.println("\nProgram finished!");
    }
}