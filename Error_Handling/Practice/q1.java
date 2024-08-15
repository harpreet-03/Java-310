/*

2) Write a java program that prints "HaHa" during Arithmetic exception and "HeHe" during an Illegal argument exception.
 
 * 
 */
public class q1 {
    public static void main(String[] args) {
        try{
            int a = 666/1;
        }
        catch (IllegalArgumentException e){
            System.out.println("HeHe");
        }
        catch (ArithmeticException e){
            System.out.println("Haha");
        }

    }
}
