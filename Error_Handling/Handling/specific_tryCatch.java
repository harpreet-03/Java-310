import java.util.Scanner;

public class specific_tryCatch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 99;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index: ");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with: ");
        int number = sc.nextInt();

        try {
            System.out.println("The value at array index entered is: " + marks[ind]);
            System.out.println("The value of the array-value divided by the number is: " + marks[ind] / number);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Length 5");
            System.out.println("Reason: " + e);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0 or -ve");
            System.out.println("Reason: " + e);
        }
        catch(Exception e){
            System.out.println("Other Exception occured");
            System.out.println("Reason: " + e);
        }
        finally{
            System.out.println("The program has been executed successfully");
        }

    }
}
